package cuerposGeometricos;

public abstract class CuerposGeometricos {
	 
	protected int comprobacion = 2;

	public abstract void forma();
	public abstract void color();
	public abstract void mostrarDatos();
	
	public int getComprobacion() {
		return comprobacion;
	}
	public void setComprobacion(int comprobacion) {
		this.comprobacion = comprobacion;
	}
}
