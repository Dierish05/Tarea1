package tecla;

public class App {

	public static void main(String[] args) {
		Teclado teclado1 = new Teclado();
		
		System.out.println("Marca: " + teclado1.mostrarMarca());
		System.out.println("Tipo: " + teclado1.mostrarTipo());
		System.out.println("Idioma: " + teclado1.mostrarIdioma());
		System.out.println("Color: " + teclado1.mostrarColor());
		System.out.println("Tamano: " + teclado1.mostrarTamano());
		System.out.println("precio: " + teclado1.mostrarPrecio());
		System.out.println("Rbg: " + teclado1.mostrarRgb());
		
		

	}

}
