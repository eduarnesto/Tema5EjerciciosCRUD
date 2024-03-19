package ejercicios.ejercicio03;

/**
 * Contiene la estructura de 
 */
public class Pizza {

	/**
	 * Guarda el codigo del pedido
	 */
	private int codigo;

	/**
	 * Guarda el tamaño de la pizza
	 */
	private String tamanyo = "";

	/**
	 * Guarda el tipo/sabor de la pizza
	 */
	private String tipo = "";

	/**
	 * Guarda el estado del pedido
	 */
	private String estado = "Pedida";

	/**
	 * Constructor sin parámetros
	 */
	public Pizza() {

	}

	/**
	 * Constructor que almacena los datos introducidos del usuario en los atributos
	 * con los que vamos a trabajar
	 * 
	 * @param codigo Codigo del pedido
	 * @param tamanyo Tamanyo de la pizza
	 * @param tipo Tipo/sabor de la pizza
	 * @param estado Estado del pedido
	 */
	public Pizza(int codigo, String tamanyo, String tipo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (tamanyo.equalsIgnoreCase("Mediana") || tamanyo.equalsIgnoreCase("Familiar")) {
			this.tamanyo = tamanyo;
		}
		if (tipo.equalsIgnoreCase("Margarita") || tipo.equalsIgnoreCase("CuatroQuesos")
				|| tipo.equalsIgnoreCase("Funghi"))
			this.tipo = tipo;
	}

	/**
	 * Devuelve el estado del pedido
	 * @return El estado del pedido
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Modifica el estado del pedido
	 * @param estado Estado del pedido
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Devuelve el codigo del pedido
	 * @return El codigo del pedido
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Devuelve el tamaño de la pizza
	 * @return El tamaño de la pizza
	 */
	public String getTamanyo() {
		return tamanyo;
	}

	/**
	 * Devuelve el tipo/sabor de la pizza
	 * @return El tipo de la pizza
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Funcion String que devuelve un listado en formato:
	 * 
	 * "Codigo: 1"
	 * "Tipo: CuatroQuesos"
	 * "Tamanyo: Mediana"
	 * "Estado: Pedida"
	 * 
	 * @return Cadena con el listado de los pedidos
	 */
	@Override
	public String toString() {
		
		String cadena = "";
		
		cadena += "Codigo: " + this.codigo + "\n";
		cadena += "Tipo: " + this.tipo + "\n";
		cadena += "Tamaño" + this.tamanyo + "\n";
		cadena += "Estado: " + this.estado + "\n";
		cadena += "--------------------\n";
		
		return cadena;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean iguales = false;
		
		Pizza pizza2 = (Pizza) obj;
		
		if(this.codigo == pizza2.codigo) {
			iguales = true;
		}
		
		return iguales;
	}
}