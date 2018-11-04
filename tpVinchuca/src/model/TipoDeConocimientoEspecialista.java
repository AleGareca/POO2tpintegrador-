package model;

public class TipoDeConocimientoEspecialista extends TipoDeConocimiento {
	

	public INivelDeConocimiento getNivelDeConocimiento(Usuario usuario) {
		
		return new NivelDeConocimientoExperto();
	}

}
