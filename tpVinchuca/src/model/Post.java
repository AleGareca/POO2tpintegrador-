package modelado;



import java.util.HashMap;



public class Post {

private Web web;	
 private Muestra muestra;
 private HashMap<Integer,String> visitantes;
 private Validacion validacion;



public void validarPost(){
	this.validacion.generarEstadoDeValidacion(this);
	
	}



public HashMap<Integer, String> getVisitantes() {
	
	return this.visitantes;
}



public void getValidacion(Media baja) {
	this.validacion=baja;
}



public void getValidacion(Media media) {
	this.validacion=media;
}



public Object getWeb() {
	
	return this.web;
}




}












