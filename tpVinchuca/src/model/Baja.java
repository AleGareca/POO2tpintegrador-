package modelado;

import java.util.HashMap;
import java.util.Iterator;

public class Baja extends Validacion {

	public void generarEstadoDeValidacion(Post post) {
		HashMap<Integer, String> visitantes = post.getVisitantes();
		Iterator<Integer> it = visitantes.keySet().iterator();
		Integer key = it.next();
		if (visitantes.size() == 1&& visitantes.get(key)=="Vinchuca") {
			post.getValidacion(this);
		}

	}

}
