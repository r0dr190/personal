package cl.awakelab.evaluacion_java;

/**
 * 
 * @author : Armando Cabrera, Ignacio Hidalgo, Daniel Duarte, Rodrigo Salas
 * @version : 03/11/2020 
 * @see <a href = "https://www.instagram.com/awakelab.cl" /> awakelab.com </a>
 * 
 * 
 * */

public class Accidente {

	int ident_accidente; // obligatorio numero interno NO SCANNER
	String rut; // obligatorio
	String dia; // formato DD/MM/AAAA
	String hora; // horas validas, de 0 a 23 horas y de 0 a 59 min
	String lugar; // obligatorio min 10 maximo 50
	String origen; // maximo 100 caracteres
	String consecuencias; // maximo 100 caracteres

	public Accidente(int ident_accidente, String rut, String dia, String hora, String lugar, String origen,
			String consecuencias) {
		super();
		this.ident_accidente = ident_accidente;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	public Accidente() {
		super();
	}

	public int getIdent_accidente() {
		return ident_accidente;
	}

	public void setIdent_accidente(int ident_accidente) {
		this.ident_accidente = ident_accidente;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

}
