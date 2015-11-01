package labo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AktoreaTest {
	Aktorea a;

	@Before
	public void setUp() throws Exception {
		a=new Aktorea("Kotsifakis, Hector");
	}

	@After
	public void tearDown() throws Exception {
		a=null;
	}

	@Test
	public void testGehituPelikula() {
		Pelikula p=new Pelikula("Me gusta cuando callas");
		Pelikula p1=new Pelikula("Daniel & Ana");
		a.pelikulakBueltatu();
		a.gehituPelikula(p);
		System.out.println("Pelikula gehitu da");
		a.pelikulakBueltatu();
		a.gehituPelikula(p1);
		System.out.println("Orain 2 pelikula agertu behar dira");
		a.pelikulakBueltatu();
		a.gehituPelikula(p1);
		System.out.println("Berriro 2 pelikula agertu behar dira");
		a.pelikulakBueltatu();
	}
	
	@Test
	public void testEquals(){
		Aktorea a2=new Aktorea("Andreasson, Elisabeth");
		assertFalse(a.equals(a2));
		Aktorea a3=new Aktorea("Kotsifakis, Hector");
		assertTrue(a.equals(a3));
	}
	
	@Test
	public void testCompareTo(){
		Aktorea a2=new Aktorea("Andreasson, Elisabeth");
		assertEquals(10,a.compareTo(a2));
		Aktorea a3=new Aktorea("Kotsifakis, Hector");
		assertEquals(0,a.compareTo(a3));
		assertEquals(-10,a2.compareTo(a));
	}

}
