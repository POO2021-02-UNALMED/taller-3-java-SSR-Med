package taller.televisores;

public class Control {
	TV tv;
	
	
	public void turnOn() {
		tv.estado = true;
	}
	public void turnOff() {
		tv.estado = false;
	}

	
	
	
	public void canalUp() {
		if(tv.estado == true) {
			if(tv.canal > 0 & tv.canal < 121) {
				tv.canal = tv.canal + 1;
			}
		}
	}
	
	
	public void canalDown() {
		if(tv.estado == true) {
			if(tv.canal > 0 & tv.canal < 121) {
				tv.canal = tv.canal - 1;
			}
		}
	}
	
	
	public void volumenUp() {
		if(tv.estado == true) {
			if(tv.volumen > -1 & tv.volumen < 8) {
				tv.volumen = tv.volumen + 1;
			}
		}
	}
	
	
	
	public void volumenDown() {
		if(tv.estado == true) {
			if(tv.volumen > -1 & tv.volumen < 8) {
				tv.volumen = tv.volumen -1;
			}
		}
	}
	
	
	public void setCanal(int canal) {
		if(tv.estado == true) {
			if(tv.canal > 0 & tv.canal < 121) {
				tv.canal = canal;
			}
		}
	}
	
	
	
	public void enlazar(TV televisor) {
		this.tv = televisor;
		tv.control = this;
	}
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV televisor) {
		this.tv = televisor;
	}
}
