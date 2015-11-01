package labo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPelikulak {
	private UnorderedDoubleLinkedList<Pelikula> lista;
	
	public ListaPelikulak(){
		this.lista=new UnorderedDoubleLinkedList<Pelikula>();
	}
	
	private Iterator<Pelikula> getIteradorea(){
		  return this.lista.iterator();
		 }

	public boolean pelikulaHauDu(Pelikula p) {
		return this.lista.contains(p);
	}

	public void gehituPel(Pelikula p) {
		this.lista.addToRear(p);
		
	}

	public void pelikulakBueltatu() {
		this.lista.adabegiakInprimatu();
	}
	
	public Pelikula bilatuPelikula(String pIzenb){
		return this.lista.find2(pIzenb);
		
		
	}

}
