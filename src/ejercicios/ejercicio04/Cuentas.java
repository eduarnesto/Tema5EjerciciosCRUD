package ejercicios.ejercicio04;

public class Cuentas {
	
public static CuentaCorriente cuentas[] = new CuentaCorriente[20];
	
	public static int buscaCuenta(CuentaCorriente cuenta) {
		int pos = -1;
		int i = 0;
		
		while(i<cuentas.length&&pos == -1) {
			if(cuentas[i]!=null && cuentas[i].getDni().equals(cuenta)) {
				pos = i;
			}
			
			i++;
		}
		
		return pos;
	}
	
	public static int posicionLibre() {
		int pos = -1;
		int i = 0;
		
		while(i < cuentas.length && pos == -1) {
			if(cuentas[i]==null) {
				pos = i;
			}
			i++;
		}
		
		return pos;
	}
	
	public static void listado() {
		for(CuentaCorriente cuenta : cuentas) {
			if(cuenta != null) {
				System.out.println(cuenta);
			}
		}
	}
	
	public static boolean modificaNombre(CuentaCorriente cuenta, String nombre) {
		boolean modificado = false;
		int pos = buscaCuenta(cuenta);
		
		if(pos!=-1) {
			cuentas[pos].setNombre(nombre);
			modificado = true;
		}
		
		return modificado;
	}
	
	public static boolean anyadirCuenta(CuentaCorriente cuenta) {
		boolean anyadido = false;
		int pos = buscaCuenta(cuenta);
		int posLibre = posicionLibre();
		
		if(pos == -1) {
			if(posLibre != -1) {
				cuentas[posLibre] = cuenta;
				anyadido = true;
			}
		}
		
		return anyadido;
	}
	
	public static boolean sacarDinero(CuentaCorriente cuenta, double sacar) {
		
		boolean sacado = false;
		int pos = buscaCuenta(cuenta);
		
		if(pos == -1 &&cuentas[pos].getSaldo() > sacar) {
			cuentas[pos].setSaldo(cuentas[pos].getSaldo() - sacar);
			sacado= true;
		}
		
		
		return sacado;
	}

	public static boolean ingresarDinero(CuentaCorriente cuenta, double ingreso) {
		boolean ingresado = false;
		int pos=buscaCuenta(cuenta);
		
		if(pos == -1) {
			cuentas[pos].setSaldo(cuentas[pos].getSaldo() + ingreso);
			ingresado = true;
		}
		return ingresado;
	}
	
}
