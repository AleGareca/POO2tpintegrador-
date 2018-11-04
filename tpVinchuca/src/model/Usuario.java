package model;
import java.util.Date;

public class Usuario {
	private String alias;
	private TipoDeConocimiento tipoDeConocimiento;
	
	public Usuario(String alias, TipoDeConocimiento tipoDeConocimiento) {
		this.alias = alias;
		this.tipoDeConocimiento = tipoDeConocimiento;
	}
	
	public String getAlias() {
		return this.alias;
	}
	
	public NivelDeConocimiento getNivelDeConocimiento() {
		return this.tipoDeConocimiento.getNivelDeConocimiento(this);
	}
	
}
