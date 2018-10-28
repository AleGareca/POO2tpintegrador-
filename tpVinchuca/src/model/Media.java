package model;

import java.util.ArrayList;

public class Media implements Nivel {

	@Override
	public void verificarNivelPara(Muestra muestra) {
		this.validacionUnanime(muestra);
	}

	// recorre las verificaciones y compara los tipos. Si hay dos tipos con iguales
	// el nivel se convierte en medio
	private void validacionUnanime(Muestra muestra) {
		ArrayList<Verificacion> verificaciones = muestra.getVerificaciones();
		int num = verificaciones.size();
		while (num < 0) {
			if (verificaciones.get(num).getTipo() != verificaciones.get(num - 1).getTipo()) {
				muestra.cambiarTipo(verificaciones.get(num).getTipo());
				muestra.media();
			}
		}
	}

}
