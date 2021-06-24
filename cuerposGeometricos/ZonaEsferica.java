package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZonaEsferica extends CuerposGeometricos {
	
	private int exponente1;
	private double radio, h, radioMayor, radioMenor, area, volumen;
	
	public  void pedirZonaEsferica(Scanner entrada) {
		
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
		
		do {
			comprobacion = 2;
		try {
		System.out.println("Ingrese el Radio Mayor: ");
		radioMayor = entrada.nextDouble();
		
		while(radioMayor <= 0) {
			   System.out.println("El radio mayor no puede ser 0 o negativa\n");
			   System.out.println("Ingrese el Radio Mayor: ");
				radioMayor = entrada.nextDouble();
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
		System.out.println("Ingrese el Radio Menor: ");
		radioMenor = entrada.nextDouble();
		
		while(radioMenor <= 0) {
			   System.out.println("El radio menor no puede ser 0 o negativa\n");
			   System.out.println("Ingrese el Radio Menor: ");
				radioMenor = entrada.nextDouble();
			}
		} catch (InputMismatchException ex) {
			System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
			entrada.nextLine();
			comprobacion = 1;
		}
		}while(comprobacion != 2);
		
		while(radioMayor < radioMenor) {
			System.out.println("\nEl radio menor no puede ser mayor que el radio mayor\n");
			do {
				comprobacion = 2;
			try {
			System.out.println("Ingrese el Radio Mayor: ");
			radioMayor = entrada.nextDouble();
			
			while(radioMayor <= 0) {
				   System.out.println("\nEl radio mayor no puede ser 0 o negativa\n");
				   System.out.println("Ingrese el Radio Mayor: ");
					radioMayor = entrada.nextDouble();
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
			System.out.println("Ingrese el Radio Menor: ");
			radioMenor = entrada.nextDouble();
			
			while(radioMenor <= 0) {
				   System.out.println("El radio menor no puede ser 0 o negativa\n");
				   System.out.println("Ingrese el Radio Menor: ");
					radioMenor = entrada.nextDouble();
				}
			} catch (InputMismatchException ex) {
				System.out.println("Debe de introducir un numero correspondiente a lo pedido\n");
				entrada.nextLine();
				comprobacion = 1;
			}
			}while(comprobacion != 2);
		}
	}
	
	public void calcularZonaEsferica(int exponente1) {
		area = 2 * Math.PI * radio * h;
   		volumen = (Math.PI * h * (Math.pow(h, exponente1) + 3 * Math.pow(radioMayor, exponente1) + 3 * Math.pow(radioMenor, exponente1))) / 6;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("El Area de la Zona Esferica es: " + area);
   		System.out.println("EL volumen de la Zona Esferica es: " + volumen);
	}
	@Override
	public void forma() {
		System.out.println("La zona esferica tiene forma circular");
	}
	@Override
	public void color() {
		System.out.println("El ortoedro es de color morado");
	}
	
	public ZonaEsferica(int exponente1, double radio, double h, double radioMayor, double radioMenor, double area,
			double volumen) {
		this.exponente1 = exponente1;
		this.radio = radio;
		this.h = h;
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
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

	public double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(double radioMenor) {
		this.radioMenor = radioMenor;
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
