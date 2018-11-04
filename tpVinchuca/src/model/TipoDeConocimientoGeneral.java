package model;

public class TipoDeConocimientoGeneral extends TipoDeConocimiento {
	
	private INivelDeConocimiento nivelDeConocimiento;
	
	public INivelDeConocimiento getNivelDeConocimiento(Usuario usuario) {
	return this.nivelDeConocimiento.calcularNivelDeConocimiento(usuario);
	}
}
