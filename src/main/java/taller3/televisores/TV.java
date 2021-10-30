package taller.televisores;

public class TV {
	private Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV; 
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	
	
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public static int getnumTV() {
		return numTV;
	}
	
	
	
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	
	
	
	public void canalUp() {
		if(estado == true) {
			if(canal > 0 & canal < 121) {
				canal = canal + 1;
			}
		}
	}
	
	
	public void canalDown() {
		if(estado == true) {
			if(canal > 0 & canal < 121) {
				canal = canal - 1;
			}
		}
	}
	
	
	public void volumenUp() {
		if(estado == true) {
			if(volumen > -1 & volumen < 8) {
				volumen = volumen + 1;
			}
		}
	}
	
	
	
	public void volumenDown() {
		if(estado == true) {
			if(volumen > -1 & volumen < 8) {
				volumen = volumen -1;
			}
		}
	}
}
	
