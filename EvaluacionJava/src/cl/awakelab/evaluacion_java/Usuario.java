package cl.awakelab.evaluacion_java;

/**
 * Clase objeto, implementa interface Asesoria.
 * Clase define datos personales.
 * @author : Armando Cabrera, Ignacio Hidalgo, Daniel Duarte, Rodrigo Salas
 * @version : 03/11/2020 
 * @see <a href = "https://www.instagram.com/awakelab.cl" /> awakelab.com </a>
 * 
 * 
 * */

public class Usuario implements Asesoria {

	private String nombre; // min 10 maximo 50
	private String fecha; // con formato DD/MM/AAAA
	private int run; // menor a 99.999.999

	public Usuario(int run) {
		super();
		this.run = run;
	}
 
	// Constructor vacio.
	public Usuario() {
		super();
	}

	/**
	 * Constructor 
	 * */
	public Usuario(String nombre, String fecha, int run) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public String mostrarEdad() {

		int temp = 0;
		temp = 2020 - Integer.parseInt(this.fecha.substring(6, this.fecha.length()));
		return "el usuario tiene " + temp + " años.";
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fecha=" + fecha + ", run=" + run + "]";
	}

	public void analizarUsuario() {
		System.out.println("El Nombre Del Usuario es:" + this.getNombre());
		System.out.println("El Rut Del Usuario es:" + this.getRun());

	}

}
