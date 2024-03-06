package ejercicio01;

/**
 * Clase que guarda los datos de un alumno
 */
public class Alumno {
	/**
	 * String para guardar el nombre del alumno
	 */
	private String nombre = "";

	/**
	 * Variable para guardar la nota media del alumno
	 */
	private float notaMedia;

	/**
	 * Constructor con parametros
	 */
	public Alumno(String nombre, float notaMedia) {
		super();
		setNombre(nombre);
		setNotaMedia(notaMedia);

	}

	/**
	 * Constructor sin parametros
	 */
	public Alumno() {
		super();
	}

	/**
	 * Get para obtener el nombre del alumno
	 * @return Nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Si el nombre es valido asigna ese nombre al alumno
	 * @param nombre Nombre del alumno
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
	}

	/**
	 * Get para obtener la nota media del alumno
	 * @return Devuelve la nota media del alumno
	 */
	public float getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Si la nota media es valida asigna esa nota media al almuno
	 * @param notaMedia Nota media del alumno
	 */
	public void setNotaMedia(float notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10)
			this.notaMedia = notaMedia;
	}

	/**
	 * Funcion para imprimir el nombre y la nota media del alumno
	 */
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}
	
	

}
