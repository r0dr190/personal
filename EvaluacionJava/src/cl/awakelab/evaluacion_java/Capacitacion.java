package cl.awakelab.evaluacion_java;

/**
 * 
 * @author : Armando Cabrera, Ignacio Hidalgo, Daniel Duarte, Rodrigo Salas
 * @version : 03/11/2020 
 * @see <a href = "https://www.instagram.com/awakelab.cl" /> awakelab.com </a>
 * 
 * 
 * */

public class Capacitacion extends Cliente {

	private int id; // obligatorio numero interno NO SCANNER , crearle constructor aparte para
					// enviar dato en duro :$
	private int rutcliente; // obligatorio no mas de 99.999.999
	private String dia; // dia de la semana de lunes a domingo
	private String hora; // hora valida entre 0 y 23 hrs y 0 a 59 min
	private String lugar; // obligatorio min 10 y maximo 50
	private String duracion; // maximo 70 caract.
	private int cant_asisten; // obligatorio menor que 1000

	public Capacitacion() {
		super();
	}

	public Capacitacion(int rut, String nombres, String apellidos, int fono, String afp, int salud, String direccion,
			String comuna, int edad) {
		super(rut, nombres, apellidos, fono, afp, salud, direccion, comuna, edad);
	}

	public Capacitacion(int rut, String nombres, String apellidos, int fono, String afp, int salud, String direccion,
			String comuna, int edad, int id, int rutcliente, String dia, String hora, String lugar, String duracion,
			int cant_asisten) {
		super(rut, nombres, apellidos, fono, afp, salud, direccion, comuna, edad);
		this.id = id;
		this.rutcliente = rutcliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cant_asisten = cant_asisten;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRutcliente() {
		return rutcliente;
	}

	public void setRutcliente(int rutcliente) {
		this.rutcliente = rutcliente;
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

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCant_asisten() {
		return cant_asisten;
	}

	public void setCant_asisten(int cant_asisten) {
		this.cant_asisten = cant_asisten;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", rutcliente=" + rutcliente + ", dia=" + dia + ", hora=" + hora + ", lugar="
				+ lugar + ", duracion=" + duracion + ", cant_asisten=" + cant_asisten + "]";
	}

	public String mostrarDetalle() {
		return "La capacitacion sera en " + this.lugar + " a las " + this.hora + " del dia " + this.dia + " y durara "
				+ this.duracion + " minutos.";
	}

}
