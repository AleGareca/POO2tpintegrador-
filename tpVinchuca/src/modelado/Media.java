package modelado;

import java.util.HashMap;
import java.util.Iterator;

public class Media extends Validacion {

	public void generarEstadoDeValidacion(Post post) {
		HashMap<Integer, String> visitantes = post.getVisitantes();
		Iterator<Integer> it = visitantes.keySet().iterator();
		Integer res=0;
		if (visitantes.size() == 2) {
			while(it.hasNext()){
			Integer key = it.next();
			if(visitantes.get(key)=="Vinchuca") {
				res++;
			}
		}
			if(res==2) {
				post.getValidacion(this);
			}
	}
	}

}
