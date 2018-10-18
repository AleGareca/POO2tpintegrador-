package modelado;

import java.util.HashMap;
import java.util.Iterator;

public class Alta extends Validacion {

	public void generarEstadoDeValidacion(Post post) {
		this.validacionPorExperto();
		HashMap<Integer, String> visitantes = post.getVisitantes();
		Iterator<Integer> it = visitantes.keySet().iterator();
		Integer res=0;
		if (visitantes.size() <= 3) {
			while(it.hasNext()){
			Integer key = it.next();
			if(visitantes.get(key)=="Vinchuca") {
				res++;
			}
		}
			if(res<=3) {
				post.getValidacion(this);
			}
		
	}
}

	private void validacionPorExperto(Post post) {
		HashMap<Integer, String> visitantes = post.getVisitantes();
		Integer id=post.getWeb().idExperto();
		if(visitantes.get(id)=="Vinchuca") {
			this.getValidaxion(this);
		}
		}
		
	}
