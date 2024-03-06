package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Array para guardar 30 alumnos
		Alumno[] alumnos = new Alumno[30];
		
		//Boolean para salir del bucle
		boolean salir = false;

		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Repito las intrucciones hasta que el usuario quiera salir
		while (salir) {
			
		}
	}
	
	public void menu() {
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
