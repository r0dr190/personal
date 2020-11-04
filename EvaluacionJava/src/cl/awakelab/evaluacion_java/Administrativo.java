package cl.awakelab.evaluacion_java;

/**
 * Clase Administrativo hereda de Usuario.
 * Clase define datos personales.
 * @author : Armando Cabrera, Ignacio Hidalgo, Daniel Duarte, Rodrigo Salas
 * @version : 03/11/2020 
 * @see <a href = "https://www.instagram.com/awakelab.cl" /> awakelab.com </a>
 * 
 * 
 * */

public class Administrativo extends Usuario {

	private String area; // min 5 maximo 20
	private String expPrevia; // maximo 100

	public Administrativo() {
		super();
	}

	public Administrativo(String area, String expPrevia) {
		super();
		this.area = area;
		this.expPrevia = expPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExpPrevia() {
		return expPrevia;
	}

	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", expPrevia=" + expPrevia + "]";
	}

	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("El area de experiencia es: " + this.area);
		System.out.println("La experiencia previa es de: " + this.expPrevia);
		System.out.println("");
	}

}
