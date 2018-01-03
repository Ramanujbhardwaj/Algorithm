
public class List {

	Node head;
	Nodes heads;
	
	static class Node{
		String data;
		String data1;
		Node next;
		Node(String d, String d1)
		{
			data = d;
			data1 = d1;
			next = null;
		}
	}
	
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
			heads = new Nodes(a,b);
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
	
		List l1 = new List();
		
		l1.head = new Node("Ram1", "Anuj1");
		Node l2 = new Node("Ram2", "Anuj2");
		Node l3 = new Node("Ram3", "Anuj3");
		l1.head.next = l2;
		l2.next = l3;
		l1.printList();
		
		
	     List llist = new List();
	     
	        // Insert 6.  So linked list becomes 6->NUllist
	        llist.insertAtEnd("Y", "Y1");
	        llist.printLists();
	        // Insert 7 at the beginning. So linked list becomes
	        // 7->6->NUllist
	        llist.push("VC","DV");
	        llist.printLists();
	        // Insert 1 at the beginning. So linked list becomes
	        // 1->7->6->NUllist
	        llist.push("A", "B");
	        llist.printLists();
	        // Insert 4 at the end. So linked list becomes
	        // 1->7->6->4->NUllist
	        llist.insertAtEnd("Z","Z1");
	        llist.printLists();
	        // Insert 8, after 7. So linked list becomes
	        // 1->7->8->6->4->NUllist
	        llist.insertAfterNodes(llist.heads.next, "A1", "B1");
	        llist.printLists();
	        System.out.println("\nCreated Linked list is: ");
	        llist.printLists();
		
	}
	
	
	public void printList() {
		Node anew = head;
		while(anew != null) {
			System.out.println(anew.data + anew.data1);
			anew = anew.next;
		}
	}
	
	public void printLists() {
		Nodes anew = heads;
		while(anew != null) {
			System.out.println(anew.d + anew.d2);
			anew = anew.next;
		}
	}
	
}
