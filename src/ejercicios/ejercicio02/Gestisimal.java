package ejercicios.ejercicio02;

public class Gestisimal {

	public static Articulo[] articulos = new Articulo[20];

	public static boolean alta(Articulo art) {
		boolean anyadido = false;
		
		// 1º Comprobar si el artículo ya existe
		int i = 0;
		int posEncontrado = buscaArticulo(art.getCodigo());

		// Si no he encontrado el artículo lo tengo que añadir
		if(posEncontrado<articulos.length) {
			
			while(i<articulos.length && articulos[i]!=null) {
				i++;
			}
			
			if(i<articulos.length) {
				articulos[i] = art;
				anyadido = true;
			}
		}
		
		return anyadido;
	}
	
	private static int buscaArticulo(int codigo) {
		int i = 0;
		boolean enc = false;

		while (i < articulos.length && !enc) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (articulos[i] != null && articulos[i].getCodigo()==codigo) {
				enc = true;
			}

			i++;
		}
		
		return i;
	}
	
	public static boolean eliminaArticulo (int codigo) {
		boolean eliminado = false;
		int i = buscaArticulo(codigo);
		
		if(i<articulos.length) {
			articulos[i] = null;
			eliminado = true;
		}
		
		return eliminado;
	}
	
	public static boolean modificaArticulo (int codigo, float precio) {
		boolean modificado = false;
		int i = buscaArticulo(codigo);
		
		if(i<articulos.length) {
			articulos[i].setPrecioVenta(precio);
			modificado = true;
		}
		
		return modificado;
	}


}