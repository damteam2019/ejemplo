package Cifrador;

public class Attbash {
protected String cifrarAttbash(String idioma,String texto, String funcion){
		
		Alfabetos alf = new Alfabetos();
		String alfabeto;
		int aux;
		char c;
		String cifrado="";
		
		
		if(idioma.equalsIgnoreCase("castellano")){
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i=0; i< texto.length(); i++){
				aux = alf.obtenerIndice(alfabeto, texto.charAt(i));
				aux=aux+alfabeto.length()-1-aux*2;
				c=alfabeto.charAt(aux);
				cifrado= cifrado + alfabeto.charAt(alfabeto.indexOf(c));
				
				}
			return cifrado;
			
		}else if(idioma.equalsIgnoreCase("ingles")){
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i=0; i< texto.length(); i++){
				aux = alf.obtenerIndice(alfabeto, texto.charAt(i));
				aux=aux+(alfabeto.length()-1)-(aux*2);
				c=alfabeto.charAt(aux);
				cifrado= cifrado + alfabeto.charAt(alfabeto.indexOf(c));
				}
			return cifrado;
			
		}else{
			if(idioma.equalsIgnoreCase("frances")){
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i=0; i< texto.length(); i++){
				aux = alf.obtenerIndice(alfabeto, texto.charAt(i));
				aux=aux+alfabeto.length()-1-aux*2;
				c=alfabeto.charAt(aux);
				cifrado= cifrado + alfabeto.charAt(alfabeto.indexOf(c));
				
				}
			return cifrado;
			}
		}
		return null;
		
	}

}
