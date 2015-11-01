package labo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IrakurriTest {
	private AktoreKatalogoa aktoreKat;
	private Irakurri i;

	@Before
	public void setUp() throws Exception {
		aktoreKat=AktoreKatalogoa.getNireAktoreKatalogoa();
	}

	@After
	public void tearDown() throws Exception {
		aktoreKat=null;
	}

<<<<<<< HEAD
	//@Test
=======
	@Test
>>>>>>> 5e498f1e111a28036192281e7e9c36fae7abb35f
	public void testKargatu() {
		i = new Irakurri();
		try{
			i.kargatu("C://Users/Iker/Desktop/Program/DEA/src/lab1/aaa.txt");//Hau ALDATU ordenagailuaren arabera
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		assertTrue(AktoreKatalogoa.getNireAktoreKatalogoa().AktoreaDago("Kotsifakis, Hector"));//lehenengo aktorean 3 simbolo agertzen dira hasieran
		assertTrue(AktoreKatalogoa.getNireAktoreKatalogoa().AktoreaDago("Aaberge, Tone Damli"));
		assertTrue(AktoreKatalogoa.getNireAktoreKatalogoa().AktoreaDago("Holub, Carla"));
		assertTrue(PelikulaKatalogoa.getNirePelikulaKatalogoa().pelikulaDago("Me gusta cuando callas"));
		assertTrue(PelikulaKatalogoa.getNirePelikulaKatalogoa().pelikulaDago("Daniel & Ana"));
		assertTrue(PelikulaKatalogoa.getNirePelikulaKatalogoa().pelikulaDago("Seven Mummies"));
		//aktoreKat.inprimatu(aktoreKat.taulaSortuOrdenatuGabe());
	}
	
<<<<<<< HEAD
	//@Test
	public void testAktoreFitxSortu(){
		i = new Irakurri();
		try{
			i.kargatu("C://Users/Iker/Desktop/Program/DEA/src/lab1/aaa.txt");
=======
	@Test
	public void testAktoreFitxSortu(){
		i = new Irakurri();
		try{
			i.kargatu("D:\\lanlekua\\DEA\\src\\lab1\\actors-small.txt");
>>>>>>> 5e498f1e111a28036192281e7e9c36fae7abb35f
			Irakurri.aktoreFitxSortu(aktoreKat.AktoreenIzenenLista());
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void testOrdenatu(){
		i = new Irakurri();
		try{
			i.kargatu("C://Users/Iker/Desktop/Program/DEA/src/lab1/aaa.txt");//Hau ALDATU ordenagailuaren arabera
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		Aktorea[] lista = aktoreKat.ordenatu();
<<<<<<< HEAD
		aktoreKat.inprimatu(lista);
=======
		//aktoreKat.inprimatu(lista);
>>>>>>> 5e498f1e111a28036192281e7e9c36fae7abb35f
	}
}
