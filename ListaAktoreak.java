package labo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAktoreak {
	private ArrayList<Aktorea> lista;
	
	public ListaAktoreak(){
		this.lista=new ArrayList<Aktorea>();
	}
	
	private Iterator<Aktorea> getIteradorea(){
		  return this.lista.iterator();
		 }

	public boolean aktoreHauDu(Aktorea a) {
		boolean baDago=false;
		Aktorea aktore1=null;
		Iterator<Aktorea>itr;
		itr=this.getIteradorea();
		while(itr.hasNext()&&!baDago){
		   aktore1=itr.next();
		   if(aktore1.equals(a)){
		      baDago=true;
		   }
		  }
		return baDago;
	}
	
	public void aktoreakBueltatu() {
		Aktorea aktore1=null;
		Iterator<Aktorea>itr;
		itr=this.getIteradorea();
		while(itr.hasNext()){
			aktore1=itr.next();
			System.out.println(aktore1.getIzena());
		}
	}

	public void gehituAkt(Aktorea a) {
		this.lista.add(a);	
	}
	public void kenduAkt(Aktorea a){
		this.lista.remove(a);
	}

	public Aktorea[] arrayaSortu() {
		Aktorea[] array = this.lista.toArray(new Aktorea[this.lista.size()]);
		return array;
	}

}
