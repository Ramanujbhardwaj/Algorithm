
public class RemoveDuplicateChar {

	private static void removeDuplicates(char[] str) {
        if (str == null || str.length < 2) {
            return;
        }

        int tail = 0;

        for (int i = 0; i < str.length; i++) {
            boolean found = false;

            // check if character is already present in
            // the part of the array before the current char
            for (int j = 0; j < i; j++) {
                if (str[j] == str[i]) {
                    found = true;
                    break;
                }
            }

            // if char is already present
            // skip this one and do not copy it
            if (found) {
                continue;
            }

            // copy the current char to the index 
            // after the last known unique char in the array
            str[tail] = str[i];
            tail++;
        }

//        str[tail] = '\0';
        System.out.println(new String(str));
    }
	
	public static void main(String[] ar) {
		char[]  r = {'g','o','o','g','l','e'};
		System.out.println(r);
		removeDuplicates(r);
	}
	
	public static void removeDuplicates1(char[] str) {
		  if (str == null) return;
		  int len = str.length;
		  if (len < 2) return;
		  int tail = 1;
		  for (int i = 1; i < len; ++i) {
		    int j;
		    for (j = 0; j < tail; ++j) {
		      if (str[i] == str[j]) break;
		    }
		    if (j == tail) {
		      str[tail] = str[i];
		      ++tail;
		    }
		  }
		  str[tail] = 0;
		  System.out.println(new String(str));
		}
}
