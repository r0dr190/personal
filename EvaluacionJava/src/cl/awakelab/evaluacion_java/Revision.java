package cl.awakelab.evaluacion_java;

/**
 * 
 * @author : Armando Cabrera, Ignacio Hidalgo, Daniel Duarte, Rodrigo Salas
 * @version : 03/11/2020 
 * @see <a href = "https://www.instagram.com/awakelab.cl" /> awakelab.com </a>
 * 
 * 
 * */

public class Revision {

	int identificador_rev; // obligatorio numero interno
	int identificador_VD; // obligatorio numero se saca de clase visita a terreno
	String nombreRevision; // obligatorio, min 10 caracteres maximo 50
	String detalle; // maximo 100 caract.
	int estado; // 1 sin problemas 2 con observaciones 3 no aprueba pide validacion de entrada

	public Revision(int identificador_rev, int identificador_VD, String nombreRevision, String detalle, int estado) {
		super();
		this.identificador_rev = identificador_rev;
		this.identificador_VD = identificador_VD;
		this.nombreRevision = nombreRevision;
		this.detalle = detalle;
		this.estado = estado;
	}

	public Revision() {
		super();
	}

	public int getIdentificador_rev() {
		return identificador_rev;
	}

	public void setIdentificador_rev(int identificador_rev) {
		this.identificador_rev = identificador_rev;
	}

	public int getIdentificador_VD() {
		return identificador_VD;
	}

	public void setIdentificador_VD(int identificador_VD) {
		this.identificador_VD = identificador_VD;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [identificador_rev=" + identificador_rev + ", identificador_VD=" + identificador_VD
				+ ", nombreRevision=" + nombreRevision + ", detalle=" + detalle + ", estado=" + estado + "]";
	}

}
