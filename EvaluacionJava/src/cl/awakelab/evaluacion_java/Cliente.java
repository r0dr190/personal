package cl.awakelab.evaluacion_java;

/**
 * Clase Cliente hereda de Usuario.
 * Clase define datos personales.
 * @author : Armando Cabrera, Ignacio Hidalgo, Daniel Duarte, Rodrigo Salas
 * @version : 03/11/2020 
 * @see <a href = "https://www.instagram.com/awakelab.cl" /> awakelab.com </a>
 * 
 * 
 * */


public class Cliente extends Usuario {

	private int rut; // menor a 99.999.999
	private String nombres; // minimo 5 maximo 30
	private String apellidos; // minimo 5 maximo 30
	private int fono; // obligatoria
	private String afp; // minimo 4 maximo 30
	private int salud; // 1 por fonasa o 2 por isapre,solo
	private String direccion; // maximo 70 caracteres
	private String comuna; // maximo 50 caracteres
	private int edad; // mayor o igual a 0 y menor de 150

	public Cliente() {
		super();
	}

	public Cliente(int rut, String nombres, String apellidos, int fono, String afp, int salud, String direccion,
			String comuna, int edad) {
		super();
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fono = fono;
		this.afp = afp;
		this.salud = salud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getFono() {
		return fono;
	}

	public void setFono(int fono) {
		this.fono = fono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fono=" + fono + ", afp="
				+ afp + ", salud=" + salud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + "]";
	}

	public String obtenerNombre() {
		return "el nombre del cliente es " + this.nombres + this.apellidos;
	}

	public String obtenerSistemaSalud() {
		String temp = "";
		if (this.salud == 1) {
			temp = "fonasa";

		} else
			temp = "Isapre"; // arreglar una vez que se haga la validacion

		return "el sistema de salud es " + temp;
	}

	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("la direccion es " + this.direccion + "en la comuna de " + this.comuna);
	}

	public void mostrarRut() {
		System.out.println("El rut es" + this.getRut());
	}

	public void mostrarrut() {
		System.out.println("El Rut Del Cliente son:" + this.getRut());
	}
}
