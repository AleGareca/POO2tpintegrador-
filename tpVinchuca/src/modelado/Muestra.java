package modelado;

public class Muestra {
	private String tipoVinchuca;
	private Ubicacion ubicacion;
	private Foto foto;
	private String alias;
	
	public Muestra(Ubicacion ubicacion,Foto foto) {
		this.ubicacion=ubicacion;
		this.foto=foto;
	}

	public String getTipoDeVinchuca() {
		return this.tipoVinchuca;
	}
	
	
}
