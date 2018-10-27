package model;

import java.util.List;

public class NivelBasico implements INivelConocimiento {

	@Override
	public Integer nivelDeVoloracion() {
		
		return 1;
	}

	@Override
	public INivelConocimiento evaluarse(List muestras, List verificaciones) {
		
		if (muestras.size() >= 10 && verificaciones.size() >= 20)
				
		{ return new NivelExperto();}
		else
		{
			return new NivelBasico();
		}
	}

}
