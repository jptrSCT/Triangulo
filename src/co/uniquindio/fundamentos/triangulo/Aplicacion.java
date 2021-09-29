package co.uniquindio.fundamentos.triangulo;

import java.util.Scanner;
import javax.swing.JOptionPane;
import co.uniquindio.fundamentos.triangulo.model.Rectangulo;
import co.uniquindio.fundamentos.triangulo.model.Triangulo;

/**
 * Es la clase en donde se invoca el main
 * 
 * @author Sonia Jaramillo Valbuena
 * @author Sergio Augusto Cardona
 *
 */

public class Aplicacion
{

	/**
	 * Metodo principal
	 * 
	 * @param args
	 *            Argumentos de la linea de comandos
	 */
	public static void main ( String args[] )
	{
		double base;
		double altura;
		double area = 0;
		String opc = "";

		Triangulo miTriangulo; // miTriangulo es una referencia a un objeto tipo
		Rectangulo miRectangulo;

		while ( opc != "f" )
		{
			opc = String.valueOf(
					leerString("Hallar area\n 1. Triangulo\n 2. Rectangulo\n 3. Salir"));

			switch ( opc )
			{
				case "1":
					base = leerDouble("Ingrese la base del triangulo:");
					altura = leerDouble("Ingrese la altura del triangulo:");

					miTriangulo = new Triangulo();
					miTriangulo.setBase(base); // m√©todo para fijar el atributo
												// base
					miTriangulo.setAltura(altura); // m√©todo para fijar el
													// atributo altura
					area = miTriangulo.calcularArea(); // esto devolver√≠a
														// (15*4)/2=0

					mostrarMensaje("El area del triangulo es:\n" + area);
					break;

				case "2":
					base = leerDouble("Ingrese la base del rectangulo:");
					altura = leerDouble("Ingrese la altura del rectangulo:");

					miRectangulo = new Rectangulo();
					miRectangulo.setBase(base);
					miRectangulo.setAltura(altura);

					area = miRectangulo.calcularArea();

					mostrarMensaje("El area del rectangulo es:\n" + area);
					break;

				case "3":
					return;

				default:
					if ( opc != "null" )
					{
						mostrarMensaje("\"" + opc + "\" - Opcion incorrecta");
					} else
					{
						opc = "f";
						return;
					}
					break;

			}
		}

	}

	/**
	 * Metodo para leer un double por consola
	 * 
	 * @param mensaje
	 *            El mensaje a mostrar
	 * @return El numero leido
	 */
	public static double leerDoubleConsola ( String mensaje )
	{
		double dato = 0;
		String captura = "";
		System.out.println(mensaje);
		Scanner teclado = new Scanner(System.in);
		captura = teclado.nextLine();
		dato = Double.parseDouble(captura);
		return dato;
	}

	/*
	 * MÈtodo para leer double mediante Joption Pane.
	 */
	private static double leerDouble ( String mensaje )
	{
		double d;
		d = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return d;
	}

	private static String leerString ( String mensaje )
	{
		String s;
		s = JOptionPane.showInputDialog(mensaje);
		return s;
	}

	/*
	 * MÈtodo para mostrar un mensaje en pantalla mediante JoptionPane.
	 */
	private static void mostrarMensaje ( String mensaje )
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
