package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prisma extends CuerposGeometricos {
	
	private int n;
	private double longitud, h, perimetroBase, angulo, angulo2, apotemaBase, areaLateral, areaBase, areaTotal, volumen;
	
	public void pedirPrisma(Scanner entrada) {
		
		do {
			comprobacion = 2;
		try {
			System.out.println("ingrese numero de lados del prisma: ");
			n = entrada.nextInt();
			
      while(n <= 2) {
			   System.out.println("El numero de lados del prisma deben ser de 3 a mas\n");
			   System.out.println("ingrese numero de lados del prisma: ");
			   n = entrada.nextInt();
			}
		} catch (InputMismatchException ex) {
			System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
			entrada.nextLine();
			comprobacion = 1;
		}
		}while(comprobacion != 2);
			
      do {
			comprobacion = 2;
		try{
			System.out.println("ingrese la longitud de los lados de la base del prisma: ");
			longitud = entrada.nextDouble();
			
			while(longitud <= 0) {
				   System.out.println("La longitud de los lados no puede ser 0 o negativa\n");
				   System.out.println("ingrese la longitud de los lados de la base del prisma: ");
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
			try{
			System.out.println("ingrese altura del prisma: ");
			h = entrada.nextDouble();
			
			while(h <= 0) {
				   System.out.println("La altura no puede ser 0 o negativa\n");
				   System.out.println("ingrese altura del prisma: ");
				   h = entrada.nextDouble();
				}
		} catch (InputMismatchException ex) {
			System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
			entrada.nextLine();
			comprobacion = 1;
		}
		}while(comprobacion != 2);
		
	}
	
	public void calcularPrisma() {
		
		perimetroBase = n * longitud;
   		angulo = 360 / (2 * n);
   		angulo2 = Math.toRadians(angulo);
   		apotemaBase = longitud / (2 * Math.tan(angulo2));
   		areaLateral = perimetroBase * h;
   		areaBase = (perimetroBase * apotemaBase) / 2;
   		areaTotal = areaLateral + (2 * areaBase);
   		volumen = areaBase * h;
   		
	}
	
	@Override
	public void mostrarDatos() {
   		System.out.println("El Area Lateral del prisma es: " + areaLateral);
   		System.out.println("El Area Total del prisma es: " + areaTotal);
   	    System.out.println("El Volumen del prisma es: " + volumen);
	}
	@Override
	public void forma() {
		System.out.println("El prisma tiene forma rectangular");
	}
	@Override
	public void color() {
		System.out.println("El ortoedro tiene color azul");
	}
	
	public Prisma(int n, double longitud, double h, double perimetroBase, double angulo, double angulo2,
			double apotemaBase, double areaLateral, double areaBase, double areaTotal, double volumen) {
		this.n = n;
		this.longitud = longitud;
		this.h = h;
		this.perimetroBase = perimetroBase;
		this.angulo = angulo;
		this.angulo2 = angulo2;
		this.apotemaBase = apotemaBase;
		this.areaLateral = areaLateral;
		this.areaBase = areaBase;
		this.areaTotal = areaTotal;
		this.volumen = volumen;
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
