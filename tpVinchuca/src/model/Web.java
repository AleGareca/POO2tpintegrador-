package modelado;

import java.util.ArrayList;
/*La verificación se construye a partir de que varias personas indican que los datos se ven
como veraces. Es decir, por ejemplo que la foto es realmente de una vinchuca y no de otra
cosa. Es por ello que las muestres tienen tres niveles de verificación: baja, media y alta.  
En este trabajo, se considera como criterio de verificación detectar si el tipo de vinchuca
que se indicó realmente coincide con el de la foto.  
Una muestra estará verificada 3 veces:
1. La persona que recolecto la muestra, envia la foto y los demas datos e indica el tipo 
de vinchuca que es. 
2. Otra persona visualiza la muestra e indica el tipo de vinchuca que aparece en la foto.
3. Otra persona realiza lo mismo que en el paso 2. 
Las alternativas que existen en la verificación son: Vinchuca, Chince Foliada,
Phtia-Chinche, Ninguna, Imagen poco clara. 
Se dice que una muestra posee verificación baja cuando la misma está validada por una
única persona y que esta es una persona con conocimientos básicos en el tema. Es el nivel
más básico de participación. La verificación pasará a media si dos personas con nivel de
conocimiento básico confirman la muestra. Y pasará a alta si tres personas confirman la
muestra. Sin embargo, existen personas que poseen un nivel de experto porque han
demostrado que conocen sobre el tema, por ejemplo estudiosos en vinchucas. Si una
muestra está tomada o verificada por uno de estos usuarios, entonces la muestra posee un
nivel alto sin importar el resto de las validaciones. 
Es importante notar, que la verificación no significa que la foto realmente sea de una
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
	
