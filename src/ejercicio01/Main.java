package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Array para guardar 30 alumnos
		Alumno[] alumnos = new Alumno[30];
		
		//Variable para guardar la opcion que elija el usuario
		int opc;
		
		//Boolean para salir del bucle
		boolean salir = false;

		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Repito las intrucciones hasta que el usuario quiera salir
		while (salir) {
			//Se muestra el menu
			menu();
			
			//Leo del teclado
			opc = sc.nextInt();
			
			//Depende de la opcion elegida se ejecuta 
			switch (opc) {
			case 1 -> System.out.println();
			
			}
		}
		
		//Muestro mensaje para notificar al usuario que ha salido del programa
		System.out.println("Has salido del programa");
		
		//Cierro el Scanner
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
	
	public void listado (Alumno[] alumnos) {
		for (int i=0; i<alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(i + ". " + alumnos[i].toString());
			}
		}
	}

}
