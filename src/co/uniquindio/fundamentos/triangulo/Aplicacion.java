package co.uniquindio.fundamentos.triangulo;

import java.util.Scanner;
import javax.swing.JOptionPane;
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

		base = leerDouble("Ingrese la base del triangulo:");
		altura = leerDouble("Ingrese la altura del triangulo:");

		Triangulo miTriangulo; // miTriangulo es una referencia a un objeto tipo

		miTriangulo = new Triangulo();
		miTriangulo.setBase(base); // m√©todo para fijar el atributo base
		miTriangulo.setAltura(altura); // m√©todo para fijar el atributo altura
		area = miTriangulo.calcularArea(); // esto devolver√≠a (15*4)/2=0

		// System.out.println("El area es " + area);
		mostrarMensaje("El area del triangulo es: " + area);
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

	/*
	 * MÈtodo para mostrar un mensaje en pantalla mediante JoptionPane.
	 */
	private static void mostrarMensaje ( String mensaje )
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
