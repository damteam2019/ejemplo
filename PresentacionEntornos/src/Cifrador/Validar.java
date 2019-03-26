package Cifrador;


public class Validar {


	protected boolean existenciaCaracter(String alfabeto, char c){
		for(int i =0; i < alfabeto.length(); i++){
			if (alfabeto.charAt(i) == c){
				return true;
			}
			
		}
		return false;
	}
	

	protected boolean validarIdioma(String idioma){
		if(idioma.equalsIgnoreCase("castellano") || idioma.equalsIgnoreCase("ingles")|| idioma.equalsIgnoreCase("frances")){
			return true;
		}else{
		return false;
		}
		
	}
	

	
	protected  boolean validarNumeroCaracteres(String texto){
		
		if(texto.length() < 3 || texto.length() > 144){
			return false;
		}else{
			return true;
			
		}
		
	}	
	protected  boolean validarCaracteres(String idioma, String texto){
		
		Alfabetos alf = new Alfabetos();
		String alfabeto;
	
		if(idioma.equalsIgnoreCase("castellano")){
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i =0; i < texto.length(); i++){
				if(existenciaCaracter(alfabeto,texto.charAt(i))== false){
					return false;
				
				}
			}
			return true;
			
		}else if(idioma.equalsIgnoreCase("ingles")){
			alfabeto= alf.obtenerAlfabeto(idioma);
			for(int i =0; i < texto.length(); i++){
				if(existenciaCaracter(alfabeto,texto.charAt(i))== false){
					return false;
				}
			}
			return true;
			
		}else{
			if(idioma.equalsIgnoreCase("frances")){
			for(int i =0; i < texto.length(); i++){
				alfabeto= alf.obtenerAlfabeto(idioma);
				if(existenciaCaracter(alfabeto,texto.charAt(i))== false){
					return false;
				}
			}
			return true;
		}
	
	}
		return false;
		
}
			
protected  boolean validarClaveCesar(int clave){
	
		if(clave < 0 || clave > 2147483647){ 
			return false;
		}else{
			return true;
		}
	}
	


protected  boolean validarClaveVigenere(String texto, String clave){
 
	int valormax = (texto.length()/2) +1 ;
	
	if(clave.length() < 2 || clave.length() > valormax ){
		return false;
	}else{
		return true;	
	}
	
}	

protected  boolean validarClaveVeman(String texto, String clave){

	if(clave.length() == texto.length() ){
		return true;
	}else{
		return false;
		
	}
	
}	

protected  boolean validarFuncion(String funcion){
	if(funcion.equalsIgnoreCase("cifrar") || funcion.equalsIgnoreCase("descifrar")){
		return true;
	}else{
		return false;
	}
}


 

}
	

