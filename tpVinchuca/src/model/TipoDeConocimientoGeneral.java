package model;

public class TipoDeConocimientoGeneral extends TipoDeConocimiento {
	
	public TipoDeConocimientoGeneral() {
		this.nivelDeConocimiento = new NivelDeConocimientoBasico();
	}

	public NivelDeConocimiento getNivelDeConocimiento() {
		return this.nivelDeConocimiento;
	}

}
