package labo;

public class Pelikula implements Comparable<Pelikula> {
	private String izenburua;
	private ListaAktoreak lista;
	private int dirua;
	
	public Pelikula(String pIzenburua){
		this.izenburua=pIzenburua;
		this.dirua=0;
		this.lista=new ListaAktoreak();
	}
	
	public int getDirua(){
		return this.dirua;
	}
	
	public boolean equals(Pelikula p){
		if (this.izenburua.equals(p.izenburua)){
			return true;
		}
		else{ return false;}
	}
	
	public boolean equals2(String pIzenb){
		if (this.izenburua.equals(pIzenb)){
			return true;
		}
		else{ return false;}
	}
	
	public int compareTo(Pelikula p){
		return this.izenburua.compareTo(p.izenburua);
	}
	
	public void gehituAktorea(Aktorea a){
		if (!this.lista.aktoreHauDu(a)){
			this.lista.gehituAkt(a);
		}
	}
	
	public void kenduAktorea(Aktorea a){
		if (this.lista.aktoreHauDu(a)){
			this.lista.kenduAkt(a);
		}
	}
	
	public void aktoreakBueltatu() {
		this.lista.aktoreakBueltatu();
	}

	public String getIzenburua() {
		return this.izenburua;
	}

	public void diruaGehitu(int dirua) {
		this.dirua=this.dirua+dirua;
	}

}
