package model;

public class NivelExpecialista implements INivelDeConocimiento {

	@Override
	public String nivelDeVoloracion() {
		return null;
	}

	@Override
	public INivelDeConocimiento evaluarse() {
		return new NivelExpecialista();
	}

}
