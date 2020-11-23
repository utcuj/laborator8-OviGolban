import java.awt.Color;

public class Masina implements Cloneable {
	String marca;
	Color culoare;
	
	public Masina(String marca, Color culoare) {
		this.marca = marca;
		this.culoare = culoare;
	}
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Color getCuloare() {
		return culoare;
	}


	public void setCuloare(Color culoare) {
		this.culoare = culoare;
	}


	public void vopsire(Color x) {
		this.culoare = x;
	}
	
	public String toString() {
		return "masina marca:" + marca + " de culoare:"+culoare;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
