package categorias;

public class Animais implements CategoriasInterface{
	
	String[] listaAnimais = {"ABELHA", "BALEIA", "CACHORRO", "ELEFANTE", "PANDA", "MINHOCA", "CAPIVARA", "JOANINHA", "ANDORINHA",
			"BESOURO", "CORUJA", "GALINHA", "GIRAFA", "JACARE", "TUBARAO", "BORBOLETA", "RINOCERONTE", "GOLFINHO",
			"PINGUIM", "JAVALI", "HIENA", "ZEBRA", "CHINCHILA", "CARANGUEJO", "PASSARO", "TARTARUGA", "CAVALO", "RAPOSA"};
	private static Animais instancia;
	
	private Animais() {}
	
	public static Animais getInstancia() {
		if(instancia == null) {
			instancia = new Animais();
		}
		return instancia;
	}
	
	@Override
	public int tamanhoLista() {
		int tamanhoLista = listaAnimais.length;
		return tamanhoLista;
	}
	
	@Override
	public String sorteiaPalavra(int numSorteado) {
		String palavraSorteada = listaAnimais[numSorteado];
		return palavraSorteada;
	}

}