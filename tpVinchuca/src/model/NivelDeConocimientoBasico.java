package model;

public class NivelDeConocimientoBasico implements INivelDeConocimiento {

	
		@Override
		public INivelDeConocimiento calcularNivelDeConocimiento(Usuario usuario) {
			INivelDeConocimiento res = null;
			
			if(usuario.cantDeReviciones()<20&& usuario.cantEnvios()<10) {
			res= this;
			}
			return res;
		}
	}

		
	
	



