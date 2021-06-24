package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cono extends CuerposGeometricos {
	
	private int exponente1;
	private double radio, h, generatriz, perimetroBase, areaLateral, areaBase, areaTotal, volumen;
	
	public void pedirCono(Scanner entrada) {
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

	public void calcularCono(int exponente1) {
	   
		generatriz = Math.sqrt(Math.pow(h, exponente1) + Math.pow(radio, exponente1));
		perimetroBase = 2 * (Math.PI) * radio;
		areaLateral = (perimetroBase * generatriz) / 2;
		areaBase = Math.PI * Math.pow(radio, exponente1);
		areaTotal = areaLateral + areaBase;
		volumen = (areaBase * h) / 3;
		
   }
	
	@Override
	public void mostrarDatos() {
		System.out.println("Su Area Lateral es: " + areaLateral);
		System.out.println("Su Area Total es: " + areaTotal);
		System.out.println("Su Volumen es: " + volumen);
	}
	@Override
	public void forma() {
		System.out.println("El Cono tiene circular y piramidal");
	}
	@Override
	public void color() {
		System.out.println("El cono es de color verde");
	}
	
	public Cono(int exponente1, double radio, double h, double generatriz, double perimetroBase, double areaLateral,
			double areaBase, double areaTotal, double volumen) {
		this.exponente1 = exponente1;
		this.radio = radio;
		this.h = h;
		this.generatriz = generatriz;
		this.perimetroBase = perimetroBase;
		this.areaLateral = areaLateral;
		this.areaBase = areaBase;
		this.areaTotal = areaTotal;
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

	public double getGeneratriz() {
		return generatriz;
	}

	public void setGeneratriz(double generatriz) {
		this.generatriz = generatriz;
	}

	public double getPerimetroBase() {
		return perimetroBase;
	}

	public void setPerimetroBase(double perimetroBase) {
		this.perimetroBase = perimetroBase;
	}

	public double getAreaLateral() {
		return areaLateral;
	}

	public void setAreaLateral(double areaLateral) {
		this.areaLateral = areaLateral;
	}

	public double getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
}
