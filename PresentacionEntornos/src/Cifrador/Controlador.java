package Cifrador;



public class Controlador {
	
	Validar validar =new Validar();
	Cesar ces =new Cesar();
	Attbash att=new Attbash();
	Vigenere vig =new Vigenere();
	Verman ver =new Verman();
	Alfabetos alf =new Alfabetos();
	String cifrado;

	
public String cifradorAttbash(String funcion, String idioma, String texto) throws Exception{
		
		
		
		
		 if(validar.validarFuncion(funcion)&&
				 	validar.validarIdioma(idioma) &&
		    		validar.validarNumeroCaracteres(texto) &&
		    	  	validar.validarCaracteres(idioma, texto)){
			 
			 }else{
				 throw new Exception();
			 }
	
		 return cifrado = att.cifrarAttbash(idioma, texto, funcion);		 		
	}
		
	
public String cifradorCesar(String funcion, String idioma, String texto, int clave ) throws Exception{
	
	
			
		if( validar.validarFuncion(funcion)&&
				validar.validarIdioma(idioma) &&
				validar.validarNumeroCaracteres(texto) &&
			  	validar.validarCaracteres(idioma, texto)&&
				validar.validarClaveCesar(clave)){ 
				
	
		 }else{
			 throw new Exception();
		 }
		return cifrado = ces.cifrarCesar(idioma, texto, clave, funcion);
}

public String cifradorVigenere(String funcion, String idioma, String texto, String clave) throws Exception{
			
			
				
	    	  if( validar.validarFuncion(funcion) &&
	    			 validar.validarIdioma(idioma) &&
	  		    	validar.validarNumeroCaracteres(texto) &&
	  		    	validar.validarCaracteres(idioma, texto)&&
	  		    	validar.validarClaveVigenere(texto, clave)&&
	  		    	validar.validarCaracteres(idioma, clave) ){ 
	    	  
	    	   }else{
	 			 throw new Exception();
	 		 }
	    	  return cifrado = vig.cifrarVigenere(idioma, texto, clave, funcion);
}
	    
	        
public String cifradorVerman(String funcion, String idioma, String texto, String clave) throws Exception{
	    	  
		
	    	  if( validar.validarFuncion(funcion)&&
	    			  validar.validarIdioma(idioma) &&
		  		    	validar.validarNumeroCaracteres(texto) &&
		  		    	validar.validarCaracteres(idioma, texto)&&
		  		    	validar.validarClaveVeman(texto, clave)&&
		  		    	validar.validarCaracteres(idioma, clave)){ 
		
	    		
	    	  }else{
		 			 throw new Exception();
		 		 }
			return  cifrado= ver.cifrarVerman(idioma, texto, clave, funcion);
	    
	      }
		
	}

