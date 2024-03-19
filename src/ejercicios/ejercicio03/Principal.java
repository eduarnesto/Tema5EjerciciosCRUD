package ejercicios.ejercicio03;

import java.util.Scanner;

public class Principal {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = 0;
		Pizza pedido;
		boolean boo;
		int codigo;

		do {
			menu();
			opc = scan.nextInt();
			scan.nextLine();

			switch (opc) {
			case 1:
				Pedidos.listado();
				break;
			case 2:
				pedido = creaPedido();
				boo = Pedidos.nuevoPedido(pedido);

				if (boo) {
					System.out.println("Se ha añadido el pedido correctamente");
				} else {
					System.out.println("Error con el pedido");
				}
				break;
			case 3:
				System.out.println("Introduce el codigo");
				codigo = scan.nextInt();
				scan.nextLine();

				boo = Pedidos.pizzaServida(codigo);
				if (boo) {
					System.out.println("Pizza servida");
				} else {
					System.out.println("Error al modificar");
				}
				break;
			}

		} while (opc != 4);

		scan.close();

	}

	/**
	 * Crea el menu y lo imprime por pantalla
	 */
	static void menu() {
		System.out.println("=========================");
		System.out.println("1. Listado de pizzas");
		System.out.println("2. Nuevo pedido");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");
		System.out.println("=========================");
	}

	private static Pizza creaPedido() {
		int codigo;
		String tamanyo = "";
		String tipo = "";
		Pizza pedido;

		System.out.println("Codigo del pedido");
		codigo = scan.nextInt();
		scan.nextLine();

		System.out.println("Tamaño de la pizza");
		tamanyo = scan.nextLine();

		System.out.println("Tipo de la pizza");
		tipo = scan.nextLine();

		pedido = new Pizza(codigo, tamanyo, tipo);

		return pedido;
	}
}