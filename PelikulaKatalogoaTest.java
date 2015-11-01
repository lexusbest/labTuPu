package labo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PelikulaKatalogoaTest {
	PelikulaKatalogoa k1;

	@Before
	public void setUp() throws Exception {
		k1=PelikulaKatalogoa.getNirePelikulaKatalogoa();
	}

	@After
	public void tearDown() throws Exception {
		k1=null;
	}

	@Test
	public void testPelikulaDago() {
		Pelikula p=new Pelikula("Me gusta cuando callas");
		k1.pelikulaTxertatu(p);
		assertTrue(k1.pelikulaDago("Me gusta cuando callas"));
		assertFalse(k1.pelikulaDago("Daniel & Ana"));
		k1.erreseteatu();
	}
	
	@Test
	public void testBilatuPelikula() {
		Pelikula p=new Pelikula("Me gusta cuando callas");
		k1.pelikulaTxertatu(p);
		assertEquals(p,k1.bilatuPelikula("Me gusta cuando callas"));
		assertNull(k1.bilatuPelikula("Daniel & Ana"));
		k1.erreseteatu();
	}
	
	@Test
	public void testDiruaGehitu() {
		Pelikula p=new Pelikula("Me gusta cuando callas");
		k1.pelikulaTxertatu(p);
		k1.diruaGehitu("Me gusta cuando callas",777);
		assertEquals(777,p.getDirua());
		k1.diruaGehitu("Daniel & Ana",888);
	}

}
