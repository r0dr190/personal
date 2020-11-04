package cl.awakelab.evaluacion_java;

/**
 * 
 * @author : Armando Cabrera, Ignacio Hidalgo, Daniel Duarte, Rodrigo Salas
 * @version : 03/11/2020 
 * @see <a href = "https://www.instagram.com/awakelab.cl" /> awakelab.com </a>
 * 
 * 
 * */

public class VisitaEnTerreno {

	int identificador; // obligatorio numero ingresado intermantente
	String rut; // obligatorio
	String fechaAccidente; // con formato DD/MM/AAAA
	String hora; // debe ser una hora valida de 0 a 23 hras y 0 a 59 min
	String lugar; // obligatorio minimo 10 maximo 50
	String comentarios; // maximo 100

	public VisitaEnTerreno(int identificador, String rut, String fechaAccidente, String hora, String lugar,
			String comentarios) {
		super();
		this.identificador = identificador;
		this.rut = rut;
		this.fechaAccidente = fechaAccidente;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	public VisitaEnTerreno() {
		super();
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(String fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
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

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaEnTerreno [identificador=" + identificador + ", rut=" + rut + ", fechaAccidente=" + fechaAccidente
				+ ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}

}
