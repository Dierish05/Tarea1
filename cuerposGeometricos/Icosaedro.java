package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Icosaedro extends CuerposGeometricos {

	private int exponente1, exponente2;
	private double area, volumen, a;
	
	public void PedirIcosaedro(Scanner entrada) {
		
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
	
	public void CalcularIcosaedro(int exponente1, int exponente2) {
		area = 5 * Math.pow(a, exponente1) * Math.sqrt(3);
   		volumen = (5 * (3 + Math.sqrt(5)) * Math.pow(a, exponente2)) / 12;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Su Area es: " + area);
   		System.out.println("Su Volumen es: " + volumen);
	}
	@Override
	public void forma() {
		System.out.println("El icosaedro tiene forma triangular");
	}
	@Override
	public void color() {
		System.out.println("El icosaedro es de color celeste");
	}

	public Icosaedro(int exponente1, int exponente2, double area, double volumen, double a) {
		this.exponente1 = exponente1;
		this.exponente2 = exponente2;
		this.area = area;
		this.volumen = volumen;
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

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
}
