package jogo;

import java.util.ArrayList;

public class Verificacoes {
	
	public boolean contemLetra(String palavra, String letra) {

		char[] palavraArray = palavra.toCharArray();
		char letraProcurada = letra.charAt(0);
		boolean contemLetra = false;
		
		for(char letraArray : palavraArray) {
			if(letraArray == letraProcurada) {
				contemLetra = true;
			}
		}
		return contemLetra;
	}
	
	public boolean verificaEntrada(String entrada) {

		boolean eLetra = false;
		char letra = entrada.charAt(0);
		if(Character.isLetter(letra)) {
			eLetra = true;
		}
		return eLetra;
	}
	
	public boolean letraJaDigitada(ArrayList<String> letrasErradas, String entrada) {
		return letrasErradas.contains(entrada);
	}
	
	public boolean palavraAcertada(ArrayList<String> espacos, String palavra) {
		char[] palavraCharArray = palavra.toCharArray();
		ArrayList<String> palavraArray = converterArrayList(palavraCharArray);
		boolean palavraCompleta = false;
		if(espacos.equals(palavraArray)) {
			palavraCompleta = true;
		}
		return palavraCompleta;
	}
	
	public ArrayList<String> converterArrayList(char[] palavra) {
		ArrayList<String> palavraArray = new ArrayList<>();
		
		for(char letra : palavra) {
			palavraArray.add(String.valueOf(letra));
		}
		return palavraArray;		
	}
	
	public boolean numeroValido(String numero) {
		boolean categoriaExiste = false;
		if(numero.equals("1")) {
			categoriaExiste = true;
		}
		else if(numero.equals("2")) {
			categoriaExiste = true;
		}
		else if(numero.equals("3")) {
			categoriaExiste = true;
		}
		else if(numero.equals("4")) {
			categoriaExiste = true;
		}
		
		return categoriaExiste;
	}
}