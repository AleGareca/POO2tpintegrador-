package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String alias;
	private INivelConocimiento miNivel;
	
	
	public Usuario( String alias, INivelConocimiento nivel) {
		this.alias = alias;
		this.miNivel = nivel;
	}

	
	public INivelConocimiento nivelDeConocimiento(List muestras, List verificaciones) {
		return this.miNivel.evaluarse(muestras, verificaciones);
	}

	
	public String alias() {
		return this.alias;
	}


	public Object getConocimiento() {
		
		return this.miNivel;
	}

}
