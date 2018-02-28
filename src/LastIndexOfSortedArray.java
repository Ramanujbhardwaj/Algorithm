//We need to find last index of Sorted Duplicate Array.
public class LastIndexOfSortedArray {

	public static void main(String[] arg) {
		int a[] = {1,3, 4, 6, 7, 7, 8, 9};
		int indexposition = LastIndexOfSortedArray.indexReturned(a);
		System.out.println("The index position is: " + indexposition + " The value is: " + a[indexposition] );
	}
	
	//Need to find the location of 7 since this is the last duplicate number.
	public static int indexReturned(int j[]) {
		//Starting from behind since it is last.
		for(int i= j.length-1 ; i >= 0; i--) {
			int k = i-1; //This is the position before i
			if(k >= 0 && j[k] == j[i])
				return i;
		}
		
		return 0;
	}
}
