package Cifrador;

public class Alfabetos {



	public String obtenerAlfabeto(String idioma){
		

		
			
		String ingles = "abcdefghijklmnopqrstuvwxyz"
				+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "1234567890"
				+ "¡!¿?-;,.:' ";


		String frances ="abcdefghijklmnopqrstuvwxyz"
					+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
					+"áÁéÉíÍóÓúÚüÜèÈêÊâÂçÇ"
					+ "1234567890"
					+ "!?-;,.: ";
		
		
				
		if(idioma.equalsIgnoreCase("castellano")){
			
			return castellano;
					
		}else if(idioma.equalsIgnoreCase("ingles")){
			
			return  ingles;
			
		}else{
			if(idioma.equalsIgnoreCase("frances")){
				return frances;
			}
		
		}
		return null;
	}
	
	protected int obtenerIndice(String alfabeto, char c){
		for(int i =0 ; i < alfabeto.length(); i++){
			if (alfabeto.charAt(i) == c){
				return alfabeto.indexOf(alfabeto.charAt(i));
			}
		
		}
		return -1;		

	}
}
