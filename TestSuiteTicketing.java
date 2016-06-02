package DesignPatterns;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteTicketing extends TestCase {

	public TestSuiteTicketing(String name) {
		super(name);
		System.out.println("Testare initializata.");
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Test initializat.");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Test finalizat.");
	}

	static public Test suite(){
		System.out.println("Testare...");
		TestSuite suite=new TestSuite();
		suite.addTestSuite(TestComandaBilete.class);
		suite.addTestSuite(TestNumeOrganizator.class);
		suite.addTestSuite(TestVarsta.class);
		suite.addTestSuite(TestFirma.class);
		return suite;
		
	}
	
}
