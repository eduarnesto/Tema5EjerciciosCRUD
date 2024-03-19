package ejercicios.ejercicio02;

public class Gestisimal {

	public static Articulo[] articulos = new Articulo[20];

	public static boolean alta(Articulo art) {
		boolean anyadido = false;

		// 1º Comprobar si el artículo ya existe
		int i = 0;
		int posEncontrado = buscaArticulo(art.getCodigo());

		// Si no he encontrado el artículo lo tengo que añadir
		if (posEncontrado >= 0) {

			while (i < articulos.length && articulos[i] != null) {
				i++;
			}

			if (i < articulos.length) {
				articulos[i] = art;
				anyadido = true;
			}
		}

		return anyadido;
	}

	private static int buscaArticulo(int codigo) {
		int i = 0;
		int pos = -1;

		while (i < articulos.length && pos == -1) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (articulos[i] != null && articulos[i].getCodigo() == codigo) {
				pos = i;
			}

			i++;
		}

		return pos;
	}

	public static boolean eliminaArticulo(int codigo) {
		boolean eliminado = false;
		int pos = buscaArticulo(codigo);

		if (pos >= 0) {
			articulos[pos] = null;
			eliminado = true;
		}

		return eliminado;
	}

	public static boolean modificaDescripcion(int codigo, String descripcion) {
		boolean modificado = false;
		int pos = buscaArticulo(codigo);

		if (pos >= 0) {
			articulos[pos].setDescripcion(descripcion);
			modificado = true;
		}

		return modificado;
	}
	
	public static boolean modificaPrecioCompra(int codigo, float precio) {
		boolean modificado = false;
		int pos = buscaArticulo(codigo);

		if (pos >= 0) {
			articulos[pos].setPrecioCompra(precio);
			modificado = true;
		}

		return modificado;
	}
	
	public static boolean modificaPrecioVenta(int codigo, float precio) {
		boolean modificado = false;
		int pos = buscaArticulo(codigo);

		if (pos >= 0) {
			articulos[pos].setPrecioVenta(precio);
			modificado = true;
		}

		return modificado;
	}

	public static void entradaArticulo(int codigo, int cantidad) {

		int pos = buscaArticulo(codigo);
		cantidad += articulos[pos].getStock();
		articulos[pos].setStock(cantidad);

	}

	public static boolean salidaArticulo(int codigo, int cantidad) {
		boolean salida = false;
		
		int pos = buscaArticulo(codigo);
		cantidad -= articulos[pos].getStock();
		if (cantidad >= 0) {
			articulos[pos].setStock(cantidad);
			salida = true;
		}

		return salida;
	}

}