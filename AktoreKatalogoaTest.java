package labo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AktoreKatalogoaTest {
	AktoreKatalogoa ak1;

	@Before
	public void setUp() throws Exception {
		ak1 = AktoreKatalogoa.getNireAktoreKatalogoa();
	}

	@After
	public void tearDown() throws Exception {
		ak1.erreseteatu();
	}

	@Test
	public void testAktoreaBilatu() {
		Aktorea a = new Aktorea("Kotsifakis, Hector");
		ak1.aktoreaTxertatu(a);
		assertSame(a,ak1.aktoreaBilatu("Kotsifakis, Hector"));
		assertNull(ak1.aktoreaBilatu("Lilleb , Lena Granaas"));
	}
	
	@Test
	public void testOrdenatu(){
		Aktorea a1 = new Aktorea("Kotsifakis, Hector");
		Aktorea a2 = new Aktorea("Kakurina, Alexandra");
		Aktorea a3 = new Aktorea("Andreasson, Elisabeth");
		ak1.aktoreaTxertatu(a1);
		ak1.aktoreaTxertatu(a2);
		ak1.aktoreaTxertatu(a3);
		
		Aktorea[] ordenatuGabe = ak1.taulaSortuOrdenatuGabe();
		ak1.inprimatu(ordenatuGabe);
		System.out.println();
		Aktorea[] ordenatuta = ak1.ordenatu();
		ak1.inprimatu(ordenatuta);
	}
	
	@Test
	public void testEzabatuAktkatalogotik(){
		Aktorea a1 = new Aktorea("Kotsifakis, Hector");
		Aktorea a2 = new Aktorea("Kakurina, Alexandra");
		Aktorea a3 = new Aktorea("Andreasson, Elisabeth");
		ak1.aktoreaTxertatu(a1);
		ak1.aktoreaTxertatu(a2);
		ak1.aktoreaTxertatu(a3);
		
		Aktorea[] taula1 = ak1.taulaSortuOrdenatuGabe();
		ak1.inprimatu(taula1);
		System.out.println();
		ak1.ezabatuAktKatalogotik(a1.getIzena());
		Aktorea[] taula2 = ak1.taulaSortuOrdenatuGabe();
		ak1.inprimatu(taula2);
		}

}
