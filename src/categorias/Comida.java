package categorias;

public class Comida implements CategoriasInterface{
	
	String[] listaComidas = {"ABACATE", "LASANHA", "HAMBURGUER", "OMELETE", "ACARAJE", "FEIJOADA", "CHOCOLATE", "ABACAXI",
			"MORANGO", "GUACAMOLE", "CHURRASCO", "MILHO", "RISOTO", "SALADA", "CENOURA", "YAKISOBA", "RATATOUILLE", "COXINHA",
			"PASTEL", "ESCONDIDINHO", "STROGONOFF", "PANQUECA", "OMELETE"};
	private static Comida instancia;
	
	private Comida() {}
	
	public static Comida getInstancia() {
		if(instancia == null) {
			instancia = new Comida();
		}
		return instancia;
	}
	
	@Override
	public int tamanhoLista() {
		int tamanhoLista = listaComidas.length;
		return tamanhoLista;
	}
	
	@Override
	public String sorteiaPalavra(int numSorteado) {
		String palavraSorteada = listaComidas[numSorteado];
		return palavraSorteada;
	}
}