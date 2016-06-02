package DesignPatterns;

import junit.framework.TestCase;

public class TestComandaBilete extends TestCase {
	public TestComandaBilete(String nume) {
			super(nume);
			System.out.println(
						"Initializare TestComandaBilete");
		}

	Client client=new BuilderClient("Popescu","Vasile")
			.setAdreasEmail("popescu_vasile@gmail.com")
			.setAdreasFizica("Judet Prahova, Localitatea Campina, Strada Calea Doftanei, Numar 4")
			.setUsername("popescuvasile")
			.setParola("parola")
			.setVarsta(27)
			.setTara("Italia")
			.build();
	InterfataComanda comanda=new ComandaProxy(client);
	public void setUp(){
		System.out.println("Pregatire test");
	}
	
	public void testareConstructorComanda(){
		System.out.println("Testarea constructorului comenzii.");
		assertEquals("Problema nume client", "Popescu", comanda.getClientReal().getNume());
		assertEquals("Problema prenume client", "Vasile", comanda.getClientReal().getPrenume());
		assertEquals("Problema adresa email client", "popescu_vasile@gmail.com", comanda.getClientReal().getAdresaEmail());
		assertEquals("Problema adresa fizica client", "Judet Prahova, Localitatea Campina, Strada Calea Doftanei, Numar 4", comanda.getClientReal().getAdresaFizica());
		assertEquals("Problema username client", "popescuvasile", comanda.getClientReal().getUsername());
		assertEquals("Problema parola client", "parola", comanda.getClientReal().getParola());
		assertEquals("Problema varsta client", 27, comanda.getClientReal().getVarsta());
		assertEquals("Problema tara client", "Italia", comanda.getClientReal().getTara());
	}
	
	public void testareBileteDisponibileDupaComanda() throws Throwable{
		Main main=new Main();
		EvenimentFactory factory=new EvenimentFactory();
		InterfataEveniment eveniment=factory.creareEveniment(TipEveniment.SPORT, "Romania-Spania", "Cluj-Arena", "26-03.2016", 35.5, 25000);
		main.listaEvenimente.add(eveniment);
		client.comandaBilete(1, 0);
		assertEquals("Problema bilete disponibile",24999,main.listaEvenimente.get(0).getNumarBileteDisponibile());
		
	}
	
	
	
}
