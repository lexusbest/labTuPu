package labo;

public class Aktorea implements Comparable<Aktorea> {
	private String izena;
	private ListaPelikulak lista;
	
	public Aktorea(String pIzena){
		this.izena=pIzena;
		this.lista=new ListaPelikulak();
	}
	
	public boolean equals(Aktorea a){
		if (this.izena.equals(a.izena)){
			return true;
		}
		else{ return false;}
	}
	
	public int compareTo(Aktorea a){
		return this.izena.compareTo(a.izena);
	}
	
	public void gehituPelikula(Pelikula p){
		if (!this.lista.pelikulaHauDu(p)){
			this.lista.gehituPel(p);
		}
	}
	
	public void pelikulakBueltatu() {
		this.lista.pelikulakBueltatu();
	}

	public String getIzena() {
		return this.izena;
	}

}
