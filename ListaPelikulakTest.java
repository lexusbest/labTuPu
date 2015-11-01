package labo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaPelikulakTest {
	ListaPelikulak l1;

	@Before
	public void setUp() throws Exception {
		l1=new ListaPelikulak();
	}

	@After
	public void tearDown() throws Exception {
		l1=null;
	}

	@Test
	public void testBilatuPelikula() {
		Pelikula p=new Pelikula("Me gusta cuando callas");
		l1.gehituPel(p);
		Pelikula p1=l1.bilatuPelikula("Me gusta cuando callas");
		assertEquals(p,p1);
		Pelikula p2=l1.bilatuPelikula("Daniel & Ana");
		assertNull(p2);
	}

}
