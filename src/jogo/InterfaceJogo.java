package jogo;

import java.util.Scanner;

public class InterfaceJogo {
	
	static JogoService jogoService = new JogoService();
	static Verificacoes verifica = new Verificacoes();
	static ContadorTempo contador = new ContadorTempo();

	public static void main(String[] args) {
		
		int erros = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Jogo da Forca");
		System.out.println("Selecione uma categoria:");
		System.out.println("1 - Animais");
		System.out.println("2 - Comida");
		System.out.println("3 - Geografia");
		System.out.println("4 - Esportes");
		System.out.println("5 - Fechar");

		String opcao = scanner.nextLine();
		
		
		if(verifica.numeroValido(opcao)) {
			jogoService.sorteiaPalavra(opcao);
			contador.start();
			jogoService.exibirJogo(0);
		} else if(opcao.equals("5")) {
			System.exit(0);
		} else {
			System.out.println("Categoria não existe.");
			System.exit(0);
		}
		
		while (erros < 6) {
			System.out.println("");
			System.out.println("");
			System.out.print("Digite uma letra:");
			String letra = scanner.next().toUpperCase();
			if (verifica.verificaEntrada(letra)) {
				System.out.println("");
				if (!jogoService.verificarLetra(letra)) {
					erros++;
					System.out.println("-------------------------------------");
					System.out.print("Letras erradas: ");
					jogoService.retornaLetrasErradas(letra);
					System.out.println("");
					jogoService.exibirJogo(erros);
				} else {
					System.out.println("-------------------------------------");
					System.out.print("Letras erradas: ");
					jogoService.retornaLetrasErradas();
					System.out.println("");
					jogoService.exibirForca(erros);
					jogoService.letraCorreta(letra);
					if (jogoService.retornaVitoria()) {
						System.out.println("");
						System.out.println("Parabéns, você ganhou!!");
						contador.interrupt();
						System.out.println("Tempo de jogo: " + contador.getSegundos() + " segundos");
						System.exit(0);
					}
				}
			} else {
				System.out.println("Só é permitido digitar letras");
			}
				
				
		} 
		contador.interrupt();
		System.out.println("Game over");
		System.out.println("A palavra era: " + jogoService.palavra);
		
		scanner.close();
	}
}