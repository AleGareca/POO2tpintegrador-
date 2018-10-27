package model;
import java.awt.List;

public class Usuario {
	private String alias;
	private INivelDeConocimiento miNivel;
	
	
	public Usuario( String alias) {
		this.alias = alias;
		this.miNivel = new NivelBasico();
	}

	
	public INivelDeConocimiento nivelDeConocimiento() {
		return this.miNivel;
	}

	
	public String alias() {
		return this.alias;
	}
	
	
	
}
