package modelado;

import java.util.ArrayList;
/*La verificaci�n se construye a partir de que varias personas indican que los datos se ven
como veraces. Es decir, por ejemplo que la foto es realmente de una vinchuca y no de otra
cosa. Es por ello que las muestres tienen tres niveles de verificaci�n: baja, media y alta.  
En este trabajo, se considera como criterio de verificaci�n detectar si el tipo de vinchuca
que se indic� realmente coincide con el de la foto.  
Una muestra estar� verificada 3 veces:
1. La persona que recolecto la muestra, envia la foto y los demas datos e indica el tipo 
de vinchuca que es. 
2. Otra persona visualiza la muestra e indica el tipo de vinchuca que aparece en la foto.
3. Otra persona realiza lo mismo que en el paso 2. 
Las alternativas que existen en la verificaci�n son: Vinchuca, Chince Foliada,
Phtia-Chinche, Ninguna, Imagen poco clara. 
Se dice que una muestra posee verificaci�n baja cuando la misma est� validada por una
�nica persona y que esta es una persona con conocimientos b�sicos en el tema. Es el nivel
m�s b�sico de participaci�n. La verificaci�n pasar� a media si dos personas con nivel de
conocimiento b�sico confirman la muestra. Y pasar� a alta si tres personas confirman la
muestra. Sin embargo, existen personas que poseen un nivel de experto porque han
demostrado que conocen sobre el tema, por ejemplo estudiosos en vinchucas. Si una
muestra est� tomada o verificada por uno de estos usuarios, entonces la muestra posee un
nivel alto sin importar el resto de las validaciones. 
Es importante notar, que la verificaci�n no significa que la foto realmente sea de una
vinchuca, sino que varias personas se ponen de acuerdo en un veredicto. Por lo cual, puede
verificarse que la foto es poco clara o que en la imagen hay una chinche foliada. 
 */




public class Web {
	
	private ArrayList<Persona> usuarios;
	private ArrayList<Post> posts;
	private ArrayList<Organizacion> organizaciones;
	
	

	public boolean algunExperto(Object[] idVisitantes) {
		
		return false;
	}
}
	
