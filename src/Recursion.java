import java.util.Arrays;

public class Recursion {

	public int getTriangularNumber(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num + getTriangularNumber(num - 1);
		}
	}
	
	public int getFactorialNumber(int num) {
		if (num == 1) {
			return 1;
		}else {
			return num * getFactorialNumber(num - 1);
		}
	}
	
	public void bubbleSort(int arr[], int length) {
		if(length == 1) {
			return;
		}else {
			for(int i=0; i < length-1; i++) {
				if(arr[i]<arr[i+1]) {
					int temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
				}
			}
			bubbleSort(arr, length-1);
		}
	}
	
	public static void main(String[] arg) {
		int [] aa = {4,12,15,3,18,6,29,10,1,0};
		Recursion a = new Recursion();
		System.out.println(a.getTriangularNumber(16));
		System.out.println(a.getFactorialNumber(16));
		a.bubbleSort(aa, aa.length);
		System.out.println(Arrays.toString(aa));
	}
}
