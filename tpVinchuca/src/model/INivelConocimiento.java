package model;


import java.util.ArrayList;
import java.util.List;

public interface INivelConocimiento {

	
	public Integer nivelDeVoloracion();
	public INivelConocimiento evaluarse(List muestras, List verificaciones);
}
