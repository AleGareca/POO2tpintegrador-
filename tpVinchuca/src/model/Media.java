package model;

import java.util.ArrayList;

public class Media implements Nivel {

	@Override
	public void verificarNivelPara(Muestra muestra) {
		if(muestra.cantVerificaciones()==2 && muestra.validacionUnanime()) {
			muestra.media();
	
		}else {if(muestra.cantVerificaciones()==3) {
			muestra.cambiarTipo(this.tipoConLegitimidad(muestra.getVerificaciones()));
			muestra.media();}
		}
		
	}

	@SuppressWarnings("null")
	private String tipoConLegitimidad(ArrayList<Verificacion> verificaciones) {
		ArrayList<String> res = null;

		for (Verificacion v : verificaciones) {
			res.add(v.alias());
		}
		return res.get(2);
		
		
		
	}

	

}
