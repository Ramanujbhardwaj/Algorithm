
public class List1 {

	Nodes heads;
	
	
	class Nodes{
		String d;
		String d2;
		Nodes next;
		Nodes(String d, String d2){
			this.d = d;
			this.d2 = d2;
			next = null;
		}
	}
	
	public void push(String a, String b) {
		Nodes newNode = new Nodes(a, b);
		newNode.next = heads;
		heads = newNode;
	}
	
	public void insertAfterNodes(Nodes prevNode, String a, String b) {
		if(prevNode == null) {
			System.out.println("Empty PreviousNode");
			return;
		}
		Nodes newNodes = new Nodes(a,b);
		newNodes.next = prevNode.next;
		prevNode.next = newNodes;
	}
	
	public void insertAtEnd(String a, String b) {
		Nodes newNode = new Nodes(a,b);
		if(heads == null) {
			heads = newNode;
			return;
		}
		newNode.next = null;
		Nodes last = heads;
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = newNode;
		return;
	}
	
	public static void main(String[] arg) {
	
		
		
		
	     List1 llist = new List1();
	     
	        // Insert 6.  So linked list becomes 6->NUllist
	        llist.insertAtEnd("Y", "Y1");
	        // Insert 7 at the beginning. So linked list becomes
	        // 7->6->NUllist
	        llist.push("VC","DV");
	        // Insert 1 at the beginning. So linked list becomes
	        // 1->7->6->NUllist
	        llist.push("A", "B");
	        // Insert 4 at the end. So linked list becomes
	        // 1->7->6->4->NUllist
	        llist.insertAtEnd("Z","Z1");
	        // Insert 8, after 7. So linked list becomes
	        // 1->7->8->6->4->NUllist
	        llist.insertAfterNodes(llist.heads.next, "A1", "B1");
	        llist.printLists();
	        llist.deleteNodeForAKey("A1", "B1");
	        System.out.println("\nCreated Linked list is: ");
	        llist.printLists();
	        
		
	}
	
	public void deleteNodeForAKey(String d, String d1) {
		Nodes temp = heads;
		Nodes prev = null;
		if(temp != null && (temp.d == d && temp.d2 == d1)) {
			heads = temp.next;
			return;
		}
		while(temp != null && (temp.d != d && temp.d2 != d1)) {
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)
			return;
		
		prev.next = temp.next;
		return;
	}
	
	
	public void reverseList() {
		Nodes current = heads;
		Nodes previos = null, next = null;
		while(current != null) {
			next = current.next;
			System.out.println("1" + next);
			current.next = previos;
			System.out.println("2" + current + " " + previos);
			previos = current;
			System.out.println("3" + current + " " + previos);
			current = previos;
			
		}
	}
	
	
	public void printLists() {
		Nodes anew = heads;
		while(anew != null) {
			System.out.println(anew.d + anew.d2);
			anew = anew.next;
		}
	}
	
	public void printListsed(Nodes anew) {
		
		while(anew != null) {
			System.out.println(anew.d + anew.d2);
			anew = anew.next;
		}
	}
	
}
