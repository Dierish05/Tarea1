package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TroncoDePiramide extends CuerposGeometricos {
	
	private int n , exponente1;
	private double areaLateral, areaTotal, volumen, areaBaseMayor, areaBaseMenor, angulo, angulo2;
	private double h, apotemaPiramide, apotemaBaseMayor, apotemaBaseMenor,apotemaBase;
	private double perimetroMayor, perimetroMenor, longitudMayor, longitudMenor, angulo3, angulo4;

	public void pedirTroncoDePiramide(Scanner entrada) {
	
	do {
		comprobacion = 2;
	try {
	System.out.println("ingresar altura del Tronco de Piramide: ");
	h = entrada.nextDouble();
	
	while(h <= 0) {
		   System.out.println("La altura no puede ser 0 o negativa\n");
		   System.out.println("ingresar altura del Tronco de Piramide: ");
			h = entrada.nextDouble();
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
	System.out.println("ingrese la Longitud Mayor del Tronco de Piramide: ");
	longitudMayor = entrada.nextDouble();
	
	while(longitudMayor <= 0) {
		   System.out.println("La Longitud mayor no puede ser 0 o negativa\n");
		   System.out.println("ingrese la Longitud Mayor del Tronco de Piramide: ");
		   longitudMayor = entrada.nextDouble();
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
	System.out.println("ingrese la Longitud Menor del Tronco de Piramide: ");
	longitudMenor = entrada.nextDouble();
	
	while(longitudMenor <= 0) {
		   System.out.println("La Longitud menor no puede ser 0 o negativa\n");
		   System.out.println("ingrese la Longitud Menor del Tronco de Piramide: ");
			longitudMenor = entrada.nextDouble();
		}
	} catch (InputMismatchException ex) {
		System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
		entrada.nextLine();
		comprobacion = 1;
	}
	}while(comprobacion != 2);
	
	while(longitudMayor < longitudMenor) {
		System.out.println("La longitud menor no puede ser mayor que la longitud mayor\n");
		do {
			comprobacion = 2;
		try {
		System.out.println("ingrese la Longitud Mayor del Tronco de Piramide: ");
		longitudMayor = entrada.nextDouble();
		
		while(longitudMayor <= 0) {
			   System.out.println("La Longitud mayor no puede ser 0 o negativa\n");
			   System.out.println("ingrese la Longitud Mayor del Tronco de Piramide: ");
			   longitudMayor = entrada.nextDouble();
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
		System.out.println("ingrese la Longitud Menor del Tronco de Piramide: ");
		longitudMenor = entrada.nextDouble();
		
		while(longitudMenor <= 0) {
			   System.out.println("La Longitud menor no puede ser 0 o negativa\n");
			   System.out.println("ingrese la Longitud Menor del Tronco de Piramide: ");
				longitudMenor = entrada.nextDouble();
			}
		} catch (InputMismatchException ex) {
			System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
			entrada.nextLine();
			comprobacion = 1;
		}
		}while(comprobacion != 2);
	}
	}
	
	public void calcularTroncoDePiramide(int exponente1, int n) {
		perimetroMayor = n * longitudMayor;
		perimetroMenor = n * longitudMenor;
		angulo = 360 / (2 * n);
		angulo2 = Math.toRadians(angulo);
		apotemaBaseMenor = longitudMenor / (2 * Math.tan(angulo2));
		angulo3 = 360 / (2 * n);
		angulo4 = Math.toRadians(angulo3);
		apotemaBaseMayor = longitudMayor / (2 * Math.tan(angulo4));
		apotemaBase = (apotemaBaseMayor - apotemaBaseMenor);
		apotemaPiramide = Math.sqrt(Math.pow(h, exponente1) + Math.pow(apotemaBase, exponente1));
		areaLateral = ((perimetroMayor + perimetroMenor) / 2) * apotemaPiramide;
		areaBaseMayor = (perimetroMayor * apotemaBaseMayor) /  2;
		areaBaseMenor = (perimetroMenor * apotemaBaseMenor) / 2;
		areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;
		volumen = (h * (areaBaseMayor +  areaBaseMenor + Math.sqrt(areaBaseMayor * areaBaseMenor))) / 3;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("El Area Lateral de tronco de piramide es: " + areaLateral);
   		System.out.println("El Area Total de tronco de piramide es: " + areaTotal);
   		System.out.println("El Volumen de tronco de piramide es: " + volumen);
	}
	@Override
	public void forma() {
		System.out.println("El tronco de piramide tiene forma cuadrada y triangular");
	}
	@Override
	public void color() {
		System.out.println("El tronco de piramide es de colot naranja");
	}
	
	public TroncoDePiramide(int n, int exponente1, double areaLateral, double areaTotal, double volumen,
			double areaBaseMayor, double areaBaseMenor, double angulo, double angulo2, double h, double apotemaPiramide,
			double apotemaBaseMayor, double apotemaBaseMenor, double apotemaBase, double perimetroMayor,
			double perimetroMenor, double longitudMayor, double longitudMenor, double angulo3, double angulo4) {
		super();
		this.n = n;
		this.exponente1 = exponente1;
		this.areaLateral = areaLateral;
		this.areaTotal = areaTotal;
		this.volumen = volumen;
		this.areaBaseMayor = areaBaseMayor;
		this.areaBaseMenor = areaBaseMenor;
		this.angulo = angulo;
		this.angulo2 = angulo2;
		this.h = h;
		this.apotemaPiramide = apotemaPiramide;
		this.apotemaBaseMayor = apotemaBaseMayor;
		this.apotemaBaseMenor = apotemaBaseMenor;
		this.apotemaBase = apotemaBase;
		this.perimetroMayor = perimetroMayor;
		this.perimetroMenor = perimetroMenor;
		this.longitudMayor = longitudMayor;
		this.longitudMenor = longitudMenor;
		this.angulo3 = angulo3;
		this.angulo4 = angulo4;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getExponente1() {
		return exponente1;
	}

	public void setExponente1(int exponente1) {
		this.exponente1 = exponente1;
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

	public double getAreaBaseMayor() {
		return areaBaseMayor;
	}

	public void setAreaBaseMayor(double areaBaseMayor) {
		this.areaBaseMayor = areaBaseMayor;
	}

	public double getAreaBaseMenor() {
		return areaBaseMenor;
	}

	public void setAreaBaseMenor(double areaBaseMenor) {
		this.areaBaseMenor = areaBaseMenor;
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

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getApotemaPiramide() {
		return apotemaPiramide;
	}

	public void setApotemaPiramide(double apotemaPiramide) {
		this.apotemaPiramide = apotemaPiramide;
	}

	public double getApotemaBaseMayor() {
		return apotemaBaseMayor;
	}

	public void setApotemaBaseMayor(double apotemaBaseMayor) {
		this.apotemaBaseMayor = apotemaBaseMayor;
	}

	public double getApotemaBaseMenor() {
		return apotemaBaseMenor;
	}

	public void setApotemaBaseMenor(double apotemaBaseMenor) {
		this.apotemaBaseMenor = apotemaBaseMenor;
	}

	public double getApotemaBase() {
		return apotemaBase;
	}

	public void setApotemaBase(double apotemaBase) {
		this.apotemaBase = apotemaBase;
	}

	public double getPerimetroMayor() {
		return perimetroMayor;
	}

	public void setPerimetroMayor(double perimetroMayor) {
		this.perimetroMayor = perimetroMayor;
	}

	public double getPerimetroMenor() {
		return perimetroMenor;
	}

	public void setPerimetroMenor(double perimetroMenor) {
		this.perimetroMenor = perimetroMenor;
	}

	public double getLongitudMayor() {
		return longitudMayor;
	}

	public void setLongitudMayor(double longitudMayor) {
		this.longitudMayor = longitudMayor;
	}

	public double getLongitudMenor() {
		return longitudMenor;
	}

	public void setLongitudMenor(double longitudMenor) {
		this.longitudMenor = longitudMenor;
	}

	public double getAngulo3() {
		return angulo3;
	}

	public void setAngulo3(double angulo3) {
		this.angulo3 = angulo3;
	}

	public double getAngulo4() {
		return angulo4;
	}

	public void setAngulo4(double angulo4) {
		this.angulo4 = angulo4;
	}
}
