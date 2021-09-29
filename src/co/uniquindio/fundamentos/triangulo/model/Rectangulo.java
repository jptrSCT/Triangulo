package co.uniquindio.fundamentos.triangulo.model;

/**
 * Clase para representar el rectangulo
 * 
 * @author Sebastian Carmona Tapasco
 */

public class Rectangulo
{

	/*
	 * Atributos
	 */
	private double altura, base;

	/*
	 * Métodos set y get para cada atributo
	 */
	public double getAltura ()
	{
		return altura;
	}

	public void setAltura ( double altura )
	{
		this.altura = altura;
	}

	public double getBase ()
	{
		return base;
	}

	public void setBase ( double base )
	{
		this.base = base;
	}

	/*
	 * Método para calcular el area
	 */
	public double calcularArea ()
	{
		double area;
		area = (base * altura);
		return area;
	}

}
