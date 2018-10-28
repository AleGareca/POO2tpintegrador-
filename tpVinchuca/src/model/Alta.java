package model;




public class Alta implements Nivel{

	@Override
	public void verificarNivelPara(Muestra muestra) {
		if(muestra.hayExpertos()) {
		Verificacion validacionExperto = muestra.buscarVerificacioPor(muestra.aliasDeExperto());	
		muestra.cambiarTipo(validacionExperto.getTipo());
			muestra.alta();
		}
		
	}

}