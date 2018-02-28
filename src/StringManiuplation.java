import java.util.HashMap;

public class StringManiuplation {

	
	
	
	public static void main(String[] arg) {
		char[] a = {'A', 'B','C','D','E','B','Z','B','g','H','H','J','K','L', 'A'};
		
		StringManiuplation as = new StringManiuplation();
		as.checkCharacters(a);
	}
	
	
	public void checkCharacters(char[] a) {
		HashMap<Character, Counter> aa = new HashMap<Character, Counter>(a.length);
		for(int i=0 ; i < a.length; i++) {
			if(aa.containsKey(a[i])) {
				aa.get(a[i]).incCount();
				System.out.println("First Repeating character is : " + a[i]);
			}else {
				aa.put(a[i], new Counter(i));
			}
		}
		
		int result = Integer.MAX_VALUE ;
		for (int i = 0; i < a.length;  i++)
        {
             // If this character occurs only once and appears
            // before the current result, then update the result
            if (aa.get(a[i]).count == 1 && result > aa.get(a[i]).index){
                 result = aa.get(a[i]).index;
            }
            
               
        }
			System.out.println(result == Integer.MAX_VALUE ? "Either all characters are repeating " +
	              " or string is empty" : "First non-repeating character is " +  a[result]);
	}
}

class Counter{
	 int count, index ;
	
	Counter(int index) {
		this.index = index;
		this.count = 1;
	}
	
	public void incCount() {
		this.count++;
	}
	
	
}
