
public class Anagram {

	static int _ASCII = 256;
	
	public  static boolean isAnagram(String str1, String str2) {
		
		int[] letter = new int[_ASCII];
		
		if(str1 == null || str2 == null || str1.length() != str2.length())
			return false;
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		for(char c : str1.toCharArray()) {
			letter[c]++;
		}
		for(char c : str2.toCharArray()) {
			letter[c]--;
		}
		
		for(int i : letter) {
			if (i != 0 )
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] arg) {
		String a = "abcdda iouoi";
		String b = "bdaac doioui";
		System.out.println(isAnagram(a, b));
	}
}
