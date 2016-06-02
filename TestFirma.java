package DesignPatterns;

import junit.framework.TestCase;

public class TestFirma extends TestCase {
	public TestFirma() {
		
		System.out.println(
					"Initializare TestFirma");
	}

	
	public void setUp(){
		System.out.println("Pregatire test");
	}
	
	public void testareConstructorFirma(){
		Firma firma=Firma.creareFirma("firma", 2000);
		assertEquals("Problema  nume firma", "firma",firma.getNume());
		assertEquals("Problema an infiintare", 2000,firma.getAnulInfiintarii());
	}
	
	public void testareSingleton(){
		Firma firma=Firma.creareFirma("firma", 2000);
		Firma firma2=Firma.creareFirma("firma2", 2001);
		assertEquals("Problema singleton", firma,firma2);
		
	}
}
