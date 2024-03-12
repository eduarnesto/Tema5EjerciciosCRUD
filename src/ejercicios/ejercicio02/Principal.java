package ejercicios.ejercicio02;

import java.util.Scanner;

public class Principal {

	// Scanner para leer del teclado
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para guardar la opcion que elija el usuario
		int opc;

		// Bucle que se recorre siempre hasta que presionemos la opcion 7
		do {
			// Llamo al menu
			menu();

			// Leo del teclado
			opc = sc.nextInt();
			sc.nextLine();

			// Realizo la operacion que me ha marcado el usurio
			switch (opc) {
			case 1 -> System.out.println("Saliendo...");
			case 2 -> crearArticulo();
			case 3 -> borrarArticulo();
			case 4 -> modificarArticulo();
			case 5 -> Syso;
			case 6 -> Syso;
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
		
		System.out.println("Introduzca el codigo del articulo que quieres eliminar");
		codigo = sc.nextInt();
		sc.nextLine();
		
		if (Gestisimal.eliminaArticulo(codigo)) {
			System.out.println("El articulo se ha eliminado correctamente");
		} else {
			System.out.println("El articulo no se ha podido eliminar");
		}
	}
	
	public static void modificarArticulo() {
		float precio;
		int codigo;
		
		System.out.println("Introduzca el codigo del articulo que quieres modificar");
		codigo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca el nuevo precio del articulo que quieres modificar");
		precio = sc.nextFloat();
		sc.nextLine();
		
		if (Gestisimal.modificaArticulo(codigo, precio)) {
			System.out.println("El articulo se ha modificado correctamente");
		} else {
			System.out.println("El articulo no se ha modificado eliminar");
		}
	}
}
