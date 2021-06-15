package paqueteDeApps;

public class ClienteVIP {

	private String nombre, correo;
	private int limiteCreditos;
	
	 public ClienteVIP() {
		 this("SinNombre", "nombre@email.com", 3);
	 }
	
	 public ClienteVIP(String nombre, String correo, int limiteCreditos) {
		 this.nombre = nombre;
		 this.correo = correo;
		 this.limiteCreditos = limiteCreditos;
		 
	 }
	 
	 public ClienteVIP(String correo, int limiteCreditos) {
		 this("sinNombre", correo, limiteCreditos);
	 }

	 //getters
	public String obtenerNombre() {
		return nombre;
	}

	public String obtenerCorreo() {
		return correo;
	}

	public int obtenerLimiteCreditos() {
		return limiteCreditos;
	}
}
