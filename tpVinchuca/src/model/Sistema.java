package model;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Image;

public class Sistema {
	private ArrayList<Muestra> misMuestras;
	private ArrayList<Usuario> misUsuarios;
	private ArrayList<Organizacion> misOrganizaciones;

	public Sistema() {
		this.misMuestras = new ArrayList<Muestra> ();
		this.misUsuarios = new ArrayList<Usuario> ();
		this.misOrganizaciones = new ArrayList<Organizacion> ();
	}
	
	public void agregarUsuario(Usuario usuario) {
		this.misUsuarios.add(usuario);
	}
	
	public void agregarOrganizacion(Organizacion organizacion) {
		this.misOrganizaciones.add(organizacion);
	}
	
	public void agregarMuestra(Muestra muestra) {
		this.misMuestras.add(muestra);
	}
	
	public void agregarVerificacion(Verificacion verificacion, Muestra muestra) {
		muestra.agregarVerificacion(verificacion);
	}
	
	public ArrayList<Muestra> muestrasACiertaDistanciaDe(Muestra muestra, double distancia) {
		return muestra.muestrasACiertaDistancia(this.misMuestras, distancia);
	}

	public int canEnvios(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int cantReviciones(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}
}
