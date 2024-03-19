package ejercicios.ejercicio03;

public class Pedidos {

	public static Pizza[] pizza = new Pizza[50];
	
	public static void listado() {
		for(Pizza pedido : pizza) {
			if(pedido != null) {
				System.out.println(pedido);
			}
		}
	}
	
	public static boolean nuevoPedido(Pizza pedido) {
		boolean anyadido = false;
		int i = 0;
		int pos = buscaPedido(pedido);
		
		if(pos == -1) {
			
			while(i < pizza.length && pizza[i] != null) {
				i++;
			}
			
			if(i < pizza.length) {
				pizza[i] = pedido;
				anyadido = true;
			}
			
		}
		
		return anyadido;
	}
	
	public static boolean pizzaServida(int codigo) {
		boolean servido = false;
		
		for(Pizza pedido : pizza) {
			if(pedido.getCodigo() == codigo) {
				pedido.setEstado("Servida");
				servido = true;
				break;
			}
		}
		
		return servido;
	}
	
	public static int buscaPedido(Pizza pedido) {
		
		int i = 0;
		int pos = -1;
		
		while(i<pizza.length && pos == -1) {
			if(pizza[i] != null && pizza[i].equals(pedido)) {
				pos = i;
			}
			i++;
		}
		
		return pos;
	}
	
}