
public class Tries {

	static TrieNode root;
	int charSetSize;
	
	static class TrieNode{
		boolean endOfWord;
		int frequency;
		TrieNode[] children;
		
		TrieNode(int size){
			children = new TrieNode[size];
		}
	}
	
	public void addWord(String word) {
		set(word, 1);
	}
	
	public void set(String word, int l) {
		TrieNode current = root;
		for(char ch: word.toCharArray()) {
			if(current.children[ch] == null) {
				current.children[ch] = new TrieNode(26);
			}
			current.children[ch].frequency += l;
			current = current.children[ch];
		}
		current.endOfWord = true;
	}
	
	public void remove(String word) {
		if(get(word) > 1) {
			set(word, -1);
		}else
			System.out.println("Word does not exist");
	}
	
	public int get(String word) {
		TrieNode current = root;
		for(char ch: word.toCharArray()) {
			if(current.children[ch] == null)
				return -1;
			current = current.children[ch];
		}
		return current.endOfWord ? current.frequency : -1;
		}
	
	public static void main(String[] arg) {
		
		Tries tr = new Tries();
		root = new TrieNode(10);
		String word = "SOUP";
		tr.addWord(word);
	}
}

