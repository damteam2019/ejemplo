package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Cifrador.Controlador;

public class VigenereTestEquivalencia {

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
			 texto = "¿Hola que tál?";
			 clave= "Sol";
			 cifrado = cont.cifradorVigenere(funcion, idioma, texto, clave); 
			 assertEquals("LVzÉokÚJoRIÜÉi", cifrado);
			
		}
		
		@Test
		public void PruebaValida2() throws Exception {
			 funcion= "descifrar";
			 idioma= "ingles";
			 texto ="eCwSnB¿sk!owK" ;
			 clave= "Sol";
			 cifrado = cont.cifradorVigenere(funcion, idioma, texto, clave);
			 
			 assertEquals("Hola que tal?", cifrado);
			
		}
		@Test
		public void PruebaValida3() throws Exception {
			funcion= "cifrar";
			 idioma= "frances";
			 texto ="Hola que talç?" ;
			 clave= "Sol";
			 cifrado = cont.cifradorVigenere(funcion, idioma, texto, clave);
			 
			 assertEquals("6CwSnBèskÜowyh", cifrado);
			
		}
		// Respecto a la función
		
			@Test (expected=Exception.class)
			public void funcionErronea() throws Exception {
				 funcion= "cifrarr";
				 idioma= "castellano";
				 texto = "¿Hola que tál?";
				 clave= "Sol";
				 cont.cifradorVigenere(funcion, idioma, texto, clave); 
				
				
			}
		
			//respecto al idioma
			@Test (expected=Exception.class)
			public void idiomaErroneo() throws Exception {
				 funcion= "cifrar";
				 idioma= "castellanos";
				 texto = "¿Hola que tál?";
				 clave= "Sol";
				 cont.cifradorVigenere(funcion, idioma, texto, clave); 
				
			}
			
		//respecto al número de caracteres
			@Test (expected=Exception.class)
			public void numeroCaracteresErroneoInferior() throws Exception {
				 funcion= "cifrar";
				 idioma= "castellano";
				 texto = "a";
				 clave= "Sol";
				 cont.cifradorVigenere(funcion, idioma, texto, clave); 
				
			}
			@Test (expected=Exception.class)
			public void numeroCaracteresErroneoSuferior() throws Exception {
				 funcion= "cifrar";
				 idioma= "castellano";
				 texto = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
				 clave= "Sol";
				 cont.cifradorVigenere(funcion, idioma, texto, clave); 
				
			}
		//respecto a los caracteres del texto
			@Test (expected=Exception.class)
			public void caracteresErroneoCastellano() throws Exception {
					funcion= "cifrar";
					idioma= "castellano";
					texto = "accç";
					clave= "Sol";
					 cont.cifradorVigenere(funcion, idioma, texto, clave); 
					
				}
			@Test (expected=Exception.class)
			public void caracteresErroneoIngles() throws Exception {
				funcion= "cifrar";
				idioma= "ingles";
				texto = "accç";
				clave= "Sol";
				 cont.cifradorVigenere(funcion, idioma, texto, clave); 
				
			}
			@Test (expected=Exception.class)
			public void caracteresErroneoFrances() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "accçñ";
				clave= "Sol";
				 cont.cifradorVigenere(funcion, idioma, texto, clave); 
				
			}
			//respecto a la clave vigenere
			
			@Test (expected=Exception.class)
			public void ClaveErroneaInferior() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "acc";
				clave= "S";
				cont.cifradorVigenere(funcion, idioma, texto, clave); 
				
			}
			
			@Test (expected=Exception.class)
			public void ClaveErroneaSuperior() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "acc";
				clave= "S";
				cont.cifradorVigenere(funcion, idioma, texto, clave); 
				
			}
		
			
			
			//VALORES LIMITES
			@Test (expected=Exception.class)
			public void vl1() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "ac";
				clave= "Sol";
				cont.cifradorVigenere(funcion, idioma, texto, clave); 
				
			}
			@Test
			public void vl2() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "acc";
				clave= "So";
				cifrado= cont.cifradorVigenere(funcion, idioma, texto, clave); 
				assertEquals("SqU", cifrado);
				
			}
			@Test
			public void vl3() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
				clave = "ddd";
				cifrado= cont.cifradorVigenere(funcion, idioma, texto, clave); 
				assertEquals("ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", cifrado);
				
			}
			@Test (expected=Exception.class)
			public void vl4() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
				clave = "ddd";
				cifrado= cont.cifradorVigenere(funcion, idioma, texto, clave); 
			}
			
			@Test (expected=Exception.class)
			public void vl8() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "acc";
				clave= "S";
				cont.cifradorVigenere(funcion, idioma, texto, clave); 	
				
			}
			
			@Test
			public void vl9() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "accc";
				clave= "So";
				cifrado= cont.cifradorVigenere(funcion, idioma, texto, clave); 
				assertEquals("SqUq", cifrado);
				
			}
			
			@Test
			public void vl10() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "accc";
				clave= "Sol";
				cifrado= cont.cifradorVigenere(funcion, idioma, texto, clave); 
				assertEquals("SqnU", cifrado);
				
			}
			
			@Test (expected=Exception.class)
			public void vl11() throws Exception {
				funcion= "cifrar";
				idioma= "Frances";
				texto = "accc";
				clave= "Solo";
				cont.cifradorVigenere(funcion, idioma, texto, clave); 	
				
			}
			
		

			
	

}
