package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esfera extends CuerposGeometricos {
	
	private int exponente1, exponente2;
	private double area, volumen, radio;
	
	public void pedirEsfera(Scanner entrada) {
		 do {
	   			comprobacion = 2;
	   		try {
	    	   System.out.println("ingrese su Radio: ");
	   		radio = entrada.nextDouble();
	   		
	   		while(radio <= 0) {
				   System.out.println("El radio  no puede ser 0 o negativa\n");
				   System.out.println("ingrese el radio: ");
					radio = entrada.nextDouble();
				}
	   		} catch (InputMismatchException ex) {
				System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
				entrada.nextLine();
				comprobacion = 1;
			}
			}while(comprobacion != 2);
	}
	
	public void calcularEsfera(int exponente1, int exponente2) {
			area = 4 * Math.PI * Math.pow(radio, exponente1);
	   		volumen = (4 * Math.PI * Math.pow(radio, exponente2)) / 3;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("el Area de la esfera es: " + area);
   		System.out.println("el Volumen de la esfera es: " + volumen);
	}
	@Override
	public void forma() {
		System.out.println("El ortoedro tiene forma circular");
	}
	@Override
	public void color() {
		System.out.println("La esfera es  de color morado");
	}
	
	public Esfera(int exponente1, int exponente2, double area, double volumen, double radio) {
		this.exponente1 = exponente1;
		this.exponente2 = exponente2;
		this.area = area;
		this.volumen = volumen;
		this.radio = radio;
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

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}
