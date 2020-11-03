package cl.awakelab.animal;

public class PoliformismoMain {

	public static void main(String[] args) {

		Animal fido, snarf;
		fido = new Perro("Canino","Fido");
		snarf = new Gato("Felino","Snarf");
		
		fido.imprimir();
		snarf.imprimir();
	}
}
