package categorias;

public class Geografia implements CategoriasInterface{
	
	String[] listaGeografia = {"ALEMANHA", "INGLATERRA", "ILHAS", "OCEANO", "BRASIL", "URUGUAI", "ESTONIA", "CONTINENTE",
			"PENINSULA", "LATITUDE", "MONTANHA", "MEXICO", "AUSTRALIA", "PORTUGAL", "CAZAQUISTAO", "DESERTO", "LONGITUDE",
			"HEMISFERIO", "PLANALTO", "ESPANHA", "ARGENTINA", "MARROCOS", "CROACIA", "HOLANDA", "EQUADOR", "SENEGAL",
			"CATAR", "POLONIA", "TUNISIA", "DINAMARCA", "JAPAO", "ESPANHA", "BELGICA", "CANADA", "CAMAROES", "SERVIA"};
	private static Geografia instancia;
	
	private Geografia() {}
	
	public static Geografia getInstancia() {
		if(instancia == null) {
			instancia = new Geografia();
		}
		return instancia;
	}
	
	@Override
	public int tamanhoLista() {
		int tamanhoLista = listaGeografia.length;
		return tamanhoLista;
	}
	
	@Override
	public String sorteiaPalavra(int numSorteado) {
		String palavraSorteada = listaGeografia[numSorteado];
		return palavraSorteada;
	}
	
}