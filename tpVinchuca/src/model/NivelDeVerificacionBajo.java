package model;

public class NivelDeVerificacionBajo implements INivelDeVerificacion{

	@Override
	public void verificarNivelPara(Muestra muestra) {
		if (muestra.cantValidaciones() == 1) {
			
		} else if (muestra.cantValidaciones() == 1 && this.verificacionesIdistintas(muestra.getValidaciones())) {
			muestra.baja();
		}

		
	}

	private void nivelDeValidacion(NivelDeVerificacionBajo nivelDeVerificacionBajo) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
