package model;
import java.util.Date;

public class Verificacion {
	private Date fecha;
	private Usuario autor;
	private TipoDeImagen tipoDeImagen;
	
	public Verificacion(Date fecha, Usuario usuario, TipoDeImagen tipoDeImagen) {
		this.fecha = fecha;
		this.autor = usuario;
		this.tipoDeImagen = tipoDeImagen;
	}
	
}
