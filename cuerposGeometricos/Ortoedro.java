package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ortoedro extends CuerposGeometricos{
	
	private int exponente1;
	private double a, b, c, diagonal, area, volumen;
	
	public void pedirOrtoedro(Scanner entrada) {
		
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
			
			do {
		 		try {
		 		 comprobacion = 2;
			System.out.println("ingrese el valor de b: ");
			b = entrada.nextDouble();
			
			while(b <= 0) {
				   System.out.println("Este valor no puede ser 0 o negativa\n");
				   System.out.println("ingrese el valor de b: ");
					b = entrada.nextDouble();
				}
		 		} catch (InputMismatchException ex) {
		   			System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
		   			entrada.nextLine();
		   			comprobacion = 1;
		   		}
		   		}while(comprobacion != 2);
			
			do {
		 		try {
		 		 comprobacion = 2;
			System.out.println("ingrese el valor de c: ");
			c = entrada.nextDouble();
			
			while(c <= 0) {
				   System.out.println("Este valor no puede ser 0 o negativa\n");
				   System.out.println("ingrese el valor de c: ");
					c = entrada.nextDouble();
				}
	 		} catch (InputMismatchException ex) {
	   			System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
	   			entrada.nextLine();
	   			comprobacion = 1;
	   		}
	   		}while(comprobacion != 2);
	}
	
	public void calcularOrtoedro(int exponente1) {
		
		area = 2 * ((a * b) + (a * c) + (b * c));
		volumen = a * b * c;
		diagonal = Math.sqrt(Math.pow(a, exponente1) + Math.pow(b, exponente1) + Math.pow(c, exponente1));
		
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Su Area es: " + area);
		System.out.println("Su Volumen es: " + volumen);
		System.out.println("Su Diagonal es: " + diagonal);
	}
	@Override
	public void forma() {
		System.out.println("El ortoedro tiene forma rectangular");
	}
	@Override
	public void color() {
		System.out.println("El ortoedro es de color rojo");
	}
	
	
	public Ortoedro(double a, double b, double c, double diagonal, double area, double volumen, int exponente1) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.diagonal = diagonal;
		this.area = area;
		this.volumen = volumen;
		this.exponente1 = exponente1;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public double getExponente1() {
		return exponente1;
	}

	public void setExponente1(int exponente1) {
		this.exponente1 = exponente1;
	}

	
}
