package labo;

import java.util.*;

public class AktoreKatalogoa {
	private ListaAktoreak arrayLista;
	private HashMap<String,Aktorea> lista;
	private static AktoreKatalogoa nireAktoreKatalogoa;
	
	private AktoreKatalogoa(){
		this.lista=new HashMap<String,Aktorea>();
		this.arrayLista= new ListaAktoreak();
	}
	
	public static AktoreKatalogoa getNireAktoreKatalogoa(){
		  if(AktoreKatalogoa.nireAktoreKatalogoa==null){
			  AktoreKatalogoa.nireAktoreKatalogoa=new AktoreKatalogoa();
		  }
		  return nireAktoreKatalogoa;
		  
		 }
	
	public String[] AktoreenIzenenLista(){
		return this.lista.keySet().toArray(new String[this.lista.size()]);
	}
	
	public Aktorea aktoreaBilatu(String pIzen){
		Aktorea aktore1=null;
		if (this.lista.containsKey(pIzen)){
			aktore1=(Aktorea)this.lista.get(pIzen);
		}
		return aktore1;
	}
	
	public boolean AktoreaDago(String pIzen){
		return this.lista.containsKey(pIzen);
	}
	
	public void aktoreaTxertatu(Aktorea a){
		if (!this.lista.containsKey(a.getIzena())){
			this.lista.put(a.getIzena(),a);
			this.arrayLista.gehituAkt(a);
		}
	}
	
	public Aktorea[] ordenatu(){
		Aktorea[] taula=this.arrayLista.arrayaSortu();
		this.quickSort(taula);
		return taula;
	}
	
	public Aktorea[] taulaSortuOrdenatuGabe(){
		Aktorea[] taula=this.arrayLista.arrayaSortu();
		return taula;
	}
	
	private void quickSort(Aktorea[] taula){
		quickSort(taula, 0, taula.length - 1);
	}
	
	private void quickSort(Aktorea[] taulaBat,int hasiera,int bukaera){
		if (bukaera-hasiera>0){
			int indizeaZatiketa=zatiketa(taulaBat,hasiera,bukaera);
			quickSort(taulaBat,hasiera,indizeaZatiketa-1);
			quickSort(taulaBat,indizeaZatiketa+1,bukaera);
		}
	}
	private int zatiketa(Aktorea[] taula,int i,int f){
		Aktorea lag=taula[i];
		int ezker=i;
		int eskuin=f;
		while(ezker<eskuin){
			while(taula[ezker].compareTo(lag)<=0 && ezker<eskuin)
				ezker++;
			while(taula[eskuin].compareTo(lag)>0)
				eskuin--;
			if (ezker<eskuin)
				swap(taula,ezker,eskuin);
		}
		taula[i]=taula[eskuin];
		taula[eskuin]=lag;
		return eskuin;
	}
	
	private void swap(Aktorea[] taula, int ezker, int eskuin){
		Aktorea a=taula[ezker];
		taula[ezker]=taula[eskuin];
		taula[eskuin]=a;
	}
	
	public void ezabatuAktKatalogotik(String izena){
		Aktorea a=this.lista.get(izena);
		this.lista.remove(izena);
		this.arrayLista.kenduAkt(a);
	}
	
	public void inprimatu(Aktorea[] taula){ //Ordenatu metodoa probatzeko
		int i=0;
		while (i<taula.length){
			System.out.println(taula[i].getIzena());
			i++;
		}
	}
	
	public void erreseteatu(){
		this.lista.clear();
		AktoreKatalogoa.nireAktoreKatalogoa=null;
	}
	
}



