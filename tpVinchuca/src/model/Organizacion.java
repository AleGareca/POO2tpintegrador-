package model;

public class Organizacion {
	private Ubicacion ubicacion;
	private TipoDeOrganizacion tipoDeOrganizacion;
	private int cantidadDeEmpleados;
	
	public Organizacion(Ubicacion ubicacion, TipoDeOrganizacion tipoDeOrganizacion, int cantDeEmpleados) {
		this.ubicacion = ubicacion;
		this.tipoDeOrganizacion = tipoDeOrganizacion;
		this.cantidadDeEmpleados = cantDeEmpleados;
	}
	
	public Ubicacion getUbicacion() {
		return this.ubicacion;
	}
	
	public TipoDeOrganizacion getTipoDeOrganizacion() {
		return this.tipoDeOrganizacion;
	}
	
	public int getCantidadDeEmpleados() {
		return this.cantidadDeEmpleados;
	}

}
