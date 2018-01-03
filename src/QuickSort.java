import java.util.Arrays;

/*
 * O (nLog n)
 */
public class QuickSort {

	private static int theArray[];
	
	private static int theSize;
	
	QuickSort(int newArraySize){
		theSize = newArraySize;
		theArray = new int[theSize];
		generateRandomArray();

	}
	
	public int PartionArray(int left, int right, int pivot) {
		int leftPointer = left-1;
		int rightPointer = right;
		
		while(true) {
			
			while(left < theSize-1 && theArray[++leftPointer] < pivot) {
				;
			}
			
			while(rightPointer > 0 && theArray[--rightPointer] > pivot) {
				;
			}
			
			if(leftPointer >= rightPointer) {
				break;
			}else {
				swapValues(leftPointer, rightPointer);
			}
		}
		swapValues(leftPointer, right);
		return leftPointer;
	}
	
	
	public void quickSort(int left, int right) {
		if(right - left <=0) {
			return;
		}else {
			int pivot = theArray[right];
			int pivotLocation = PartionArray(left, right, pivot);
			quickSort(left, pivotLocation-1);
			quickSort(pivotLocation+1, right);
		}
	}
	
	public void generateRandomArray() {

		for (int i = 0; i < theSize; i++) {

			// Generate a random array with values between
			// 10 and 59

			theArray[i] = (int) (Math.random() * 50) + 10;

		}

	}
	
	public void swapValues(int indexOne, int indexTwo) {

		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	}
	
	public static void main(String[] arg) {
		QuickSort q = new QuickSort(11);
		q.generateRandomArray();
		System.out.println(Arrays.toString(theArray));
		q.quickSort(0, theArray.length-1);
		System.out.println(Arrays.toString(theArray));
	}
}
