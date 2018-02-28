
public class DecodeString {

	public static void main (String  args[]) {
		String decodeString = "SA";
		int value = numDecodings(decodeString);
		System.out.println(value);
	}
	
	public static int decode(String word) {
		int prev = 1, curr = 1;
		int ways[] = new int[word.length()+1];

		if(word.length() == 0 || word.charAt(0) == '0' || word.isEmpty())
			return 0;
		
		for(int i=1; i < word.length()-1; i++) {
			if(word.charAt(i) == '0') {
				if(word.charAt(i-1) == '0' || word.charAt(i-1) > '2') {
					return 0;
				}
				prev = curr;
				
			}else{
				if(word.charAt(i-1) == '1' || (word.charAt(i-1) == '2' && word.charAt(i) < '7')) {
					int next = prev+curr;
					prev = curr;
					curr = next;
				}else {
					prev = curr;
				}
			}
		}
		
		return curr;
	}
	
	public static int numDecodings(String s) {
        int n = s.length();
        if(n==0) return 0;
        int ways[] = new int[n+1];
        
        ways[0]=1;
        ways[1] = s.charAt(0) !='0' ? 1:0;
        for(int i=2; i<=n; i++){
            if(s.charAt(i-1) !='0'){
                ways[i] = ways[i-1];
            }
            int val = (s.charAt(i-2)-'0')*10 + (s.charAt(i-1)-'0');
            if(val<=26 && val>=10){
                ways[i] += ways[i-2];
            }
        }
        return ways[n];
    }
}
