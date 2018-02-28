import java.util.ArrayList;
import java.util.HashSet;

public class SameCharString {

	static ArrayList<String> answer = new ArrayList<>();
	static int i= 0;
	
	public static void main(String[] arg) {
		String s = "ramanuj";
		 ArrayList<String> a = generate(s);
		 System.out.println(a.toString());
	}
	
    static ArrayList<String> generate(String str) {
        if (str == null || str.length() == 0) return new ArrayList<>(); 
        StringBuilder from = new StringBuilder(str);
        StringBuilder to = new StringBuilder();
        helper(from, to, ' ');
        return answer;
    }
    
    
    private static void helper(StringBuilder from , StringBuilder to, char prevChar) {
    	if (from.length() == 0) {
            answer.add(to.toString());
            return;
        }
        HashSet<Character> set = new HashSet<>();
        int len = from.length();
        for (int i = 0; i < len; i++) {
            char ch = from.charAt(i);
            if (ch != prevChar && !set.contains(ch)) {
                to.append(ch);
                from.deleteCharAt(i);
                set.add(ch);                
                helper(from, to, ch);
                from.insert(i, ch);
                to.deleteCharAt(to.length()-1);
            }
        }
    }
    
    
    
    
}
