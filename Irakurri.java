package labo;

import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;

public class Irakurri {
	
	
	public Irakurri(){	
		
	}
	
	public void kargatu(String fitx)throws Exception{
		Aktorea aktore=null;
		int i;
		//int x = 0;
		Pelikula peli=null;
		try{
			 Scanner sarrera = new Scanner(new FileReader(fitx));
			 String lerroa;
			 while (sarrera.hasNext()) {
				 i=0;
				 lerroa = sarrera.nextLine();
				 String[] hitzak=lerroa.split(" ### ");
				 aktore= new Aktorea(hitzak[i]);
				 AktoreKatalogoa.getNireAktoreKatalogoa().aktoreaTxertatu(aktore);
				 i++;
				 while(i<hitzak.length){
					 if (!PelikulaKatalogoa.getNirePelikulaKatalogoa().pelikulaDago(hitzak[i])){
						 peli= new Pelikula(hitzak[i]);
						 PelikulaKatalogoa.getNirePelikulaKatalogoa().pelikulaTxertatu(peli);
						 aktore.gehituPelikula(peli);
					 }
					 else{
						 peli=PelikulaKatalogoa.getNirePelikulaKatalogoa().bilatuPelikula(hitzak[i]);
						 aktore.gehituPelikula(peli);	 
					 }
					 peli.gehituAktorea(aktore);
					 i++;
				 }
				 //System.out.println(x++);
			 }
			 sarrera.close();
			 }
			 catch(IOException e) {e.printStackTrace();}
	}
	
	public static void aktoreFitxSortu(String[] taula) throws IOException{
		File fitxIzena=new File("Aktoreak.txt");
		try{
			FileWriter fw=new FileWriter(fitxIzena);
			BufferedWriter output=new BufferedWriter(fw);
			int sz=taula.length;
			for (int i=0; i<sz; i++){
				output.write(taula[i]);
				output.newLine();
			}
			output.close();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "ezin da fitxategia sortu");
		}
	}

}
