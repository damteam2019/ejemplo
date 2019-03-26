package Cifrador;

public class test {

	public static void main(String[] args) throws Exception {

		String funcion;
		String idioma;
		 String texto;
		  String clave;
			funcion= "cifrar";
			idioma= "Frances";
			texto = "accc";
			clave= "Sooo";
	

	Controlador cont = new Controlador();
	System.out.println( cont.cifradorVerman(funcion, idioma, texto, clave)) ;
	}

}
