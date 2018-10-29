package model;


public class Alta implements Nivel{

	@Override
	public void verificarNivelPara(Muestra muestra) {
		if(muestra.hayExpertos()) {
			muestra.alta();
		}
		
	}

}