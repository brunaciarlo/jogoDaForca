package categorias;

public class Esportes implements CategoriasInterface{
	
	String[] listaEsportes = {"FUTEBOL", "BASQUETE", "ATLETISMO", "GINASTICA", "NATACAO", "BASEBALL", "CURLING", 
			"HIPISMO", "CICLISMO", "HOCKEY", "ATACANTE", "GOLEIRO", "VOLANTE", "GREMIO", "PALMEIRAS", "VASCO", 
			"PAYSANDU", "CORINTHIANS", "FLAMENGO", "BOTAFOGO", "CRUZEIRO", "BRAGANTINO", "FORTALEZA", "CRICIUMA",
			"JUVENTUDE", "FLUMINENSE", "VITORIA", "CUIABA", "SANTOS", "SPORT", "GUARANI", "BARCELONA", "LIVERPOOL",
			"ARSENAL", "TOTTENHAM", "CHELSEA", "NEWCASTLE", "SEVILLA", "VILLAREAL"};
	private static Esportes instancia;
	
	private Esportes() {}
	
	public static Esportes getInstancia() {
		if(instancia == null) {
			instancia = new Esportes();
		}
		return instancia;
	}
	
	@Override
	public int tamanhoLista() {
		int tamanhoLista = listaEsportes.length;
		return tamanhoLista;
	}
	
	@Override
	public String sorteiaPalavra(int numSorteado) {
		String palavraSorteada = listaEsportes[numSorteado];
		return palavraSorteada;
	}

}