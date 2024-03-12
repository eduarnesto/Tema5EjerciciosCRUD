package ejercicios.ejercicio02;

public class Articulo {
	/**
	 * Atributo unico con el que identificar el articulo
	 */
	private int codigo;

	/**
	 * Descripcion del articulo
	 */
	private String descripcion;

	/**
	 * Precio al que la tienda compra el articulo
	 */
	private float precioCompra;

	/**
	 * Precio al que la tienda vende el articulo
	 */
	private float precioVenta;

	/**
	 * Unidades disponibles del articulo
	 */
	private int stock;

	/**
	 * Constructor con parametros
	 * 
	 * @param codigo       Atributo unico con el que identificar el articulo
	 * @param descripcion  Descripcion del articulo
	 * @param precioCompra Precio al que la tienda compra el articulo
	 * @param precioVenta  Precio al que la tienda vende el articulo
	 * @param stock        Unidades disponibles del articulo
	 */
	public Articulo(int codigo, String descripcion, float precioCompra, float precioVenta, int stock) {
		super();
		if (codigo >= 0)
			this.codigo = codigo;

		if (descripcion != null && !descripcion.equals(""))
			this.descripcion = descripcion;

		if (precioCompra > 0)
			this.precioCompra = precioCompra;

		if (precioVenta > 0)
			this.precioVenta = precioVenta;

		if (stock >= 0)
			this.stock = stock;
	}

	/**
	 * Constructor sin parametros
	 */
	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Devuelve la descripcion del articulo
	 * 
	 * @return Descripcion del articulo
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Cambia la descripcion del articulo
	 * 
	 * @param descripcion Descripcion del articulo
	 */
	public void setDescripcion(String descripcion) {
		if (descripcion != null && !descripcion.equals(""))
			this.descripcion = descripcion;
	}

	/**
	 * Devuelve el precio de compra del articulo
	 * 
	 * @return Precio de compra del articulo
	 */
	public float getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * Cambia el precio de compra del articulo
	 * 
	 * @param precioCompra Precio al que ha sido comprado el articulo
	 */
	public void setPrecioCompra(float precioCompra) {
		if (precioCompra > 0)
			this.precioCompra = precioCompra;
	}

	/**
	 * Devuelve el precio de venta del articulo
	 * 
	 * @return Precio de venta del articulo
	 */
	public float getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * Cambia el precio de venta del articulo
	 * 
	 * @param precioVenta Precio al que se vende el articulo
	 */
	public void setPrecioVenta(float precioVenta) {
		if (precioVenta > 0)
			this.precioVenta = precioVenta;
	}

	/**
	 * Devuelve el stcok del articulo
	 * 
	 * @return Stock del articulo
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Cambia las unidades disponibles de un articulo
	 * 
	 * @param stock Unidades disponibles de un articulo
	 */
	public void setStock(int stock) {
		if (stock >= 0)
			this.stock = stock;
	}

	/**
	 * Devuelve el codigo del articulo
	 * 
	 * @return Codigo del articulo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Metodo que imprime los atributos del articulo
	 * @return String con los atributos del articulo
	 */
	@Override
	public String toString() {
		String articulo = "";

		articulo += "-----------------------\n";
		articulo += "Codigo: " + this.codigo + "\n";
		articulo += "Descripcion: " + this.descripcion + "\n";
		articulo += "Precio compra: " + this.precioCompra + "\n";
		articulo += "Precio venta: " + this.precioVenta + "\n";
		articulo += "Stock: " + this.stock + "\n";

		return articulo;
	}

}
