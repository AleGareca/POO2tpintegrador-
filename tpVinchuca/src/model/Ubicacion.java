package model;
import java.util.ArrayList;

public class Ubicacion {
	private int latitud;
	private int longitud;
	
	public Ubicacion(int latitud, int longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
		
	public double distanciaAOtraUbicacion(Ubicacion otraUbicacion) {
		double radioTierra = 6371;//en kilómetros  
        double dLat = Math.toRadians(otraUbicacion.latitud - this.latitud);  
        double dLng = Math.toRadians(otraUbicacion.longitud - this.longitud);  
        double sindLat = Math.sin(dLat / 2);  
        double sindLng = Math.sin(dLng / 2);  
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                * Math.cos(Math.toRadians(this.latitud)) * Math.cos(Math.toRadians(otraUbicacion.latitud));  
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        double distancia = radioTierra * va2;  
   
        return distancia;  
	}
	
	public ArrayList<Ubicacion> ubicacionesACiertaDistancia(ArrayList<Ubicacion> ubicaciones, double distancia) {
		ArrayList<Ubicacion> resultado = new ArrayList<>();

		for (Ubicacion ubicacion : ubicaciones) {
			if(this.distanciaAOtraUbicacion(ubicacion) < distancia) {
		            resultado.add(ubicacion);
		        }
		    }
		return resultado;
	}
	
}
