import java.util.Collections;
import java.util.Hashtable;

public class StringManiuplation {

	
	
	
	public static void main(String[] arg) {
		char[] a = {'A', 'B','C','D','E','B','Z','B','g','h','H','J','K','L', 'A'};
		
		StringManiuplation as = new StringManiuplation();
		as.checkCharacters(a);
	}
	
	
	public void checkCharacters(char[] a) {
		Hashtable<String, Counter> aa = new Hashtable<String, Counter>(a.length);
		for(int i=0 ; i < a.length; i++) {
			if(aa.containsKey(String.valueOf(a[i]).toLowerCase())) {
				aa.get(String.valueOf(a[i]).toLowerCase()).incCount();
				System.out.println("First Repeating character is : " + a[i]);
			}else {
				aa.put(String.valueOf(a[i]).toLowerCase(), new Counter(i));
			}
		}
		
		int result = Integer.MAX_VALUE ;
		for (int i = 0; i < a.length;  i++)
        {
             // If this character occurs only once and appears
            // before the current result, then update the result
            if (aa.get(String.valueOf(a[i]).toLowerCase()).count == 1 && result > aa.get(String.valueOf(a[i]).toLowerCase()).index){
                 result = aa.get(String.valueOf(a[i]).toLowerCase()).index;
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
