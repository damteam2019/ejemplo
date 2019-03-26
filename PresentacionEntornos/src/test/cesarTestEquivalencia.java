package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Cifrador.Controlador;


public class cesarTestEquivalencia {
	
	static Controlador cont;
	static String cifrado;
	static String funcion;
	static String idioma;
	static String texto;
	static int clave;
	

	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cont = new Controlador();
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
	}

	@Before
	public void setUp() throws Exception {
		cifrado ="";
		funcion= "";
		idioma="";
		 texto="";
		 clave=-1;
		
	}

	@After
	public void tearDown() throws Exception {
		cifrado ="";
		funcion= "";
		idioma="";
		 texto="";
		 clave=-1;
	
	}

	// Clases de equivalencia v·lidas
	@Test
	public void PruebaValida1() throws Exception {
		 funcion= "cifrar";
		 idioma= "castellano";
		  texto = "abcdefghijklmnÒopqrstuvwxyzABCDEFGHIJKLMN—OPQRSTUVWXYZ·¡È…ÌÕÛ”˙⁄¸‹1234567890°!ø?-;,.: ";
		  clave=3;
		 cifrado = cont.cifradorCesar(funcion, idioma, texto, clave);
		 
		 assertEquals("defghijklmnÒopqrstuvwxyzABCDEFGHIJKLMN—OPQRSTUVWXYZ·¡È…ÌÕÛ”˙⁄¸‹1234567890°!ø?-;,.: abc", cifrado);
		
	}
	
	@Test
	public void PruebaValida2() throws Exception {
		funcion= "descifrar";
		idioma= "ingles";
		texto ="defghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123ø4567890°!ø-,.:' acb" ;
		 clave= 3;
		 cifrado = cont.cifradorCesar(funcion, idioma, texto, clave);
		 
		 assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!?-;,.: '", cifrado);
		
	}
	@Test
	public void PruebaValida3() throws Exception {
		funcion= "cifrar";
		idioma= "frances";
		texto ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ·¡È…ÌÕÛ”˙⁄¸‹Ë»Í ‚¬Á«01234567890!?-;,.: " ;
		clave =3;
		cifrado = cont.cifradorCesar(funcion, idioma, texto, clave);
		 
		 assertEquals("defghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ·¡È…ÌÕÛ”˙⁄¸‹Ë»Í ‚¬Á«123-4567890!?-;,.: abc", cifrado);
		
	}
	
	// Respecto a la funciÛn
	
		@Test (expected=Exception.class)
		public void funcionErronea() throws Exception {
			 funcion= "cifrarr";
			 idioma= "castellano";
			 clave =3;
			 texto = "abcdefghijklmnÒopqrstuvwxyzABCDEFGHIJKLMN—OPQRSTUVWXYZ·¡È…ÌÕÛ”˙⁄¸‹1234567890°!ø?-;,.: ";
			 cont.cifradorCesar(funcion, idioma, texto, clave);
			
			
		}
	
		//respecto al idioma
		@Test (expected=Exception.class)
		public void idiomaErroneo() throws Exception {
			 funcion= "cifrar";
			 idioma= "castellanos";
			 texto = "abcdefghijklmnÒopqrstuvwxyzABCDEFGHIJKLMN—OPQRSTUVWXYZ·¡È…ÌÕÛ”˙⁄¸‹1234567890°!ø?-;,.: ";
			 clave =3;
			 cont.cifradorCesar(funcion, idioma, texto, clave);
			
		}
		
	//respecto al n˙mero de caracteres
		@Test (expected=Exception.class)
		public void numeroCaracteresErroneoInferior() throws Exception {
			 funcion= "cifrar";
			 idioma= "castellano";
			 texto = "a";
			 clave =3;
			 cont.cifradorCesar(funcion, idioma, texto, clave);;
			
		}
		@Test (expected=Exception.class)
		public void numeroCaracteresErroneoSuferior() throws Exception {
			 funcion= "cifrar";
			 idioma= "castellano";
			 texto = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
			 clave =3;
			 cont.cifradorCesar(funcion, idioma, texto, clave);
			
		}
	//respecto a los caracteres del texto
		@Test (expected=Exception.class)
		public void caracteresErroneoCastellano() throws Exception {
				funcion= "cifrar";
				idioma= "castellano";
				texto = "accÁ";
				 clave =3;
				 cont.cifradorCesar(funcion, idioma, texto, clave);
				
			}
		@Test (expected=Exception.class)
		public void caracteresErroneoIngles() throws Exception {
			funcion= "cifrar";
			idioma= "ingles";
			texto = "accÁ";
			 clave =3;
			 cont.cifradorCesar(funcion, idioma, texto, clave);
			
		}
		@Test (expected=Exception.class)
		public void caracteresErroneoFrances() throws Exception {
			funcion= "cifrar";
			idioma= "Frances";
			texto = "accÁÒ";
			clave =3;
			 cont.cifradorCesar(funcion, idioma, texto, clave);
			
		}
		//respecto a la clave cesar
		
		@Test (expected=Exception.class)
		public void ClaveErroneaInferior() throws Exception {
			funcion= "cifrar";
			idioma= "Frances";
			texto = "acc";
			clave =-2;
			 cont.cifradorCesar(funcion, idioma, texto, clave);
			
		}
	
		
		
		//VALORES LIMITES
		@Test (expected=Exception.class)
		public void vl1() throws Exception {
			funcion= "cifrar";
			idioma= "Frances";
			texto = "ac";
			clave =3;
			cont.cifradorCesar(funcion, idioma, texto, clave);
			
		}
		@Test
		public void vl2() throws Exception {
			funcion= "cifrar";
			idioma= "Frances";
			texto = "acc";
			clave =3;
			cifrado = cont.cifradorCesar(funcion, idioma, texto, clave);
			assertEquals("dff", cifrado);
			
		}
		@Test
		public void vl3() throws Exception {
			funcion= "cifrar";
			idioma= "Frances";
			texto = "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
			clave =3;
			cifrado = cont.cifradorCesar(funcion, idioma, texto, clave);
			assertEquals("ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", cifrado);
			
		}
		@Test (expected=Exception.class)
		public void vl4() throws Exception {
			funcion= "cifrar";
			idioma= "Frances";
			texto = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
			clave =3;
			 cont.cifradorCesar(funcion, idioma, texto, clave);
		}
		
		@Test (expected=Exception.class)
		public void vl5() throws Exception {
			funcion= "cifrar";
			idioma= "Frances";
			texto = "acc";
			clave =-1;
			cont.cifradorCesar(funcion, idioma, texto, clave);
			
		}
		
		@Test
		public void vl6() throws Exception {
			funcion= "cifrar";
			idioma= "Frances";
			texto = "acc";
			clave =0;
			cifrado = cont.cifradorCesar(funcion, idioma, texto, clave);
			assertEquals("acc", cifrado);
			
		}
		@Test
		public void vl7() throws Exception {
			funcion= "cifrar";
			idioma= "Frances";
			texto = "acc";
			clave =2147483647;
			cifrado = cont.cifradorCesar(funcion, idioma, texto, clave);
			assertEquals("L¡¡", cifrado);
			
		}
	
	
		
		



	}







