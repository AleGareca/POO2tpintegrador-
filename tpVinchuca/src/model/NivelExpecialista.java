package model;

import java.util.List;

public class NivelExpecialista implements INivelConocimiento {

	@Override
	public Integer nivelDeVoloracion() {
		return 3;
	}

	@Override
	public INivelConocimiento evaluarse(List muestras, List verificacionese) {
		return new NivelExpecialista();
	}

}
