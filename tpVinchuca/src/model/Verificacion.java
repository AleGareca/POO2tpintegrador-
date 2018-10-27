package model;

import java.util.Date;

public class Verificacion {
	
		private Usuario usuario;
		private String tipo;
		private Date fecha;
		
		
		public Verificacion(String tipo, Usuario usuario)
		{
			this.tipo = tipo;
			this.usuario = usuario;
			this.fecha = new Date();
		}
}
