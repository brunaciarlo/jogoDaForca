package categorias;

public class FabricaCategoria {
	
	public enum Categoria{
		Animais,
		Comidas,
		Geografia,
		Esportes
	}
	
	public CategoriasInterface criar(Categoria categoria) {
		if(Categoria.Animais == categoria) {
			return Animais.getInstancia();
		}if(Categoria.Comidas == categoria) {
			return Comida.getInstancia();
		}if(Categoria.Geografia == categoria) {
			return Geografia.getInstancia();
		}if(Categoria.Esportes == categoria) {
			return Esportes.getInstancia();
		}else {
	        throw new IllegalArgumentException("Categoria não suportada: " + categoria);
	    }
	}
}