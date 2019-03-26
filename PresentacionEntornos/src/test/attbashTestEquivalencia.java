package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import Cifrador.Controlador;


public class attbashTestEquivalencia {
	
	static Controlador cont;
	static String cifrado;;
	static String funcion;
	static String idioma;
	static String texto;
	

	
	

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
		
		
	}

	@After
	public void tearDown() throws Exception {
		cifrado ="";
		funcion= "";
		idioma="";
		texto="";
		
	
	}

	// Clases de equivalencia v�lidas
	@Test
	public void PruebaValida1() throws Exception {
		 funcion= "cifrar";
		 idioma= "castellano";
		 texto = "abcdefghijklmn�opqrstuvwxyzABCDEFGHIJKLMN�OPQRSTUVWXYZ������������1234567890�!�?-;,.: ";
		 cifrado = cont.cifradorAttbash(funcion, idioma, texto);
		 
		 assertEquals(" :.,;-?�!�0987654321������������ZYXWVUTSRQPO�NMLKJIHGFEDCBAzyxwvutsrqpo�nmlkjihgfedcba", cifrado);
		
	}
	
	@Test
	public void PruebaValida2() throws Exception {
		 String funcion= "descifrar";
		 String idioma= "ingles";
		 String texto =" ':.,;-?!0987654321ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba" ;
		 cifrado = cont.cifradorAttbash(funcion, idioma, texto);
		 
		 assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!?-;,.: '", cifrado);
		
	}
	@Test
	public void PruebaValida3() throws Exception {
		 String funcion= "cifrar";
		 String idioma= "frances";
		 String texto ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ��������������������01234567890!?-;,.: " ;
		 cifrado = cont.cifradorAttbash(funcion, idioma, texto);
		 
		 assertEquals(" :.,;-?!0987654321��������������������ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba", cifrado);
		
	}
	// Respecto a la funci�n
	
	@Test (expected=Exception.class)
	public void funcionErronea() throws Exception {
		 funcion= "cifrarr";
		 idioma= "castellano";
		 texto = "abcdefghijklmn�opqrstuvwxyzABCDEFGHIJKLMN�OPQRSTUVWXYZ������������1234567890�!�?-;,.: ";
		 cont.cifradorAttbash(funcion, idioma, texto);
		
		
	}
	//respecto al idioma
	@Test (expected=Exception.class)
	public void idiomaErroneo() throws Exception {
		 funcion= "cifrar";
		 idioma= "castellanos";
		 texto = "abcdefghijklmn�opqrstuvwxyzABCDEFGHIJKLMN�OPQRSTUVWXYZ������������1234567890�!�?-;,.: ";
		 cont.cifradorAttbash(funcion, idioma, texto);
		
	}
	
//respecto al n�mero de caracteres
	@Test (expected=Exception.class)
	public void numeroCaracteresErroneoInferior() throws Exception {
		 funcion= "cifrar";
		 idioma= "castellano";
		 texto = "a";
		 cont.cifradorAttbash(funcion, idioma, texto);
		
	}
	@Test (expected=Exception.class)
	public void numeroCaracteresErroneoSuperior() throws Exception {
		 funcion= "cifrar";
		 idioma= "castellano";
		 texto = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		 cont.cifradorAttbash(funcion, idioma, texto);
		
	}
//respecto a los caracteres del texto
	@Test (expected=Exception.class)
	public void caracteresErroneoCastellano() throws Exception {
			funcion= "cifrar";
			idioma= "castellano";
			texto = "acc�";
			cont.cifradorAttbash(funcion, idioma, texto);
			
		}
	@Test (expected=Exception.class)
	public void caracteresErroneoIngles() throws Exception {
		funcion= "cifrar";
		idioma= "ingles";
		texto = "acc�";
		cont.cifradorAttbash(funcion, idioma, texto);
		
	}
	@Test (expected=Exception.class)
	public void caracteresErroneoFrances() throws Exception {
		funcion= "cifrar";
		idioma= "Frances";
		texto = "acc��";
		cont.cifradorAttbash(funcion, idioma, texto);	
		
	}
	
	//VALORES LIMITES
	@Test (expected=Exception.class)
	public void vl1() throws Exception {
		funcion= "cifrar";
		idioma= "Frances";
		texto = "ac";
		cont.cifradorAttbash(funcion, idioma, texto);	
	}
	@Test
	public void vl2() throws Exception {
		funcion= "cifrar";
		idioma= "Frances";
		texto = "acc";
		cifrado = cont.cifradorAttbash(funcion, idioma, texto);
		assertEquals(" ..", cifrado);
		
	}
	@Test
	public void vl3() throws Exception {
		funcion= "cifrar";
		idioma= "Frances";
		texto = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
		cifrado = cont.cifradorAttbash(funcion, idioma, texto);
		assertEquals("...............................................................................................................................................", cifrado);
		
	}
	
	@Test (expected=Exception.class)
	public void vl4() throws Exception {
		funcion= "cifrar";
		idioma= "Frances";
		texto = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
		cont.cifradorAttbash(funcion, idioma, texto);	
		
	}
	
	



}
