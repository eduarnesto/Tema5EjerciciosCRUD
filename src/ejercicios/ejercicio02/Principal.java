package ejercicios.ejercicio02;

import java.util.Scanner;

public class Principal {

	// Scanner para leer del teclado
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para guardar la opcion que elija el usuario
		int opc;

		// Variable para guardar la opcion al elegir el campo que quieras modificar
		int opcMod;
		
		// Bucle que se recorre siempre hasta que presionemos la opcion 7
		do {
			// Llamo al menu
			menu();

			// Leo del teclado
			opc = sc.nextInt();
			sc.nextLine();

			// Realizo la operacion que me ha marcado el usurio
			switch (opc) {
			case 1:
				listado();
				break;
			case 2:
				crearArticulo();
				break;
			case 3:
				borrarArticulo();
				break;
			case 4:
				menuModificacion();
				opcMod = sc.nextInt();
				sc.nextLine();
				modificarArticulo(opcMod);
				break;
			case 5:
				anyadirStock();
				break;
			case 6:
				retirarStock();
				break;
			}
		} while (opc != 7);

		// Aviso al usuario que ha salido del programa
		System.out.println("Saliendo...");

		// Cierro el Scanner
		sc.close();
	}

	public static void menu() {
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de nercancía");
		System.out.println("7. Salir");
		System.out.println("Elige una opcion");
	}

	public static void menuModificacion() {
		System.out.println("1. Descripcion");
		System.out.println("2. Precio de compra");
		System.out.println("3. Precio de venta");
		System.out.println("Elija el campo que desee modificar");
	}

	private static void listado() {
		for (int i = 0; i < Gestisimal.articulos.length; i++) {
			if (Gestisimal.articulos[i] != null) {
				System.out.println(i + ". " + Gestisimal.articulos[i].toString());
				System.out.println();
			}
		}
	}

	private static int preguntaCodigo() {
		int codigo;
		System.out.println("Introduzca el codigo del articulo que quieres modificar");
		codigo = sc.nextInt();
		sc.nextLine();
		return codigo;
	}

	private static int preguntaCantidad() {
		int cantidad;
		System.out.println("Introduzca la cantidad deseada");
		cantidad = sc.nextInt();
		sc.nextLine();
		return cantidad;
	}

	public static void crearArticulo() {
		int codigo;
		String descripcion;
		float precioCompra;
		float precioVenta;
		int stock;
		Articulo art;

		System.out.println("Introduzca el codigo del articulo");
		codigo = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduzca la descripcion del articulo");
		descripcion = sc.nextLine();

		System.out.println("Introduzca el precio al que ha sido comprado el articulo");
		precioCompra = sc.nextFloat();
		sc.nextLine();

		System.out.println("Introduzca el precio al que se vende el articulo");
		precioVenta = sc.nextFloat();
		sc.nextLine();

		System.out.println("Introduzca el stock del articulo");
		stock = sc.nextInt();
		sc.nextLine();

		art = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);

		if (Gestisimal.alta(art)) {
			System.out.println("Se ha añdido el articulo correctamente");
		} else {
			System.out.println("No se ha podido añadir el articulo");
		}
	}

	public static void borrarArticulo() {
		int codigo;

		codigo = preguntaCodigo();

		if (Gestisimal.eliminaArticulo(codigo)) {
			System.out.println("El articulo se ha eliminado correctamente");
		} else {
			System.out.println("El articulo no se ha podido eliminar");
		}
	}

	public static void modificarArticulo(int opc) {
		String descripcion;
		float precio;
		int codigo;

		codigo = preguntaCodigo();

		switch (opc) {
		case 1:
			System.out.println("Introduzca la nueva descipcion del articulo que quieras modificar");
			descripcion = sc.nextLine();
			if (Gestisimal.modificaDescripcion(codigo, descripcion)) {
				System.out.println("El articulo se ha modificado correctamente");
			} else {
				System.out.println("El articulo no se ha modificado eliminar");
			}
			break;
		case 2:
			System.out.println("Introduzca el nuevo precio de compra del articulo que quieres modificar");
			precio = sc.nextFloat();
			sc.nextLine();
			if (Gestisimal.modificaPrecioCompra(codigo, precio)) {
				System.out.println("El articulo se ha modificado correctamente");
			} else {
				System.out.println("El articulo no se ha modificado eliminar");
			}
			break;
		case 3:
			System.out.println("Introduzca el nuevo precio de venta del articulo que quieres modificar");
			precio = sc.nextFloat();
			sc.nextLine();
			if (Gestisimal.modificaPrecioVenta(codigo, precio)) {
				System.out.println("El articulo se ha modificado correctamente");
			} else {
				System.out.println("El articulo no se ha modificado eliminar");
			}
			break;
		default:
			break;
		}
		
	}

	public static void anyadirStock() {
		int codigo;
		int cantidad;

		codigo = preguntaCodigo();
		cantidad = preguntaCantidad();

		Gestisimal.entradaArticulo(codigo, cantidad);
		System.out.println("El stock del articulo se ha modificado correctamente");
	}

	public static void retirarStock() {
		int codigo;
		int cantidad;

		codigo = preguntaCodigo();
		cantidad = preguntaCantidad();

		if (Gestisimal.salidaArticulo(codigo, cantidad)) {
			System.out.println("El stock del articulo se ha modificado correctamente");
		} else {
			System.out.println("No se ha podido modificar el stock del articulo");
		}
	}
}
