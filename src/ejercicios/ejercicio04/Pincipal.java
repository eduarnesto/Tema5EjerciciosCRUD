package ejercicios.ejercicio04;

import java.util.Scanner;

public class Pincipal {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opc = 0;
		boolean comp = false;
		int cant = 0;
		String nombre = "";
		CuentaCorriente cuenta;

		do {

			menu();
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {

			case 1:
				cuenta = datos();

				comp = Cuentas.anyadirCuenta(cuenta);

				if (comp) {
					System.out.println("Se ha anyadido correctamente");
				} else {
					System.out.println("No se ha anyadido");
				}
				break;
			case 2:
				cuenta = dni();
				nombre = nombreNuevo();

				comp = Cuentas.modificaNombre(cuenta, nombre);

				if (comp) {
					System.out.println("Se ha modificado correctamente");
				} else {
					System.out.println("No se ha modificado");
				}
				break;
			case 3:
				cuenta = dni();
				cant = cantIngYExt();

				comp = Cuentas.sacarDinero(cuenta, cant);

				if (comp) {
					System.out.println("Se ha extraido correctamente");
				} else {
					System.out.println("No se ha extraido");
				}
				break;
			case 4:
				cuenta = dni();
				cant = cantIngYExt();

				comp = Cuentas.ingresarDinero(cuenta, cant);

				if (comp) {
					System.out.println("Se ha ingresado correctamente");
				} else {
					System.out.println("No se ha ingresado");
				}
				break;
			case 5:
				Cuentas.listado();
				break;
			}

		} while (opc != 0);

	}

	static void menu() {
		System.out.println("1. Anyadir cuenta");
		System.out.println("2. Modificar cuenta");
		System.out.println("3. Extraer dinero");
		System.out.println("4. Ingresar dinero");
		System.out.println("5. Listado");
		System.out.println("0. Salir");
	}

	static CuentaCorriente datos() {
		CuentaCorriente cuenta;
		String dni = "";
		String nombre = "";
		double saldo = 0.0;

		System.out.println("Introduce el DNI");
		dni = sc.nextLine();
		System.out.println("Introduce el nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce el saldo");
		saldo = sc.nextDouble();
		sc.nextLine();

		cuenta = new CuentaCorriente(dni, nombre, saldo);

		return cuenta;
	}

	static CuentaCorriente dni() {
		CuentaCorriente cuentaDni;
		String dni = "";

		System.out.println("Introduce el DNI");
		dni = sc.nextLine();

		cuentaDni = new CuentaCorriente(dni);

		return cuentaDni;
	}

	static String nombreNuevo() {
		String nombre = "";

		System.out.println("Introduce el nuevo nombre");
		nombre = sc.nextLine();

		return nombre;
	}

	static int cantIngYExt() {
		int cant;

		System.out.println("Introduzca cantidad");
		cant = sc.nextInt();
		sc.nextLine();

		return cant;
	}
}