package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Piramide extends CuerposGeometricos {
	
	private int exponente1, n;
	private double longitud, h, perimetroBase, angulo, angulo2, apotemaBase, apotemaPiramide, areaLateral, areaBase, areaTotal, volumen;

	public void pedirPiramide(Scanner entrada) {
		
		do {
			comprobacion = 2;
		try {
		System.out.println("ingrese la longitud de los lados de la piramide: ");
		longitud = entrada.nextDouble();
		
		while(longitud <= 0) {
			   System.out.println("La longitud de los lados no puede ser 0 o negativa\n");
			   System.out.println("ingrese la longitud de los lados de la piramide: ");
			   longitud = entrada.nextDouble();
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
		System.out.println("ingresar la altura de la piramide");
		h = entrada.nextDouble();
		
		while(h <= 0) {
			   System.out.println("La altura no puede ser 0 o negativa\n");
			   System.out.println("ingresar la altura de la piramide");
				h = entrada.nextDouble();
			}
		} catch (InputMismatchException ex) {
			System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
			entrada.nextLine();
			comprobacion = 1;
		}
		}while(comprobacion != 2);
	}
	
	public void calcularPiramide(int exponente1, int n) {
		
		perimetroBase = n * longitud;
   		angulo = 360 / (2 * n);
   		angulo2 = Math.toRadians(angulo);
   		apotemaBase = longitud / (2 * Math.tan(angulo2));
   		apotemaPiramide = Math.sqrt(Math.pow(h, exponente1) + Math.pow(apotemaBase, exponente1));
   		areaLateral = (perimetroBase * apotemaPiramide) / 2;
   		areaBase = (perimetroBase * apotemaBase) / 2;
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
		System.out.println("El ortoedro tiene forma rectangular");
	}
	@Override
	public void color() {
		System.out.println("El cilindro es de color amarillo");
	}
	
	public Piramide(int exponente1, int n, double longitud, double h, double perimetroBase, double angulo,
			double angulo2, double apotemaBase, double apotemaPiramide, double areaLateral, double areaBase,
			double areaTotal, double volumen) {
		this.exponente1 = exponente1;
		this.n = n;
		this.longitud = longitud;
		this.h = h;
		this.perimetroBase = perimetroBase;
		this.angulo = angulo;
		this.angulo2 = angulo2;
		this.apotemaBase = apotemaBase;
		this.apotemaPiramide = apotemaPiramide;
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

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
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

	public double getApotemaBase() {
		return apotemaBase;
	}

	public void setApotemaBase(double apotemaBase) {
		this.apotemaBase = apotemaBase;
	}

	public double getApotemaPiramide() {
		return apotemaPiramide;
	}

	public void setApotemaPiramide(double apotemaPiramide) {
		this.apotemaPiramide = apotemaPiramide;
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
