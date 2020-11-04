package cl.awakelab.evaluacion_java;

/**
 * Esta clase contiene el método main que inicia la ejecución del programa.
 * Programa administra perfiles de clientes de una compañia de prevención.
 * @author : Armando Cabrera, Ignacio Hidalgo, Daniel Duarte, Rodrigo Salas
 * @version : 03/11/2020 
 * @see <a href = "https://www.instagram.com/awakelab.cl" /> awakelab.com </a>
 * 
 * 
 * */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejecutable {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	public static void main(String[] args) {
		int opcion;
		int opcionlista;
		int rutEliminar;
		Scanner entradaText = new Scanner(System.in);
		Scanner entradanum = new Scanner(System.in);
		Contenedor list = new Contenedor();
		Cliente cli = new Cliente();
		Profesional pro = new Profesional();
		Administrativo admin = new Administrativo();

		Capacitacion capa = new Capacitacion();

		do {

			System.out.println(" Bienvenido a programa ");
			System.out.println(" Pulse 1 Para almacenar Un Cliente ");
			System.out.println(" Pulse 2 Para Almacenar Un Profesional");
			System.out.println(" Pulse 3 Para Almacenar Un Administrativo");
			System.out.println(" Pulse 4 Para Almacenar Una Capacitacion ");
			System.out.println(" Pulse 5 Para Eliminar Un Usuario ");
			System.out.println(" Pulse 6 Para Listar los Usuario ");
			System.out.println(" Pulse 7 Para Listar Los Usuario Por Tipo ");
			System.out.println(" Pulse 8 Para Listar Capacitaciones ");
			System.out.println(" Pulse 9 Para Salir ");
			opcion = entradanum.nextInt();

			switch (opcion)

			{
			case 1: {

				do {
					System.out.println("Ingrese Nombre Del Usuario: (Min.10 - Max.50 Caracteres) ");
					cli.setNombre(entradaText.nextLine());

					if (cli.getNombre().equals(null) || cli.getNombre().equals("") || cli.getNombre().trim().isEmpty()
							|| cli.getNombre().length() < 9 || cli.getNombre().length() > 51) {
						System.out.println("Nombre Fuera De Los Rangos Establecidos");
					}

				} while (cli.getNombre().equals(null) || cli.getNombre().equals("") || cli.getNombre().trim().isEmpty()
						|| cli.getNombre().length() < 9 || cli.getNombre().length() > 51);

				do {
					System.out.println("Ingrese Fecha De Nacimiento: (Formato DD/MM/AAAA) ");
					cli.setFecha(entradaText.nextLine());
					if (cli.getFecha().equals(null) || cli.getFecha().equals("") || cli.getFecha().trim().isEmpty()
							|| cli.getFecha().length() < 10 || cli.getFecha().length() > 10) {
						System.out.println("Fecha Fuera De Los Rangos Establecidos");
					}

				} while (cli.getFecha().equals(null) || cli.getFecha().equals("") || cli.getFecha().trim().isEmpty()
						|| cli.getFecha().length() < 10 || cli.getFecha().length() > 10);

				do {
					System.out.println("Ingrese Run Del Usuario: ");
					cli.setRun(entradanum.nextInt());
					if (cli.getRun() < 999999 || cli.getRun() > 100000000) {
						System.out.println("Run Fuera De Los Rangos Establecidos");

					}

				} while (cli.getRun() < 999999 || cli.getRun() > 100000000);

				System.out.println("A CONTINUACION RELLENE DATOS DE CLIENTE");

				do {
					System.out.println("Ingrese Rut Del Cliente: ");
					cli.setRut(entradanum.nextInt());
					if (cli.getRut() < 999999 || cli.getRut() > 100000000) {
						System.out.println("Run Fuera De Los Rangos Establecidos");

					}

				} while (cli.getRut() < 999999 || cli.getRut() > 100000000);

				do {
					System.out.println("Ingrese Nombres Del Cliente: (Min.10 - Max.30 Caracteres) ");
					cli.setNombres(entradaText.nextLine());

					if (cli.getNombres().equals(null) || cli.getNombres().equals("")
							|| cli.getNombres().trim().isEmpty() || cli.getNombres().length() < 4
							|| cli.getNombres().length() > 31) {
						System.out.println("Nombres Fuera De Los Rangos Establecidos");
					}

				} while (cli.getNombres().equals(null) || cli.getNombres().equals("")
						|| cli.getNombres().trim().isEmpty() || cli.getNombres().length() < 4
						|| cli.getNombres().length() > 31);

				do {
					System.out.println("Ingrese Apellidos Del Cliente: (Min.10 - Max.30 Caracteres) ");
					cli.setApellidos(entradaText.nextLine());

					if (cli.getApellidos().equals(null) || cli.getApellidos().equals("")
							|| cli.getApellidos().trim().isEmpty() || cli.getApellidos().length() < 4
							|| cli.getApellidos().length() > 31) {
						System.out.println("Apellidos Fuera De Los Rangos Establecidos");
					}

				} while (cli.getApellidos().equals(null) || cli.getApellidos().equals("")
						|| cli.getApellidos().trim().isEmpty() || cli.getApellidos().length() < 4
						|| cli.getApellidos().length() > 31);

				do {
					System.out.println("Ingrese Telefono Del Cliente: (Ej: 922334455) ");
					cli.setFono(entradanum.nextInt());
					if (cli.getFono() < 99999999 || cli.getFono() > 1000000000) {
						System.out.println("Telefono Fuera De Los Rangos Establecidos");

					}

				} while (cli.getFono() < 99999999 || cli.getFono() > 1000000000);

				do {
					System.out.println("Ingrese AFP Del Cliente: (Min.4 - Max.30 Caracteres) ");
					cli.setAfp(entradaText.nextLine());

					if (cli.getAfp().equals(null) || cli.getAfp().equals("") || cli.getAfp().trim().isEmpty()
							|| cli.getAfp().length() < 4 || cli.getAfp().length() > 31) {
						System.out.println("AFP Fuera De Los Rangos Establecidos");
					}

				} while (cli.getAfp().equals(null) || cli.getAfp().equals("") || cli.getAfp().trim().isEmpty()
						|| cli.getAfp().length() < 4 || cli.getAfp().length() > 31);

				do {
					System.out.println("Ingrese Sistema De Salud Del Cliente:");
					System.out.println("1- FONASA");
					System.out.println("2- ISAPRE");
					cli.setSalud(entradanum.nextInt());
					if (cli.getSalud() < 1 || cli.getSalud() > 2) {
						System.out.println("Sistema De Salud Fuera De Los Rangos Establecidos");

					}

				} while (cli.getSalud() < 1 || cli.getSalud() > 2);

				do {
					System.out.println("Ingrese Direccion Del Cliente: (Max.70 Caracteres) ");
					cli.setDireccion(entradaText.nextLine());

					if (cli.getDireccion().length() > 71) {
						System.out.println("Direccion Fuera De Los Rangos Establecidos");
					}

				} while (cli.getDireccion().length() > 71);

				do {
					System.out.println("Ingrese Comuna Del Cliente: (Max.50 Caracteres) ");
					cli.setComuna(entradaText.nextLine());

					if (cli.getComuna().length() > 51) {
						System.out.println("Comuna Fuera De Los Rangos Establecidos");
					}

				} while (cli.getComuna().length() > 51);

				do {
					System.out.println("Ingrese La Edad Del Cliente: (Entre 0 - 150 Años) ");
					cli.setEdad(entradanum.nextInt());
					if (cli.getEdad() > 151) {
						System.out.println("Edad Fuera De Los Rangos Establecidos");

					}

				} while (cli.getEdad() > 151);

				list.almacenarCliente(cli);

				break;
			}

			case 2: {

				do {
					System.out.println("Ingrese Nombre Del Usuario: (Min.10 - Max.50 Caracteres) ");
					pro.setNombre(entradaText.nextLine());

					if (pro.getNombre().equals(null) || pro.getNombre().equals("") || pro.getNombre().trim().isEmpty()
							|| pro.getNombre().length() < 9 || pro.getNombre().length() > 51) {
						System.out.println("Nombre Fuera De Los Rangos Establecidos");
					}

				} while (pro.getNombre().equals(null) || pro.getNombre().equals("") || pro.getNombre().trim().isEmpty()
						|| pro.getNombre().length() < 9 || pro.getNombre().length() > 51);

				do {
					System.out.println("Ingrese Fecha De Nacimiento: (Formato DD/MM/AAAA) ");
					pro.setFecha(entradaText.nextLine());
					if (pro.getFecha().equals(null) || pro.getFecha().equals("") || pro.getFecha().trim().isEmpty()
							|| pro.getFecha().length() < 10 || pro.getFecha().length() > 10) {
						System.out.println("Fecha Fuera De Los Rangos Establecidos");
					}

				} while (pro.getFecha().equals(null) || pro.getFecha().equals("") || pro.getFecha().trim().isEmpty()
						|| pro.getFecha().length() < 10 || pro.getFecha().length() > 10);

				do {
					System.out.println("Ingrese Run Del Ususario: ");
					pro.setRun(entradanum.nextInt());
					if (pro.getRun() < 999999 || pro.getRun() > 100000000) {
						System.out.println("Run Fuera De Los Rangos Establecidos");

					}

				} while (pro.getRun() < 999999 || pro.getRun() > 100000000);

				System.out.println("A CONTINUACION RELLENE DATOS DEL PROFESIONAL");

				do {
					System.out.println("Ingrese Titulo Del Profesional: (Min.10 - Max.50 Caracteres) ");
					pro.setTitulo(entradaText.nextLine());

					if (pro.getTitulo().equals(null) || pro.getTitulo().equals("") || pro.getTitulo().trim().isEmpty()
							|| pro.getTitulo().length() < 9 || pro.getTitulo().length() > 51) {
						System.out.println("Titulo Fuera De Los Rangos Establecidos");
					}

				} while (pro.getTitulo().equals(null) || pro.getTitulo().equals("") || pro.getTitulo().trim().isEmpty()
						|| pro.getTitulo().length() < 9 || pro.getTitulo().length() > 51);

				do {
					System.out.println("Ingrese Fecha De Ingreso Del Profesional: (Formato DD/MM/AAAA) ");
					pro.setFechaingreso(entradaText.nextLine());
					if (pro.getFechaingreso().equals(null) || pro.getFechaingreso().equals("")
							|| pro.getFechaingreso().trim().isEmpty() || pro.getFechaingreso().length() < 10
							|| pro.getFechaingreso().length() > 10) {
						System.out.println("Fecha De Ingreso Fuera De Los Rangos Establecidos");
					}

				} while (pro.getFechaingreso().equals(null) || pro.getFechaingreso().equals("")
						|| pro.getFechaingreso().trim().isEmpty() || pro.getFechaingreso().length() < 10
						|| pro.getFechaingreso().length() > 10);


				list.almacenarProfesional(pro);

				break;
			}
			case 3: {

				do {
					System.out.println("Ingrese Nombre Del Usuario: (Min.10 - Max.50 Caracteres) ");
					admin.setNombre(entradaText.nextLine());

					if (admin.getNombre().equals(null) || admin.getNombre().equals("")
							|| admin.getNombre().trim().isEmpty() || admin.getNombre().length() < 9
							|| admin.getNombre().length() > 51) {
						System.out.println("Nombre Fuera De Los Rangos Establecidos");
					}

				} while (admin.getNombre().equals(null) || admin.getNombre().equals("")
						|| admin.getNombre().trim().isEmpty() || admin.getNombre().length() < 9
						|| admin.getNombre().length() > 51);

				do {
					System.out.println("Ingrese Fecha De Nacimiento: (Formato DD/MM/AAAA) ");
					admin.setFecha(entradaText.nextLine());
					if (admin.getFecha().equals(null) || admin.getFecha().equals("")
							|| admin.getFecha().trim().isEmpty() || admin.getFecha().length() < 10
							|| admin.getFecha().length() > 10) {
						System.out.println("Fecha Fuera De Los Rangos Establecidos");
					}

				} while (admin.getFecha().equals(null) || admin.getFecha().equals("")
						|| admin.getFecha().trim().isEmpty() || admin.getFecha().length() < 10
						|| admin.getFecha().length() > 10);

				do {
					System.out.println("Ingrese Run Del Ususario: ");
					admin.setRun(entradanum.nextInt());
					if (admin.getRun() < 999999 || admin.getRun() > 100000000) {
						System.out.println("Run Fuera De Los Rangos Establecidos");

					}

				} while (admin.getRun() < 999999 || admin.getRun() > 100000000);

				System.out.println("A CONTINUACION RELLENE DATOS DEL ADMINISTRATIVO");

				do {
					System.out.println("Ingrese Area De Trabajo Del Administrativo: (Min.5 - Max.20 Caracteres) ");
					admin.setArea(entradaText.nextLine());

					if (admin.getArea().equals(null) || admin.getArea().equals("") || admin.getArea().trim().isEmpty()
							|| admin.getArea().length() < 4 || admin.getArea().length() > 21) {
						System.out.println("Area De Trabajo Fuera De Los Rangos Establecidos");
					}

				} while (admin.getArea().equals(null) || admin.getArea().equals("") || admin.getArea().trim().isEmpty()
						|| admin.getArea().length() < 4 || admin.getArea().length() > 21);

				do {
					System.out.println("Ingrese La Experiencia Previa Del Administrativo: (Max.100 Caracteres) ");
					admin.setExpPrevia(entradaText.nextLine());

					if (admin.getExpPrevia().length() > 101) {
						System.out.println("Experiencia Previa Fuera De Los Rangos Establecidos");
					}

				} while (admin.getExpPrevia().length() > 101);

				list.almacenarAdministrativo(admin);

				break;
			}
			case 4: {

				do {
					System.out.println("Ingrese ID. De La Capacitacio: (EJ: 1234) ");
					capa.setId(entradanum.nextInt());
					if (capa.getId() < 999 || capa.getId() > 1000) {
						System.out.println("ID. De La Capacitacion Fuera De Los Rangos Establecidos");

					}

				} while (capa.getId() < 999 || capa.getId() > 1000);

				do {
					System.out.println("Ingrese Rut Del Cliente: ");
					capa.setRutcliente(entradanum.nextInt());
					if (capa.getRutcliente() < 999999 || capa.getRutcliente() > 100000000) {
						System.out.println("Run Fuera De Los Rangos Establecidos");

					}

				} while (capa.getRutcliente() < 999999 || capa.getRutcliente() > 100000000);

				do {
					System.out.println("Ingrese Dia De La Capacitacion:");
					System.out.println("De Lunes a Domingo");
					capa.setDia(entradaText.nextLine());
					if (capa.getDia().equals(null) || capa.getDia().equals("") || capa.getDia().trim().isEmpty()
							|| !capa.getDia().equalsIgnoreCase("lunes") || !capa.getDia().equalsIgnoreCase("martes")
							|| !capa.getDia().equalsIgnoreCase("miercoles") || !capa.getDia().equalsIgnoreCase("jueves")
							|| !capa.getDia().equalsIgnoreCase("viernes") || !capa.getDia().equalsIgnoreCase("sabado")
							|| !capa.getDia().equalsIgnoreCase("domingo")) {
						System.out.println("Dia De La Capacitacion Fuera De Los Rangos Establecidos");
					}

				} while (capa.getDia().equals(null) || capa.getDia().equals("") || capa.getDia().trim().isEmpty()
						|| !capa.getDia().equalsIgnoreCase("lunes") || !capa.getDia().equalsIgnoreCase("martes")
						|| !capa.getDia().equalsIgnoreCase("miercoles") || !capa.getDia().equalsIgnoreCase("jueves")
						|| !capa.getDia().equalsIgnoreCase("viernes") || !capa.getDia().equalsIgnoreCase("sabado")
						|| !capa.getDia().equalsIgnoreCase("domingo"));

				do {
					System.out.println("Ingrese La Hora De Capacitacion: (Formato 00:00) ");
					capa.setHora(entradaText.nextLine());
					if (capa.getHora().equals(null) || capa.getHora().equals("") || capa.getHora().trim().isEmpty()
							|| capa.getHora().length() < 4 || capa.getHora().length() > 6) {
						System.out.println("Hora De Capacitacion Fuera De Los Rangos Establecidos");
					}

				} while (capa.getHora().equals(null) || capa.getHora().equals("") || capa.getHora().trim().isEmpty()
						|| capa.getHora().length() < 4 || capa.getHora().length() > 6);

				do {
					System.out.println("Ingrese El Lugar De Capacitacion: (Min.10 - Max.50 Caracteres) ");
					capa.setLugar(entradaText.nextLine());

					if (capa.getLugar().equals(null) || capa.getLugar().equals("") || capa.getLugar().trim().isEmpty()
							|| capa.getLugar().length() < 9 || capa.getLugar().length() > 51) {
						System.out.println("El Lugar De Capacitacion Fuera De Los Rangos Establecidos");
					}

				} while (capa.getLugar().equals(null) || capa.getLugar().equals("") || capa.getLugar().trim().isEmpty()
						|| capa.getLugar().length() < 9 || capa.getLugar().length() > 51);

				do {
					System.out.println("Ingrese La Duracion De La Capacitacion: (Max.70 Caracteres) ");
					capa.setDuracion(entradaText.nextLine());

					if (capa.getDuracion().length() > 70) {
						System.out.println("Duracion De La Capacitacion Fuera De Los Rangos Establecidos");
					}

				} while (capa.getDuracion().length() > 70);

				do {
					System.out.println("Ingrese La Cantidad De Asistentes A La Capacitacion: ");
					capa.setCant_asisten(entradanum.nextInt());
					if (capa.getCant_asisten() <= 0 || capa.getCant_asisten() >= 1000) {
						System.out.println("Asistentes A La Capacitacion Fuera De Los Rangos Establecidos");

					}

				} while (capa.getCant_asisten() <= 0 || capa.getCant_asisten() >= 1000);

				list.almacenarCapacitacion(capa);

				break;

			}

			case 5: {

				System.out.println("Ingrese El Rut A Eliminar");
				rutEliminar = entradanum.nextInt();
				// cli.setRun(entradanum.nextInt());
				if (rutEliminar == cli.getRut()) {
					list.eliminarUsuario(cli);
				} else
					System.out.println("Rut no encontrado ");

				System.out.println("Presione Enter para salir");
				entradaText.nextLine();

				break;
			}
			case 6: {

				list.mensajeInicio();

				list.listarUsuario();
				System.out.println("Presione Enter para salir");
				entradaText.nextLine();
				break;
			}
			case 7: {

				do {
					System.out.println(" Listar por tipo de Usuario ");
					System.out.println("");
					System.out.println(" Pulse 1 Para Mostrar Usuarios Cliente ");
					System.out.println(" Pulse 2 Para Mostrar Usuarios Profesional");
					System.out.println(" Pulse 3 Mostrar Usuarios Administrativo");
					System.out.println(" Pulse 4 Salir ");
					opcionlista = entradanum.nextInt();

					switch (opcionlista)

					{
					case 1: {

						list.listarusuarioCliente();
						System.out.println("");
						System.out.println("Presione Enter para continuar");
						entradaText.nextLine();
						break;

					}
					case 2: {

						list.listarusuarioProfesional();
						System.out.println("");
						System.out.println("Presione Enter para continuar");
						entradaText.nextLine();
						break;
					}
					case 3: {

						list.listarusuarioAdmin();
						System.out.println("");
						System.out.println("Presione Enter para continuar");
						entradaText.nextLine();
						break;
					}
					case 4: {
						System.out.println("Devuelta al menu Principal");
						break;
					}
					default: {
						System.out.println("Error");
						break;
					}
					}
				} while (opcionlista != 4);
			}
			case 8: {

				int temp = 0;

				System.out.println("Las capa son:" + temp);
				list.listarCapacitaciones();

				break;
			}
			case 9: {
				System.out.println("Adios, vuelva Pronto");
				break;
			}
			default: {
				System.out.println("Error");
				break;
			}
			}

		} while (opcion != 9);

		entradaText.close();
		entradanum.close();

	}

	public static Date StringADate(String getFechaingreso) {
		Date fecha = null;
		try {
			fecha = sdf.parse(getFechaingreso);
		} catch (ParseException e) {
			System.out.println("Error al Convertir");
		}
		return fecha;
	}

}