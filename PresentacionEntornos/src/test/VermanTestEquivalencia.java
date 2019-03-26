package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Cifrador.Controlador;

public class VermanTestEquivalencia {

	static Controlador cont;
	static String cifrado;
	static String funcion;
	static String idioma;
	static String texto;
	static String clave;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cont = new Controlador();
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		cont =null;
	}

	@Before
	public void setUp() throws Exception {
		cifrado ="";
		funcion= "";
		idioma="";
		texto="";
		clave="";
		
	}

	@After
	public void tearDown() throws Exception {
		cifrado ="";
		funcion= "";
		idioma="";
		texto="";
		clave="";
	
	}
	// Clases de equivalencia válidas
		@Test
		public void PruebaValida1() throws Exception {
			 funcion= "cifrar";
			 idioma= "castellano";
			 texto = "abc";
			 clave= "abc";
			 cifrado = cont.cifradorVerman(funcion, idioma, texto, clave);
			 
			 assertEquals("ace", cifrado);
			
		}
		
		@Test
		public void PruebaValida2() throws Exception {
			 String funcion= "descifrar";
			 String idioma= "ingles";
			 String texto = "fmx";
			 clave= "Sol";
			 cifrado = cont.cifradorVerman(funcion, idioma, texto, clave);
			 
			 assertEquals("I'm", cifrado);
			
		}
		@Test
		public void PruebaValida3() throws Exception {
			
			funcion= "cifrar";
			 idioma= "frances";
			 texto ="Hoç" ;
			 clave= "Sol";
			 cifrado = cont.cifradorVerman(funcion, idioma, texto, clave);
			 assertEquals("6C0", cifrado);
			
		}
		// Respecto a la función
		
					@Test (expected=Exception.class)
					public void funcionErronea() throws Exception {
						 funcion= "cifrarr";
						 idioma= "castellano";
						 texto = "Hola";
						 clave= "Solo";
						 cont.cifradorVerman(funcion, idioma, texto, clave);
						
						
					}
				
					//respecto al idioma
					@Test (expected=Exception.class)
					public void idiomaErroneo() throws Exception {
						 funcion= "cifrar";
						 idioma= "castellanos";
						 texto = "Hola";
						 clave= "Solo";
						 cont.cifradorVerman(funcion, idioma, texto, clave);
						
					}
					
				//respecto al número de caracteres
					@Test (expected=Exception.class)
					public void numeroCaracteresErroneoInferior() throws Exception {
						 funcion= "cifrar";
						 idioma= "castellano";
						 texto = "a";
						 clave= "Sol";
						 cont.cifradorVerman(funcion, idioma, texto, clave);
						
					}
					@Test (expected=Exception.class)
					public void numeroCaracteresErroneoSuferior() throws Exception {
						 funcion= "cifrar";
						 idioma= "castellano";
						 texto = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
						 clave=  "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
						 cont.cifradorVerman(funcion, idioma, texto, clave); 
						
					}
				//respecto a los caracteres del texto
					@Test (expected=Exception.class)
					public void caracteresErroneoCastellano() throws Exception {
							funcion= "cifrar";
							idioma= "castellano";
							texto = "accç";
							clave= "Solo";
							cont.cifradorVerman(funcion, idioma, texto, clave); 
							
						}
					@Test (expected=Exception.class)
					public void caracteresErroneoIngles() throws Exception {
						funcion= "cifrar";
						idioma= "ingles";
						texto = "accç";
						clave= "Solo";
						cont.cifradorVerman(funcion, idioma, texto, clave); 
						
					}
					@Test (expected=Exception.class)
					public void caracteresErroneoFrances() throws Exception {
						funcion= "cifrar";
						idioma= "Frances";
						texto = "accçñ";
						clave= "Solo";
						cont.cifradorVerman(funcion, idioma, texto, clave); 
						
					}
					//respecto a la clave verman
					
					@Test (expected=Exception.class)
					public void ClaveErroneaInferior() throws Exception {
						funcion= "cifrar";
						idioma= "Frances";
						texto = "acc";
						clave= "S";
						cont.cifradorVerman(funcion, idioma, texto, clave); 
						
					}
					
					@Test (expected=Exception.class)
					public void ClaveErroneaSuperior() throws Exception {
						funcion= "cifrar";
						idioma= "Frances";
						texto = "acc";
						clave= "Ssss";
						cont.cifradorVerman(funcion, idioma, texto, clave); 
						
					}
				

					@Test (expected=Exception.class)
					public void vl1() throws Exception {
						funcion= "cifrar";
						idioma= "Frances";
						texto = "ac";
						clave= "Ss";
						cont.cifradorVerman(funcion, idioma, texto, clave); 
						
					}
					@Test
					public void vl2() throws Exception {
						funcion= "cifrar";
						idioma= "Frances";
						texto = "acc";
						clave= "Sss";
						cifrado =cont.cifradorVerman(funcion, idioma, texto, clave); 
						assertEquals("Suu", cifrado);
						
					}
					@Test
					public void vl3() throws Exception {
						funcion= "cifrar";
						idioma= "Frances";
						texto = "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
						clave = "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
						cifrado =cont.cifradorVerman(funcion, idioma, texto, clave); 
						assertEquals("ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", cifrado);
						
					}
					@Test (expected=Exception.class)
					public void vl4() throws Exception {
						funcion= "cifrar";
						idioma= "Frances";
						texto = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
						clave ="ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
						cont.cifradorVerman(funcion, idioma, texto, clave); 
					}
					
					@Test (expected=Exception.class)
					public void vl12() throws Exception {
						funcion= "cifrar";
						idioma= "Frances";
						texto = "accc";
						clave= "Soo";
						cont.cifradorVerman(funcion, idioma, texto, clave); 	
						
					}
					
					@Test 
					public void vl13() throws Exception {
						funcion= "cifrar";
						idioma= "Frances";
						texto = "accc";
						clave= "Sooo";
						cifrado= cont.cifradorVerman(funcion, idioma, texto, clave); 	
						assertEquals("Sqqq", cifrado);
					}
					
					@Test (expected=Exception.class)
					public void vl14() throws Exception {
						funcion= "cifrar";
						idioma= "Frances";
						texto = "accc";
						clave= "Soooo";
						cont.cifradorVerman(funcion, idioma, texto, clave); 	
						
					}
				 

	
}
