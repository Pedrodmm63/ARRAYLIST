package arraylists;

public class Planeta {

	private String nombre;
	private double distancia;
	private double masa;
	
	public Planeta(String nombre, double distancia, double masa) {
		this.nombre = nombre;
		this.distancia = distancia;
		this.masa = masa;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getDistancia() {
		return distancia;
	}

	@Override
	public String toString() {
		return "Planeta [" + nombre + "," + distancia + "," + masa + "]";
	}
	
}
