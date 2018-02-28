import java.util.Arrays;
import java.util.Stack;

public class ArrayStructures {

	private int[] theArrays = new int[50];
	
	private int arraySize = 10;
	
	public void randomArrayGenerator() {
		for (int i=0; i < arraySize; i++) {
			theArrays[i] = (int)(Math.random()*10)+10;
		}
	}
	
	public void printArray() {
		System.out.println("----------");
		for (int i= 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArrays[i] + " |");
			System.out.println("----------");
		}
	}
	
	public void printHorzArray() {
		System.out.println("----------------------------------------------------------------------------------------------------");
		for (int i= 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------");
		for (int i= 0; i < arraySize; i++) {
			System.out.print("| " +theArrays[i] + " |");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	//Get value by index from an Array
	public int getValueByIndex(int index) {
		if(index < arraySize) {
			return theArrays[index];
		}
		return 0;
		
	}
	
	public boolean doesArrayContainsThisValue(int searchValue) {
		boolean valueInArray = false;
		
		for(int i=0; i < arraySize; i++) {
			if(theArrays[i] == searchValue) {
				return true;
			}
		}
		
		return valueInArray;
	}
	
	public void deleteIndex(int index) {
		if(index < arraySize) {
			for(int i = index; i < arraySize-1; i++) {
				theArrays[i] = theArrays[i+1];
			}
			arraySize--;
		}
	}
	
	public void insertValue(int value) {
		if(arraySize < 50) {
			theArrays[arraySize] = value;
			arraySize++;
		}
	}
	
	/*
	 * O(N)
	 */
	public void linearSearchAlgo(int value) {
		String index = "";
		for(int i=0; i < arraySize; i++) {
			if(theArrays[i] == value) {
				System.out.println("Index at: " + i + ". The Value is: " + value);
				index += i;
			}
		}
		
	}

	/*
	 * O(N^2)
	 */
	public void bubbleSort() {
		for(int i  = arraySize-1; i > 1; i--) {
			for(int j=0; j < i; j++ ) {
				if(theArrays[j] > theArrays[j+1]) {
					swap(j, j+1);
				}
			}
		}
	}
	
	/*
	 * O(log N)
	 */
	public void binarySearch(int value) {
		int lowIndex = 0;
		int highIndex = arraySize -1;
		while(lowIndex <= highIndex) {
			int middleIndex = (highIndex + lowIndex)/2;
			if (theArrays[middleIndex] > value) {
				highIndex = middleIndex - 1;
			}else if(theArrays[middleIndex] < value) {
				lowIndex = middleIndex + 1;
			}else {
				System.out.println("Found the match : " + theArrays[middleIndex] + " is equal value " + value + " at index " + middleIndex);
				break;
			}
			System.out.println(lowIndex + " -> " + highIndex + " = " + middleIndex);
		}
	}
	
	public void selectionSort() {
		for(int i=0; i <arraySize; i++) {
			int minimum = i;
			for(int y=minimum; y<arraySize; y++) {
				if(theArrays[minimum]>theArrays[y]) {
					minimum = y;
				}
			}
			swap(i, minimum);
			printHorzArray();
		}
	}
	
	
	
	
	public void swap(int onePosition, int twoPosition) {
		int temp = theArrays[onePosition];
		theArrays[onePosition] = theArrays[twoPosition];
		theArrays[twoPosition] = temp;
	}
	
	public static void main(String[] args) {
		
		ArrayStructures a = new ArrayStructures();
		a.randomArrayGenerator();
		a.printHorzArray();
//		a.printHorzArray();
//		System.out.println(a.getValueByIndex(5));
//		System.out.println(a.doesArrayContainsThisValue(12));
//		a.deleteIndex(4);
//		a.printHorzArray();
//		a.insertValue(40);
//		a.printHorzArray();
//		a.linearSearchAlgo(14);
		a.selectionSort();
//		a.bubbleSort();
//		a.printHorzArray();
//		a.binarySearch(16);
		int aaa[] = {2,4,6,1,32,234,3,21,14};
		a.insertionSort(aaa);
		System.out.println(Arrays.toString(aaa));
		a.arrayToTree(aaa);
		
	}
	
	public void arrayToTree(int arr[]) {
		Stack<Integer> stc = new Stack();
		int i=0;
		while (i < arr.length) {
			if(stc.isEmpty() || arr[i] < stc.peek()) {
				stc.push(arr[i]);
				i++;
			}else {
				System.out.println(stc.pop());
			}
		}
		
		while(!stc.isEmpty()) {
			System.out.println(stc.pop());
		}
	}
	
	public void insertionSort(int arr[]) {
		int i = arr.length;
		for(int j = 1; j < i; j++) {
			int key = arr[j];
			int y = j-1;
			while(y >=0 && arr[y] > key) {
				arr[y+1] = arr[y];
				y = y-1;
			}
			arr[y+1] = key;
		}
	}
}

	
