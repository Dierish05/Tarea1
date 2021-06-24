package cuerposGeometricos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TroncoDeCono extends CuerposGeometricos {
	
	private int exponente1;
	private double areaLateral, areaTotal, volumen, areaBaseMayor;
	private double h, generatriz, radioMenor, radioMayor, areaBaseMenor;
	
	public void pedirTroncoDeCono(Scanner entrada) {
		
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
	
	public void calcularTroncoDeCono(int exponente1) {
		  generatriz = Math.sqrt(Math.pow(h, exponente1) + (Math.pow(radioMayor, exponente1) - Math.pow(radioMenor, exponente1)));
  		  areaLateral = Math.PI * generatriz * (radioMayor + radioMenor);
          areaBaseMayor = Math.PI * Math.pow(radioMayor, exponente1);
          areaBaseMenor = Math.PI * Math.pow(radioMenor, exponente1);	
          areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;
          volumen = (Math.PI * h * (Math.pow(radioMayor, exponente1) + Math.pow(radioMenor, exponente1) + radioMayor * radioMenor) / 3);
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Su area Lateral es: " + areaLateral);
        System.out.println("Su area Total es: " + areaTotal);
        System.out.println("Su Volumen es: " + volumen);
	}
	@Override
	public void forma() {
		System.out.println("El tronco de cono tiene forma circular");
	}
	@Override
	public void color() {
		System.out.println("El tronco de cono es de color cafe");
	}
	
	

	public TroncoDeCono(int exponente1, double areaLateral, double areaTotal, double volumen, double areaBaseMayor,
			double h, double generatriz, double radioMenor, double radioMayor, double areaBaseMenor) {
		this.exponente1 = exponente1;
		this.areaLateral = areaLateral;
		this.areaTotal = areaTotal;
		this.volumen = volumen;
		this.areaBaseMayor = areaBaseMayor;
		this.h = h;
		this.generatriz = generatriz;
		this.radioMenor = radioMenor;
		this.radioMayor = radioMayor;
		this.areaBaseMenor = areaBaseMenor;
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

	public double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(double radioMenor) {
		this.radioMenor = radioMenor;
	}

	public double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public double getAreaBaseMenor() {
		return areaBaseMenor;
	}

	public void setAreaBaseMenor(double areaBaseMenor) {
		this.areaBaseMenor = areaBaseMenor;
	}
}
