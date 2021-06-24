package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HusoYCunaEsferica extends CuerposGeometricos {
	
	private int exponente1, exponente2;
	private double area, volumen, radio, angulo, angulo2;
	
	public void pedirHusoYCunaEsferica(Scanner entrada){
		
		do {
 		   try {
 			   comprobacion = 2;
 	   System.out.println("ingrese el angulo: ");
		angulo = entrada.nextDouble();
		
		while(angulo <= 0) {
			   System.out.println("El aungulo no puede ser 0 o negativa\n");
			   System.out.println("ingrese el angulo: ");
		   		angulo = entrada.nextDouble();
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
	}
	
	public void CalcularHusoYCunaEsferica(int exponente1, int exponente2) {
		angulo2 = Math.toRadians(angulo);
   		area = (4 * Math.PI * Math.pow(radio, exponente1) * angulo2) / 360;
   		volumen = (4 * Math.PI * Math.pow(radio, exponente2) * angulo2) / (3 * 360);
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("EL area del Huso Esferico es: " + area);
   		System.out.println("El volumen de la Cuña esferica es: " + volumen);
	}
	@Override
	public void forma() {
		System.out.println("El Huso Esferico tiene forma circular");
		System.out.println("La Cuña esferica tiene forma circular");
	}
	@Override
	public void color() {
		System.out.println("El Huso Esferico es de color gris");
		System.out.println("La Cuña esferica es de color gris");
	}
	
	public HusoYCunaEsferica(int exponente1, int exponente2, double area, double volumen, double radio, double angulo,
			double angulo2) {
		this.exponente1 = exponente1;
		this.exponente2 = exponente2;
		this.area = area;
		this.volumen = volumen;
		this.radio = radio;
		this.angulo = angulo;
		this.angulo2 = angulo2;
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

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

	public double getAngulo2() {
		return angulo2;
	}

	public void setAngulo2(double angulo2) {
		this.angulo2 = angulo2;
	}
}
