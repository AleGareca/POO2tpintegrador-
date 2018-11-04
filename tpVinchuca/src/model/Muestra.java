package model;
import java.util.ArrayList;
import java.awt.Image;
import java.util.PriorityQueue;

public class Muestra {
	private ArrayList<Verificacion> misVerificaciones;
	private Ubicacion miUbicacion;
	private Image foto;
	
	public Muestra(Ubicacion ubicacion, Image foto, Verificacion verificacion) {
		this.miUbicacion = ubicacion;
		this.foto = foto;
		this.misVerificaciones.add(verificacion);		
	}
	
	public Ubicacion getUbicacion() {
		return this.miUbicacion;
	}
	
	public void agregarVerificacion(Verificacion verificacion) {
		this.misVerificaciones.add(verificacion);
	}
	
	public TipoDeImagen imagenDeLaMuestra() {
		return this.evaluarMuestra().getTipoDeImagen();
		
	}

	public NivelDeValidacion nivelDeValidacion() {
		return this.evaluarMuestra().getNivelDeValidacion();
	}
	
	public VeredictoDeMuestra evaluarMuestra() {
		PriorityQueue<Verificacion> verificaciones = new PriorityQueue<Verificacion>();
		verificaciones.addAll(this.misVerificaciones);

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
}	

