package cl.awakelab.evaluacion_java;

/**
 * 
 * @author : Armando Cabrera, Ignacio Hidalgo, Daniel Duarte, Rodrigo Salas
 * @version : 03/11/2020 
 * @see <a href = "https://www.instagram.com/awakelab.cl" /> awakelab.com </a>
 * 
 * 
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contenedor {

	private List<Asesoria> lista = new ArrayList<Asesoria>();
	private List<Capacitacion> lista2 = new ArrayList<Capacitacion>();
	private List<Asesoria> cli = new ArrayList<Asesoria>();
	private List<Asesoria> prof = new ArrayList<Asesoria>();
	private List<Asesoria> admin = new ArrayList<Asesoria>();
	// private List<Asesoria> rut = new ArrayList<Asesoria>();

	Scanner sc = new Scanner(System.in);

	public Contenedor() {
		super();
	}

	public void almacenarCliente(Asesoria c) {
		lista.add(c);
	}

	public void almacenarProfesional(Asesoria p) {
		lista.add(p);
		prof.add(p);
	}

	public void almacenarAdministrativo(Asesoria a) {
		lista.add(a);
		admin.add(a);
	}

	public void almacenarCapacitacion(Capacitacion b) {
		lista2.add(b);
	}

	public void eliminarUsuario(Asesoria m) {
		lista.remove(m);
	}

	public void listarUsuario() {
		for (Asesoria l : lista) {
			l.analizarUsuario();
		}
	}

	public void listarUsuarioporTipo() {
	}

	public void listarusuarioCliente() {
		System.out.println("Los Usuario Clientes son: " + cli.size());
		System.out.println("");
		for (Asesoria l : cli) {
			l.analizarUsuario();
		}
	}

	public void listarusuarioProfesional() {
		System.out.println("Los Usuario Profesionales son: " + prof.size());
		System.out.println("");
		for (Asesoria l : prof) {
			l.analizarUsuario();
		}

	}

	public void listarusuarioAdmin() {
		System.out.println("Los Usuario Administrativos son: " + admin.size());
		System.out.println("");
		for (Asesoria l : admin) {
			l.analizarUsuario();
		}

	}

	public void listarCapacitaciones() {

		for (Capacitacion f : lista2) {
			System.out.println(f.mostrarDetalle());
			System.out.println("");

		}

	}

	public void mensajeInicio() {

		if (lista == null || lista.size() == 0) {
			System.out.println("Lista Se encuentra vacia");
		} else
			System.out.println("El total de usarios son: " + lista.size());
		System.out.println("");

	}

	public int tamanoList() {
		int tamano = 0;
		tamano = lista.size();
		return tamano;
	}

	public int tamanoList2() {
		int tamano = 0;
		tamano = lista2.size();
		return tamano;
	}

}