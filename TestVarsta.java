package DesignPatterns;

import junit.framework.TestCase;

public class TestVarsta extends TestCase {
	
			public TestVarsta() {
				
				System.out.println(
						"Initializare TestVarsta");
			}
			
			
			Client client=new BuilderClient("Mihai", "Iordache")
			.setVarsta(21)
			.build();
			public void setUp(){
				System.out.println("Pregatire test");
			}
			
			public void tearDown(){
				System.out.println("Test terminat.");
			}

			public void testareVarstaConstructor(){
				System.out.println("Testarea initializarii campului varsta.");
				try {
					assertEquals("Probleme la initializare varsta",
							21, client.getVarsta());
				
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}
			
			public void testareSetVarsta(){
				System.out.println("Testarea modificarii campului varsta.");
				client.setVarsta(30);
				assertEquals("Problema la modificarea varstei", 30,client.getVarsta());
			}

			public void testareGetVarsta(){
				System.out.println("Testarea preluarii valorii din campul varsta.");
				int varsta=client.getVarsta();
				assertEquals("Problema la preluarea varstei",21, varsta);
			}
			
			public void testareComandaVarstaSub18() throws Throwable{
				client.setVarsta(17);
				InterfataComanda comanda=new ComandaProxy(client);
				comanda.comandaBilete(3, 0);
				fail("Lispsa exceptie pentru comanda a unui client cu varsta sub 18.");
			}
	}


