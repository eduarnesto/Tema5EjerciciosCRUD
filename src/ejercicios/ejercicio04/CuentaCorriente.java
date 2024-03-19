package ejercicios.ejercicio04;

public class CuentaCorriente {
	private String dni="";

	private String nombre="";

	private double saldo=0.0;

	public CuentaCorriente(String dni) {

		if(dni != null && !dni.equals("") && saldo > 0) {
			this.dni = dni;
		}

	}

	public CuentaCorriente(String dni, String nombre, double saldo) {

		if(dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if(saldo > 0) {
			this.saldo = saldo;
		}
			
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDni() {
		return dni;
	}
	
	@Override
	public String toString() {
		String cadena ="";
		
		cadena += "DNI: " + this.dni;
		cadena += "\nNombre: " + this.nombre;
		cadena += "\nSaldo: " + this.saldo;
		cadena += "\n----------------------";
		
		return cadena;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean iguales = false;
		
		CuentaCorriente account = (CuentaCorriente) o;
		
		if(this.dni.equals(account.dni)) {
			iguales = true;
		}
		
		return iguales;
	}
	
}
