package projetoAUto;

public class ClassesAutomotores {
	
	String corAt;
	String marcaAt;
	String modeloAt;
	String tipoAt;
	
    public ClassesAutomotores () {
		
	}
	
	public ClassesAutomotores (String corPar, String marcaPar, String modeloPar, String tipoPar) {
		this.corAt = corPar;
		this.marcaAt = marcaPar;
		this.modeloAt = modeloPar;
		this.tipoAt = tipoPar;
		
	}
	
	public String getcorAt() {
		return corAt;
	}
	
	public void setcorAt(String corPar) {
		this.corAt = corPar;
	}
	
	
	public String getmarcaAt() {
		return marcaAt;
	}
	
	public void setmarcaAt(String marcaPar) {
		this.marcaAt = marcaPar;
	}
	
	public String getmodeloAt() {
		return modeloAt;
	}
	
	public void setmodeloAt(String modeloPar) {
		this.modeloAt = modeloPar;
	}
	
	
	public String gettipoAt() {
		return tipoAt;
	}
	
	public void settipoAt(String tipoPar) {
		this.tipoAt = tipoPar;
	}

}
