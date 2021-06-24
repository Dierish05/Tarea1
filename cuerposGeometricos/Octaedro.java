package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Octaedro extends CuerposGeometricos {
	
	private int exponente1, exponente2;
	private double volumen, area, h, a;
	
	public void PedirOctaedro(Scanner entrada) {
		
		do {
	 		try {
	 			comprobacion = 2;
			System.out.println("Ingrese el valor de a: ");
			a = entrada.nextDouble();
			
			while(a <= 0) {
				   System.out.println("Este valor no puede ser 0 o negativa\n");
				   System.out.println("Ingrese el valor de a: ");
					a = entrada.nextDouble();
				}
	 		} catch (InputMismatchException ex) {
	   			System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
	   			entrada.nextLine();
	   			comprobacion = 1;
	   		}
	   		}while(comprobacion != 2);
	}
	
	public void CalcularOctaedro(int exponente1, int exponente2) {
		    area = 2 * Math.pow(a, exponente1) * Math.sqrt(3);
	   	    volumen = (Math.sqrt(2) * Math.pow(a, exponente2)) / 3;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Su Area es: " + area);
		System.out.println("Su Volumen es: " + volumen);
	}
	@Override
	public void forma() {
		System.out.println("El octaedro tiene forma triangular");
	}
	@Override
	public void color() {
		System.out.println("El octaedro es de color amarillo claro");
	}

	public Octaedro(int exponente1, int exponente2, double volumen, double area, double h, double a) {
		this.exponente1 = exponente1;
		this.exponente2 = exponente2;
		this.volumen = volumen;
		this.area = area;
		this.h = h;
		this.a = a;
	}

	public int getExponente1() {
		return exponente1;
	}

	public void setExponente1(int exponente1) {
		this.exponente1 = exponente1;
	}

	public int getExponente2() {
		return exponente2;
	}

	public void setExponente2(int exponente2) {
		this.exponente2 = exponente2;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
}
