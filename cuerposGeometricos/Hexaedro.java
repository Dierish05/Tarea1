package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hexaedro extends CuerposGeometricos {
	
	private int exponente1, exponente2;
	private double volumen, area, a, diagonal;

	public void PedirHexaedro(Scanner entrada) {
		
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
	
	public void CalcularHexaedro(int exponente1, int exponente2) {
		area = 6 * Math.pow(a, exponente1);
   		volumen = Math.pow(a, exponente2);
   		diagonal = a * Math.sqrt(3);
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Su Area es: " + area);
		System.out.println("Su Volumen es: " + volumen);
		System.out.println("Su Diagonal es: " + diagonal);
	}
	@Override
	public void forma() {
		System.out.println("El hexaedro tiene forma cuadrada");
	}
	@Override
	public void color() {
		System.out.println("El hexaedro es de color gris");
	}

	public Hexaedro(int exponente1, int exponente2, double volumen, double area, double a, double diagonal) {
		this.exponente1 = exponente1;
		this.exponente2 = exponente2;
		this.volumen = volumen;
		this.area = area;
		this.a = a;
		this.diagonal = diagonal;
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

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}
}
