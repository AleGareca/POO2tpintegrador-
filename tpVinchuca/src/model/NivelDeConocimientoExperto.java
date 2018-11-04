package model;

public class NivelDeConocimientoExperto implements INivelDeConocimiento {

	@Override
	public INivelDeConocimiento calcularNivelDeConocimiento(Usuario usuario) {
		INivelDeConocimiento res = null;
		
		if(usuario.cantDeReviciones()>20&& usuario.cantEnvios()>10) {
		res= this;
		}
		return res;
	}

	

}
