package tecla;

public class Teclado {

	String marca, tipo, idioma, color, tamano;
	Double precio;
	boolean rgb;
	
	public Teclado() {
		this("sin asignar marca", "mecanico", "ingles US", "color", "TKL", 0, false);
		System.out.println("\nSe a creado un nuevo objeto\n");
	}
	
	public Teclado(String marca, String tipo, String idioma, String color, String tamano, double precio, boolean rgb) {
		this.marca = marca;
		this.tipo = tipo;
		this.idioma = idioma;
		this.color = color;
		this.tamano = tamano;
		this.precio = precio;
		this.rgb = rgb;
		
	}
	
	//getters y setters
	public String mostrarMarca() {
		return marca;
	}
	public void cambiarMarca(String marca) {
		this.marca = marca;
	}
	public String mostrarTipo() {
		return tipo;
	}
	public void cambiarTipo(String tipo) {
		this.tipo = tipo;
	}
	public String mostrarIdioma() {
		return idioma;
	}
	public void cambiarIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String mostrarColor() {
		return color;
	}
	public void cambiarColor(String color) {
		this.color = color;
	}
	public Double mostrarPrecio() {
		return precio;
	}
	public void cambiarPrecio(Double precio) {
		this.precio = precio;
	}
	public boolean mostrarRgb() {
		return rgb;
	}
	public void cambiarRgb(boolean rgb) {
		this.rgb = rgb;
	}
	public String mostrarTamano() {
		return tamano;
	}
	public void cambiarTamano(String tamano) {
		this.tamano = tamano;
	}
	
	
}
