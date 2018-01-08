
public class BinaryTree {

	Node root;
	
	public void insertNode(String data, int key) {
		Node newNode = new Node(key, data);
		if(root == null) {
			root = newNode;
		}else {
			Node focusNode = root;
			Node parent;
			while(true) {
				parent = focusNode;
				if(key < focusNode.key ) {
					focusNode = focusNode.leftNode;
					if(focusNode == null) {
						parent.leftNode = newNode;
						return;
					}
				}else {
					focusNode = focusNode.rightNode;
					if(focusNode == null) {
						parent.rightNode = newNode;
						return;
					}
				}
				
			}
		}
	}
	
	public void inOrderTraverse(Node focusNode) {
		if(focusNode != null) {
			inOrderTraverse(focusNode.leftNode);
			System.out.println(focusNode);
			inOrderTraverse(focusNode.rightNode);
		}
			
	}
	
	public void postOrderTraverseNode(Node focusNode) {
		if(focusNode != null) {
			postOrderTraverseNode(focusNode.leftNode);
			postOrderTraverseNode(focusNode.rightNode);
			System.out.println(focusNode);
		}
	}
	
	public void preOrderTraverseNode(Node focusNode) {
		if(focusNode != null) {
			System.out.println(focusNode);
			preOrderTraverseNode(focusNode.leftNode);
			preOrderTraverseNode(focusNode.rightNode);
		}
	}
	
	public Node findNode(int key) {
		Node focusNode = root;
		
		while(key != focusNode.key) {
			if(key < focusNode.key) {
				focusNode = focusNode.leftNode;
			}else {
				focusNode = focusNode.rightNode;
			}
		}
		if(focusNode == null) {
			return null;
		}
		return focusNode;
	}
	
	public int minimumDepth(Node focusNode) {
		if(focusNode == null)
			return 0;
		
		if(focusNode.leftNode == null && focusNode.rightNode == null)
			return 1;
		
		if(focusNode.leftNode == null)
			return minimumDepth(focusNode.rightNode) + 1;
		
		if(focusNode.rightNode == null)
			return minimumDepth(focusNode.leftNode) + 1;
		
		return Math.min(minimumDepth(focusNode.leftNode), minimumDepth(focusNode.rightNode)) + 1;
	}
	
	public boolean checkBinaryTreeisFullTree(Node focusNode) {
		if(focusNode == null)
			return true;
		
		if(focusNode.leftNode == null && focusNode.rightNode == null)
			return true;
		
		if(focusNode.leftNode != null && focusNode.rightNode != null)
			return (checkBinaryTreeisFullTree(focusNode.leftNode) && checkBinaryTreeisFullTree(focusNode.rightNode));
		
		return false;
	}
	public static void main (String arg[] ) {
		BinaryTree b = new BinaryTree();
		b.insertNode("Five", 5);
		b.insertNode("Six", 6);
		b.insertNode("Four", 4);
		b.insertNode("Seven", 7);
		b.insertNode("Nine", 9);
		b.insertNode("One", 1);
		b.inOrderTraverse(b.root);
		System.out.println("");
		b.postOrderTraverseNode(b.root);
		System.out.println("");
		b.preOrderTraverseNode(b.root);
		System.out.println("");
		System.out.println(b.findNode(1));
		System.out.println("");
		int minimumDepthofNode  = b.minimumDepth(b.root);
		System.out.println(minimumDepthofNode);
		System.out.println("");
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10,"10");
		tree.root.leftNode = new Node(20,"20");
        tree.root.rightNode = new Node(30,"30");
        tree.root.leftNode.rightNode = new Node(40,"40");
        tree.root.leftNode.leftNode = new Node(50,"50");
        tree.root.rightNode.leftNode = new Node(60,"60");
        tree.root.leftNode.leftNode.leftNode = new Node(80,"80");
        tree.root.rightNode.rightNode = new Node(70,"70");
        tree.root.leftNode.leftNode.rightNode = new Node(90,"90");
        tree.root.leftNode.rightNode.leftNode = new Node(80,"80");
        tree.root.leftNode.rightNode.rightNode = new Node(90,"90");
        tree.root.rightNode.leftNode.leftNode = new Node(80,"80");
        tree.root.rightNode.leftNode.rightNode = new Node(90,"90");
        tree.root.rightNode.rightNode.leftNode = new Node(80,"80");
        tree.root.rightNode.rightNode.rightNode = new Node(90,"90");
		System.out.println("Root Node is a Full Tree : " + b.checkBinaryTreeisFullTree(tree.root));
	}
}

class Node{
	Node rightNode;
	Node leftNode;
	int key;
	String name;
	
	Node(int key, String name ){
		this.key = key;
		this.name = name;
	}
	
	public String toString() {
		return name + " has the key " + key;
	}
}