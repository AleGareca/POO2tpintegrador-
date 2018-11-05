package model;
import java.util.ArrayList;
import java.awt.Image;
import java.util.PriorityQueue;

public class Muestra {
	private String alias;
	private ArrayList<Verificacion> misVerificaciones;
	private Ubicacion miUbicacion;
	private Image foto;
	private TipoDeImagen tipoDeImagen;
	private INivelDeVerificacion nivelDeVerificacion;
	
	
	public Muestra(Ubicacion ubicacion, Image foto, Verificacion verificacion) {
		this.miUbicacion = ubicacion;
		this.foto = foto;
		this.misVerificaciones=this.agregarVerificacion(verificacion);		
	}
	
	public Ubicacion getUbicacion() {
		return this.miUbicacion;
	}
	
	public ArrayList<Verificacion> agregarVerificacion(Verificacion verificacion) {
		misVerificaciones.add(verificacion);
		this.nivelDeVerificacion.verificarNivelPara(this);
		return misVerificaciones;
	}
	
	public TipoDeImagen imagenDeLaMuestra() {
		return this.tipoDeImagen;
		
	}

		
	
	public ArrayList<Muestra> muestrasACiertaDistancia(ArrayList<Muestra> muestras, double distancia) {
		
		ArrayList<Muestra> resultado = new ArrayList<Muestra> ();

		for (Muestra m : muestras) {
			if(this.miUbicacion.distanciaAOtraUbicacion(m.getUbicacion()) < distancia) {
		            resultado.add(m);
		        }
		    }
		return resultado;
	}
	public String getAlias() {
		return this.alias;
	}

	public ArrayList<Verificacion> getVerificaciones() {
		
		return this.misVerificaciones;
	}

	public boolean hizoUnaRevicion(Usuario usuario) {
	boolean res=false;
	for(Verificacion v:this.misVerificaciones) {
		if(v.hizoUnaRevicion(usuario)) {
			res=true;
		}
	}
	
		return res;
	}
}	

