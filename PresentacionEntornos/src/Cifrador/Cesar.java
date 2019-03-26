package Cifrador;

public class Cesar {
	
	protected  String cifrarCesar(String idioma,String texto, int clave, String funcion){
		
		if (funcion.equalsIgnoreCase("descifrar")){
			clave = clave* -1;
		}
		Alfabetos alf = new Alfabetos();
		String alfabeto="";
		int aux;
		char c;
		String cifrado="";
		
		if(idioma.equalsIgnoreCase("castellano")){
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i=0; i< texto.length(); i++){
				aux = alf.obtenerIndice(alfabeto, texto.charAt(i));
				aux = (aux + clave) % alfabeto.length();
				if(aux <0){
					aux = aux + alfabeto.length();
				}
				c=alfabeto.charAt(aux);
				cifrado= cifrado + alfabeto.charAt(alfabeto.indexOf(c));
			}
			return cifrado;
			
		}else if(idioma.equalsIgnoreCase("ingles")){	
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i=0; i< texto.length(); i++){
				aux = alf.obtenerIndice(alfabeto, texto.charAt(i));
				aux = (aux + clave) % alfabeto.length();
				if(aux <0){
					aux = aux + alfabeto.length();
				}
				c=alfabeto.charAt(aux);
				cifrado= cifrado + alfabeto.charAt(alfabeto.indexOf(c));
			}
			return cifrado;
	
		}else{
			if(idioma.equalsIgnoreCase("frances")){
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i=0; i< texto.length(); i++){
				aux = alf.obtenerIndice(alfabeto, texto.charAt(i));
				aux = (aux + clave) % alfabeto.length();
				if(aux <0){
					aux = aux + alfabeto.length();
				}
				c=alfabeto.charAt(aux);
				cifrado= cifrado + alfabeto.charAt(alfabeto.indexOf(c));
			}
			return cifrado;
			}
		}
		return null;
	}

}
