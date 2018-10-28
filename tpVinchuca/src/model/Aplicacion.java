package model;

import java.util.ArrayList;

public class Aplicacion {
	private ArrayList<Muestra> muestras;
	private ArrayList<Usuario> usuarios;

	public void agregarMuestra(Muestra muestra) {
		muestras.add(muestra);
	}

	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	@SuppressWarnings("null")
	public boolean hayAlgunExpertoConAlias(ArrayList<String> alias) {
		ArrayList<Usuario> res = null;
		for (Usuario usuario : this.usuarios) {
			if (alias.contains(usuario.alias())) {
				res.add(usuario);
			}
		}

		return this.hayAlgunExperto(res);

	}

	private boolean hayAlgunExperto(ArrayList<Usuario> usuario) {
		boolean res = false;

		for (Usuario u : usuarios) {
			if (u.getConocimiento().getClass().getSimpleName() == "Experto") {
				res = true;
			}
		}
		return res;
	}

	public boolean sonDelElMismoNivel(ArrayList<String> alias) {

		return false;
	}
}
