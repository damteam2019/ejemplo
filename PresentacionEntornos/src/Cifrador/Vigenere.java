package Cifrador;

public class Vigenere {
	
	protected  String cifrarVigenere(String idioma,String texto, String clave, String funcion){
		Alfabetos alf = new Alfabetos();
		String alfabeto="";
		int aux;
		int auxClave;
		char c;
		String cifrado="";
		
		if(idioma.equalsIgnoreCase("castellano")){
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i=0, j=0; i< texto.length(); i++){
				aux = alf.obtenerIndice(alfabeto, texto.charAt(i));
				auxClave = alf.obtenerIndice(alfabeto, clave.charAt(j));
				
				if(funcion.equalsIgnoreCase("descifrar")){
					aux = (aux - auxClave) % alfabeto.length();
				}else{
					aux = (aux + auxClave) % alfabeto.length();
				}
				if(aux <0){
					aux = aux + alfabeto.length();
				}
				
				c=alfabeto.charAt(aux);
				cifrado= cifrado + alfabeto.charAt(alfabeto.indexOf(c));
				if(j == clave.length()-1){
					j=0;
				}else{
					j++;
				}
			}
			return cifrado;
			
		}else if(idioma.equalsIgnoreCase("ingles")){	
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i=0, j=0; i< texto.length(); i++){
				aux = alf.obtenerIndice(alfabeto, texto.charAt(i));
				auxClave = alf.obtenerIndice(alfabeto, clave.charAt(j));
				if(funcion.equalsIgnoreCase("descifrar")){
					aux = (aux - auxClave) % alfabeto.length();
				}else{
					aux = (aux + auxClave) % alfabeto.length();
				}
				if(aux <0){
					aux = aux + alfabeto.length();
				}
				
				c=alfabeto.charAt(aux);
				cifrado= cifrado + alfabeto.charAt(alfabeto.indexOf(c));
				if(j == clave.length()-1){
					j=0;
				}else{
					j++;
				}
			}
			return cifrado;
	
		}else{ 
			if(idioma.equalsIgnoreCase("frances")){
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i=0, j=0; i< texto.length(); i++){
				aux = alf.obtenerIndice(alfabeto, texto.charAt(i));
				auxClave = alf.obtenerIndice(alfabeto, clave.charAt(j));
				if(funcion.equalsIgnoreCase("descifrar")){
					aux = (aux - auxClave) % alfabeto.length();
				}else{
					aux = (aux + auxClave) % alfabeto.length();
				}
				if(aux <0){
					aux = aux + alfabeto.length();
				}
				
				c=alfabeto.charAt(aux);
				cifrado= cifrado + alfabeto.charAt(alfabeto.indexOf(c));
				if(j == clave.length()-1){
					j=0;
				}else{
					j++;
				}
			}
			return cifrado;
			}
		}
		return null;
	}


}
