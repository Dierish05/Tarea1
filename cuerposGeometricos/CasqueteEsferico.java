package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CasqueteEsferico extends CuerposGeometricos {
	
	private int exponente1;
	private double radio, h, area, volumen;

	public void pedirCasqueteEsferico(Scanner entrada) {
		
		do {
			comprobacion = 2;
		try {
		System.out.println("ingrese el radio: ");
		radio = entrada.nextDouble();
		
		while(radio <= 0) {
			   System.out.println("El radio no puede ser 0 o negativa\n");
			   System.out.println("ingrese el radio: ");
				radio = entrada.nextDouble();
			}
		} catch (InputMismatchException ex) {
			System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
			entrada.nextLine();
			comprobacion = 1;
		}
		}while(comprobacion != 2);
		
		do {
			comprobacion = 2;
		try {
       	System.out.println("ingrese la altura: ");
		h = entrada.nextDouble();
		
		while(h <= 0) {
			   System.out.println("La altura no puede ser 0 o negativa\n");
			   System.out.println("ingrese altura: ");
			   h = entrada.nextDouble();
			}
		} catch (InputMismatchException ex) {
			System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
			entrada.nextLine();
			comprobacion = 1;
		}
		}while(comprobacion != 2);
	}
	
	public void calcularCasqueteEsferico(int exponente1) {
		area = 2 * Math.PI * radio * h;
   		volumen = (Math.PI * Math.pow(h, exponente1) * ((3 * radio) - h)) / 3;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("El Area del Casquete Esferico es: " + area);
   		System.out.println("EL volumen del Casquete Esferico es: " + volumen);
	}
	@Override
	public void forma() {
		System.out.println("El casquete esferico tiene forma circular");
	}
	@Override
	public void color() {
		System.out.println("El casquete esferico es de color morado");
	}

	public CasqueteEsferico(int exponente1, double radio, double h, double area, double volumen) {
		this.exponente1 = exponente1;
		this.radio = radio;
		this.h = h;
		this.area = area;
		this.volumen = volumen;
	}

	public int getExponente1() {
		return exponente1;
	}

	public void setExponente1(int exponente1) {
		this.exponente1 = exponente1;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
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
}
