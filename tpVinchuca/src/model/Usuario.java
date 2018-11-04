package model;
import java.util.Date;

public class Usuario {
	private String alias;
	private TipoDeConocimiento tipoDeConocimiento;
	private Sistema sistema;
	
	public Usuario(String alias, TipoDeConocimiento tipoDeConocimiento) {
		this.alias = alias;
		this.tipoDeConocimiento = tipoDeConocimiento;
		
		
	}
	public Usuario(String alias) {
		this.alias = alias;
		this.tipoDeConocimiento = new TipoDeConocimientoGeneral();
	}
	
	public String getAlias() {
		return this.alias;
	}
	
	public INivelDeConocimiento getNivelDeConocimiento() {

		return this.tipoDeConocimiento.getNivelDeConocimiento(this);
	}
	public int cantDeReviciones() {
		
		return sistema.cantReviciones(this);
	}
	public int cantEnvios() {
		
		return sistema.canEnvios(this);
	}
	
}
