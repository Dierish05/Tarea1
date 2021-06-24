package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dodecaedro extends CuerposGeometricos {

	private int n, exponente1, exponente2;
	double area, volumen, a;
    double angulo, angulo2, apotemaBase, areaPentagonal;
	
	public void PedirDodecaedro(Scanner entrada) {
		
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
	
	public void CalcularDodecaedro(int n, int exponente1, int exponente2) {
		area = 3 * Math.pow(a, exponente1) * Math.sqrt(25 + 10 * Math.sqrt(5));
   		volumen = ((15 + 7 * Math.sqrt(5)) * Math.pow(a, exponente2)) / 4;
   		angulo = 360 / (2 * n);
   		angulo2 = Math.toRadians(angulo);
   		apotemaBase = a / (2 * Math.tan(angulo2));
   		areaPentagonal = (5 * a * apotemaBase) / 2;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Su Area es: " + area);
   		System.out.println("Su Volumen es: " + volumen);
   		System.out.println("Su Area Pentagonal es: " + areaPentagonal);
	}
	@Override
	public void forma() {
		System.out.println("El dodecaedro tiene forma pentagonal");
	}
	@Override
	public void color() {
		System.out.println("El dodecaedro es de color dorado");
	}

	public Dodecaedro(int n, int exponente1, int exponente2, double area, double volumen, double a, double angulo,
			double angulo2, double apotemaBase, double areaPentagonal) {
		this.n = n;
		this.exponente1 = exponente1;
		this.exponente2 = exponente2;
		this.area = area;
		this.volumen = volumen;
		this.a = a;
		this.angulo = angulo;
		this.angulo2 = angulo2;
		this.apotemaBase = apotemaBase;
		this.areaPentagonal = areaPentagonal;
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

	public double getAreaPentagonal() {
		return areaPentagonal;
	}

	public void setAreaPentagonal(double areaPentagonal) {
		this.areaPentagonal = areaPentagonal;
	}
}
