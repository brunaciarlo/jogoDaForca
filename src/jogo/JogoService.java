package jogo;

import java.util.ArrayList;

public class JogoService {
	
	static PalavraService palavraService = new PalavraService();
	static ForcaService forcaService = new ForcaService();
	static Verificacoes verifica = new Verificacoes();
	
	String palavra = palavraService.sortearPalavra("1");
	ArrayList<String> espacos = palavraService.retornaEspacos(palavra);
	
	public void sorteiaPalavra(String op) {
		palavra = palavraService.sortearPalavra(op);
		espacos = palavraService.retornaEspacos(palavra);
	}
	
	public void exibirJogo(int erros) {
		forcaService.desenharErros(erros);
		forcaService.desenhaForca();
		palavraService.exibirPalavra(espacos);

	}
	
	public void exibirForca(int erros) {
		forcaService.desenharErros(erros);
		forcaService.desenhaForca();

	}
	
	public boolean verificarLetra(String letra) {
		verifica.verificaEntrada(letra);
		return verifica.contemLetra(palavra, letra);
	}	
	
	public void letraCorreta(String letra) {
		if(verifica.contemLetra(palavra, letra)) {
			ArrayList<Integer> indices = palavraService.retornaIndices(palavra, letra);
			espacos = palavraService.retornaPalavraComAcertos(espacos, letra, indices);
			palavraService.exibirPalavra(espacos);
		}
	}
	
	public void retornaLetrasErradas(String letra) {
		palavraService.salvaLetrasErradas(letra);
		palavraService.exibirLetrasErradas();
	}
	
	public void retornaLetrasErradas() {
		palavraService.exibirLetrasErradas();
	}
	
	public boolean retornaVitoria() {
		boolean jogoGanho = false;
		if(verifica.palavraAcertada(espacos, palavra)) {
			jogoGanho = true;
		}
		return jogoGanho;		
	}
	
}