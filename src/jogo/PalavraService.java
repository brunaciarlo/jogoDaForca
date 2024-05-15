package jogo;

import java.util.ArrayList;

import categorias.CategoriasInterface;
import categorias.FabricaCategoria;
import categorias.FabricaCategoria.Categoria;

public class PalavraService {
	
	static Verificacoes verifica = new Verificacoes();
	ArrayList<String> letrasErradas = new ArrayList<String>();
	FabricaCategoria fabrica = new FabricaCategoria();
	CategoriasInterface categoria = null;

	public CategoriasInterface criarCategoria(String opcao) {
		if(opcao.equals("1")) {
			categoria = fabrica.criar(Categoria.Animais);
		}
		if(opcao.equals("2")) {
			categoria = fabrica.criar(Categoria.Comidas);
		}
		if(opcao.equals("3")) {
			categoria = fabrica.criar(Categoria.Geografia);
		}
		if(opcao.equals("4")) {
			categoria = fabrica.criar(Categoria.Esportes);
		}
		return categoria;
	}
	
	public String sortearPalavra(String opcao) {
		criarCategoria(opcao);
		int range = categoria.tamanhoLista();
		int numeroASortear = (int)(Math.random() * range);
		String palavra = categoria.sorteiaPalavra(numeroASortear);
		return palavra;
	}
	
	public ArrayList<String> retornaEspacos(String palavra) {
		
		char[] palavraEmEspacos = palavra.toCharArray();
		ArrayList<String> espacos = new ArrayList<String>();
		
		for(int i = 0; i < palavraEmEspacos.length; i++) {
			espacos.add("_");
		}
		return espacos;
	}
	
	public void exibirPalavra(ArrayList<String> espacos) {
		for (String letra : espacos) {
			System.out.print(letra + " ");
		}
	}
	
	public ArrayList<Integer> retornaIndices(String palavra, String letra){
		ArrayList<Integer> indices = new ArrayList<Integer>();
		char[] palavraArray = palavra.toCharArray();
		char letraProcurada = letra.charAt(0);
		for (int i = 0; i < palavraArray.length; i++) {
            if (palavraArray[i] == letraProcurada) {
                indices.add(i);
            }
        }
		return indices;
	}

	public ArrayList<String> retornaPalavraComAcertos(ArrayList<String> espacos, String letra, ArrayList<Integer> indices){
		
		for(int i = 0; i < espacos.size(); i++) {
			if(indices.contains(i)) {
				espacos.set(i, letra);
			}
		}
		return espacos;
	}

	public ArrayList<String> salvaLetrasErradas(String letra){
		if(!verifica.letraJaDigitada(letrasErradas, letra)) {
			letrasErradas.add(letra);
		}
		return letrasErradas;		
	}
	
	public void exibirLetrasErradas() {
		for (String letra : letrasErradas) {
			System.out.print(letra + ", ");
		}
	}
}