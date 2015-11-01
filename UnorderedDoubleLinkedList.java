package labo;

public class UnorderedDoubleLinkedList<T> extends DoubleLinkedList<T> implements UnorderedListADT<T> {
	
	public void addToFront(T elem) {
	//KOSTUA = O(1)
		Node<T> node = new Node<T> (elem);
		if (isEmpty()) {
			this.first = node;
			this.last = node;
		}
		else{
			this.first.prev = node;
			node.next = this.first;
			this.first = node;
		}
		count++;
	}

	public void addToRear(T elem) {
	// KOSTUA  = O(1)
		Node<T> node = new Node<T> (elem);
		if (isEmpty()) {
			this.first = node;
			this.last = node;
		}
		else{
			this.last.next = node;
			node.prev = this.last;
			this.last = node;
		}
		count++;
	}
	
	public void addAfter(T elem, T target) {
		// KOSTUA = O(N)
		boolean aurkituta = false;
        Node<T> unekoa= first;
        if (this.last.data == target){
        	this.addToRear(elem);
        }
        else{
			while (unekoa != null && !aurkituta) {
				if(unekoa.data == target){
	        		aurkituta=true;
	        	}
	        	else{
	        		unekoa=unekoa.next;
	        	}
			}
			if (aurkituta){
				Node<T> node = new Node<T> (elem);
				node.next = unekoa.next;
				unekoa.next = node;
				node.prev = unekoa;
				node.next.prev = node;
				count++;
			}
        }
	}

}
