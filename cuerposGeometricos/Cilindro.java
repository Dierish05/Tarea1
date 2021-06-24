package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cilindro extends CuerposGeometricos {
	
	private int exponente1;
	private double radio, h, perimetroBase, areaBase, areaLateral, areaTotal, volumen;
	
	public void pedirCilindro(Scanner entrada) {
		
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
	
	public void calcularCilindro(int exponente1) {
		
		perimetroBase = 2 * (Math.PI) * radio;
   		areaBase = Math.PI * Math.pow(radio, exponente1);
   		areaLateral = perimetroBase * h;
   		areaTotal = areaLateral + (2 * areaBase);
   		volumen = areaBase * h;
   		
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("El Area Lateral del cilindro es: " + areaLateral);
   		System.out.println("El Area Total del cilindro es: " + areaTotal);
   		System.out.println("El volumen del cilindro es: " + volumen);	
	}
	@Override
	public void forma() {
		System.out.println("El cilindro tiene forma circular");
	}
	@Override
	public void color() {
		System.out.println("El cilindro es color verde");
	}
	
	public Cilindro(double radio, double h, double perimetroBase, double areaBase, double areaLateral, double areaTotal,
			double volumen, int exponente1) {
		this.radio = radio;
		this.h = h;
		this.perimetroBase = perimetroBase;
		this.areaBase = areaBase;
		this.areaLateral = areaLateral;
		this.areaTotal = areaTotal;
		this.volumen = volumen;
		this.exponente1 = exponente1;
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

	public double getPerimetroBase() {
		return perimetroBase;
	}

	public void setPerimetroBase(double perimetroBase) {
		this.perimetroBase = perimetroBase;
	}

	public double getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
	}

	public double getAreaLateral() {
		return areaLateral;
	}

	public void setAreaLateral(double areaLateral) {
		this.areaLateral = areaLateral;
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
