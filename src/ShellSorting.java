import java.util.Arrays;

public class ShellSorting {

	public int sortShell(int[] a) {
		
		int length = a.length;
		
		for(int gap = length/2; gap > 0; gap /= 2 ) {
			System.out.println(gap);
			for(int i=gap; i<length; i += 1) {
				System.out.println(i);
				int temp = a[i];
				
				int j;
				for(j=i; j >= gap && a[j-gap] > temp; j -=gap) {
					a[j] = a[j-gap];
				}
					a[j] = temp;
			}
		}
		return 0;
	}
	
	public static void main(String arg[]) {
		int arr[] = {12, 34, 54, 2, 3, 45, 234, 2, 1, 345, 12};
        System.out.println("Array before sorting" + Arrays.toString(arr));
        
        ShellSorting ob = new ShellSorting();
        ob.sortShell(arr);
 
        System.out.println("Array after sorting" + Arrays.toString(arr));
	}
}
