package ejercicios.ejercicio01;

import java.util.Scanner;

public class Main {

	// Variable para guardar la poscion por la que voy del array de alumnos
	static int posAlum = 0;
	
	// Scanner para leer del teclado
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Array para guardar 30 alumnos
		Alumno[] alumnos = new Alumno[30];

		// Variable para guardar la opcion que elija el usuario
		int opc;

		// Boolean para salir del bucle
		boolean salir = false;

		

		// Repito las intrucciones hasta que el usuario quiera salir
		while (!salir) {
		// Se muestra el menu
		menu();

		// Leo del teclado
		opc = sc.nextInt();

		// Depende de la opcion elegida se ejecuta
		switch (opc) {
		case 1 -> listado(alumnos);
		case 2 -> newAlumno(alumnos); 
		//case 3 -> ; case 4 -> ; case 5 -> ;
		default -> System.out.println("Opción no válida");
		}
		}

		// Muestro mensaje para notificar al usuario que ha salido del programa
		System.out.println("Has salido del programa");

		// Cierro el Scanner
		sc.close();
	}

	public static void menu() {
		System.out.println("----------");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}

	public static void listado(Alumno[] alumnos) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(i + ". " + alumnos[i].toString());
			}
		}
	}
	
	/**
	 * Metodo para obtener los datos de un nuevo alumno que se va a añadir
	 * @param alumnos
	 */
	public static void newAlumno (Alumno[] alumnos) {
		//Variable para guardar el nombre
		String nombre;
		
		//Variable para guardar la nota media
		float notaMedia;
		
		//Variable para detectar la primera posicion del array disponible
		int pos;
		
		//Pregunto por el nombre del alumno
		System.out.println("Introduzca el nombre del alumno");
		
		//Leo del teclado
		nombre = sc.nextLine();
		
		//Pregunto por la nota media
		System.out.println("Introduzca la nota media del examen");
		
		//Leo del teclado
		notaMedia = sc.nextFloat();
		
		//Busco la p
		
		//Llamo al metodo para crear al objeto que guarda al alumno
		addAlumno (alumnos, nombre, notaMedia);
	}

	/**
	 * Metodo que crea un objeto alumno con una serie de parametros de entrada y lo
	 * añade al array donde están almacenados los alumnos
	 * 
	 * @param alumnos Array donde se guardan los alumnos
	 * @param nombre Nombre del alumno
	 * @param notaMedia Nota media del alumno
	 */
	public static void addAlumno(Alumno[] alumnos, String nombre, float notaMedia) {
		// Creo el objeto alumno con el nombre y la ota media que me han pasado
		alumnos[posAlum] = new Alumno(nombre, notaMedia);
	}
	
	public static void modificar (Alumno[] alumnos, String alumno, float notaMedia) {
		//Busco el alumno en la cadena de alumnos
		for (int i=0; i<alumnos.length; i++) {
			if (alumnos[i].getNombre().equals(alumno)) {
				alumnos[i].setNotaMedia(notaMedia);
			}
		}
	}

}
