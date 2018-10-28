package model;

import java.util.ArrayList;
import java.util.Iterator;



public class Baja implements Nivel {

	@Override
	public void verificarNivelPara(Muestra muestra) {
		if (muestra.cantVerificaciones() == 1) {
			muestra.baja();
		} else if ( this.verificacionesIdistintas(muestra.getVerificaciones())) {
			muestra.baja();
		}

	}

	@SuppressWarnings("null")
	private boolean verificacionesIdistintas(ArrayList<Verificacion> verificaciones) {

		Iterator<Verificacion> it = verificaciones.iterator();
		ArrayList<String> res= null;
		while(it.hasNext()) {
			Verificacion v = it.next();
			res.add(v.getTipo()); 
			
		} 
		
		return this.sinRepetidos(res);
		 }


	public boolean sinRepetidos(ArrayList<String> tipos) {
		boolean res=false;
		int num= tipos.size();
		while(num < 0) {
			if(tipos.get(num)!=tipos.get(num-1)) {
				res=true;
			}
		}
		
		
		return res;
	}

}