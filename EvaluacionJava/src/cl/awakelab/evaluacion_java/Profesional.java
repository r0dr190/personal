package cl.awakelab.evaluacion_java;

/**
 * Clase Profesional hereda de Usuario.
 * Clase define datos personales.
 * @author : Armando Cabrera, Ignacio Hidalgo, Daniel Duarte, Rodrigo Salas
 * @version : 03/11/2020  
 * @see <a href = "https://www.instagram.com/awakelab.cl" /> awakelab.com </a>
 * 
 * 
 * */

public class Profesional extends Usuario {

	private String titulo; // minimo 10 caract, max 50
	private String fechaingreso; // desplegar con formato DD/MM/AAAA

/**
 * constructor vacio
 * */
	public Profesional() {
		super();
	}

/**
 * @param 2 paramátros String definen datos personales
 * */
	public Profesional(String titulo, String fechaingreso) {
		super();
		this.titulo = titulo;
		this.fechaingreso = fechaingreso;
	}

	// accesores y mutadores.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(String fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaingreso=" + fechaingreso + "]";
	}

	/**
	 * se implementa el método analizarUsuario.
	 * @return retorna cadena de texto y 2 String.
	 * */
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("el titulo es " + this.titulo + " y la fecha de ingreso es " + this.fechaingreso);
		System.out.println("");
	}

}