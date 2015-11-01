package labo;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class DoubleLinkedList<T> implements ListADT<T> {

	// Atributuak
	protected Node<T> first; // lehenengoaren erreferentzia
	protected Node<T> last; // lehenengoaren erreferentzia
	protected String deskr;  // deskribapena
	protected int count;

	public DoubleLinkedList() {
		first = null;
		last = null;
		deskr = "";
		count = 0;
	}
	
	public void setDeskr(String ize) {
	  deskr = ize;
	}

	public String getDeskr() {
	  return deskr;
	}

	public T removeFirst() {
	// listako lehen elementua kendu da
	// Aurrebaldintza: zerrenda ez da hutsa
		// KOSTUA = O(1)
		T elem = this.first.data;
		if (this.count == 1){
			this.first = null;
			this.last = null;
		}
		else{
			this.first= this.first.next;
			this.first.prev = null;
		}
		this.count--;
		return elem;
	}

	public T removeLast() {
	// listako azken elementua kendu da
	// Aurrebaldintza: zerrenda ez da hutsa
		// KOSTUA = O(1)
		T elem = this.last.data;
		if (this.count == 1){
			this.first = null;
			this.last = null;
		}
		else{
			this.last = this.last.prev;
			this.last.next = null;
		}
		this.count--;
        return elem;
    }


	public T remove(T elem) {
	// Aurrebaldintza: zerrenda ez da hutsa
	// Balio hori listan baldin badago, bere lehen agerpena ezabatuko dut. Kendutako objektuaren erreferentzia 
    //  bueltatuko du (null ez baldin badago)
		// KOSTUA = O(N)
    	boolean aurkituta = false;
        Node<T> unekoa= first;
        while (unekoa != null && !aurkituta) {
        	if(unekoa.data == elem){
        		aurkituta=true;
        	}
        	else{
        		unekoa=unekoa.next;
        	}
        }
        if (aurkituta){
        	if(this.count == 1){
        		this.first=null;
        		this.last=null;
        	}		
        	else{ 
        		if (this.first.data == elem){
            		this.first= this.first.next;
            		this.first.prev = null;
        		}
        		else{ 
        			if (this.last.data == elem){
        				this.last = this.last.prev;
        				this.last.next = null;
        			}
        			else{
        			unekoa.prev.next = unekoa.next;
        			unekoa.next.prev = unekoa.prev;
        			}
        		}
        	}
        	this.count--;
        }
		return elem;
	}

	public T first() {
	// listako lehen elementua ematen du
	//integer, boolean... kasuan zerrenda ezin da hutsa izan
	      if (isEmpty())
	          return null;
	      else return first.data;
	}

	public T last() {
	// listako azken elementua ematen du
	//integer, boolean... kasuan zerrenda ezin da hutsa izan
	      if (isEmpty())
	          return null;
	      else return last.data;
	}

	public boolean contains(T elem) {
	// Egiazkoa bueltatuko du aurkituz gero, eta false bestela
		      if (isEmpty())
		          return false;

		      Node<T> current = first; // Bigarren elementuarekin hasiko da

		      while ((current != null) && !elem.equals(current.data)) 
		            current = current.next;
                      if (current == null) return false;
		      else return elem.equals(current.data);
		   }

	public T find(T elem) {
	// Elementua bueltatuko du aurkituz gero, eta null bestela
		// KOSTUA = O(N)
		if (isEmpty()){
            return null;}
        else{ 
        	boolean aurkituta = false;
            Node<T> unekoa= first;
            while (unekoa != null && !aurkituta) {
            	if(unekoa.data == elem){
            		aurkituta=true;
            	}
            	else{
            		unekoa=unekoa.next;
            	}
            }
            if (aurkituta) return elem;
            else return null;
        }
	}
	
	public T find2(String elem) {
		// String bat sartuko diogu eta ez T mota
		// Elementua bueltatuko du aurkituz gero, eta null bestela
			// KOSTUA = O(N)
			if (isEmpty()){
	            return null;}
	        else{ 
	        	boolean aurkituta = false;
	            Node<T> unekoa= first;
	            while (unekoa != null && !aurkituta) {
	            	Pelikula p=(Pelikula)unekoa.data;
	            	if(p.equals2(elem)){
	            		aurkituta=true;
	            	}
	            	else{
	            		unekoa=unekoa.next;
	            	}
	            }
	            if (aurkituta) return unekoa.data;
	            else return null;
	        }
		}

	public boolean isEmpty() 
	{ return last == null;};
	
	public int size() 
	{ return count;};
	
	/** Return an iterator to the stack that iterates through the items . */ 
	   public Iterator<T> iterator() { return new ListIterator(); } 
	   		
	   // an iterator, doesn't implement remove() since it's optional 
	   private class ListIterator implements Iterator<T> {
		   private Node<T> i;
		   
		   public ListIterator(){
			   this.i = first;
		   }
		   
		   public T next(){
			   if (!hasNext()) throw new NoSuchElementException();
			   else{
				   T elem = i.data;
				   i=i.next;
				   return elem;
			   }	
		   }
		   
		   public boolean hasNext(){
			   return i!= null;
		   }
	   }
		
		
		public void adabegiakInprimatu() {
			System.out.println(this.toString());
		}

		
		@Override
		public String toString() {
			String result = new String();
			Iterator<T> it = iterator();
			while (it.hasNext()) {
				T elem = it.next();
				result = result + "[" + elem.toString() + "] \n";
			}	
			return "SimpleLinkedList " + result + "]";
		}

}
