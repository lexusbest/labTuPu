package labo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PelikulaTest {
	Pelikula p;

	@Before
	public void setUp() throws Exception {
		p=new Pelikula("Me gusta cuando callas");
	}

	@After
	public void tearDown() throws Exception {
		p=null;
	}

	
	@Test
	public void testEquals(){
		Pelikula p2=new Pelikula("Daniel & Ana");
		assertFalse(p.equals(p2));
		Pelikula p3=new Pelikula("Me gusta cuando callas");
		assertTrue(p.equals(p3));
	}
	
	@Test
	public void testEquals2(){
		assertFalse(p.equals2("Daniel & Ana"));
		assertTrue(p.equals2("Me gusta cuando callas"));
	}
	
	@Test
	public void testGehituAktorea() {
		Aktorea a=new Aktorea("Kotsifakis, Hector");
		Aktorea a1=new Aktorea("Andreasson, Elisabeth");
		Aktorea a2=new Aktorea("McKechnie, Lee");
		p.aktoreakBueltatu();
		p.gehituAktorea(a);
		System.out.println("Aktorea gehitu da");
		p.aktoreakBueltatu();
		p.gehituAktorea(a1);
		System.out.println("Orain 2 aktore agertu behar dira");
		p.aktoreakBueltatu();
		p.gehituAktorea(a1);
		System.out.println("Berriro 2 aktore agertu behar dira");
		p.aktoreakBueltatu();
		p.kenduAktorea(a1);
		System.out.println("Kotsifakis, Hector agertu behar da");
		p.aktoreakBueltatu();
		p.kenduAktorea(a2);
		System.out.println("Kotsifakis, Hector agertu behar da");
		p.aktoreakBueltatu();
	}
	
	@Test
	public void testCompareTo(){
		Pelikula p2=new Pelikula("Daniel & Ana");
		assertEquals(9,p.compareTo(p2));
		Pelikula p3=new Pelikula("Me gusta cuando callas");
		assertEquals(0,p.compareTo(p3));
		assertEquals(-9,p2.compareTo(p));
	}

}
