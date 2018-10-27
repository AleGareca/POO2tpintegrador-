package model;

import java.util.ArrayList;

public class Aplicacion {
	private ArrayList<Muestra> muestras;
	private ArrayList<Usuario> usuarios;
	
	
	public void agregarMuestra(Muestra muestra)
	{
		muestras.add(muestra);
	}
	
	public void agregarUsuario(Usuario usuario)
	{
		usuarios.add(usuario);
	}

}
