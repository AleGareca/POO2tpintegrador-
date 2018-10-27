package model;

import java.util.List;

public class NivelExperto implements INivelConocimiento {

	@Override
	public Integer nivelDeVoloracion() {
		return 2;
	}

	@Override
	public INivelConocimiento evaluarse(List muestras, List verificaciones) {
		
		if (muestras.size() >= 10 && verificaciones.size() >= 200)
				
		{ return new NivelExperto();}
		else
		{
			return new NivelBasico();
		}
	}

}
