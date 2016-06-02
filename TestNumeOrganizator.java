package DesignPatterns;

import junit.framework.TestCase;

public class TestNumeOrganizator extends TestCase {
	
	public TestNumeOrganizator() {
		
		System.out.println(
				"Initializare TestNumeOrganizator");
	}

	OrganizatorEveniment organizator=new OrganizatorEveniment("org");
	public void setUp(){
		System.out.println("Pregatire test");
	}
	
	public void testareConstructor(){
		System.out.println("Testarea functiei de atribuire a numelui organizatorului.");
		assertEquals("Atribuire nume eronata","org",organizator.getNume());
	}
	
	public void testareSetNume(){
		System.out.println("Testarea functiei de modificare a numelui organizatorului.");
		organizator.setNume("org2");
		assertEquals("Atribuire nume eronata","org2",organizator.getNume());
	}
	
	
}
