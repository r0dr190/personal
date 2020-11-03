package cl.awakelab.animal;

public class Gato extends Animal {

private String nombre;
	
	public Gato(String especie, String nombre) {
		super(especie);
		this.nombre = nombre;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Soy un gato de nombre " + this.getNombre() + ", y digo miau");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
