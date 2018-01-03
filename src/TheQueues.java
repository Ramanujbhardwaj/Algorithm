import java.util.Arrays;

public class TheQueues {

	private String[] theQueues;
	private int sizeOfQueue;

	private int front, rear, numberOfItem = 0;

	public TheQueues(int size) {
		sizeOfQueue = size;
		theQueues = new String[size];
		Arrays.fill(theQueues, "-1");

	}

	public void insert(String input) {
		if (numberOfItem + 1 <= sizeOfQueue) {
			theQueues[rear] = input;
			rear++;
			numberOfItem++;
			System.out.println("INSERT " + input + " Was Added to the Stack\n");
		} else {
			System.out.println("Sorry But the Queue is Full");
		}
	}

	public void remove() {
		if (numberOfItem > 0) {
			System.out.println("REMOVE " + theQueues[front] + " Was Removed From the Queue\n");
			theQueues[front] = "-1";
			front++;
			numberOfItem--;
		} else {
			System.out.println("Sorry But the Queue is Empty");
		}
	}
	
	public void priorityQueue(String input) {
		int i;
		if(numberOfItem == 0) {
			insert(input);
		}else {
			for(i = numberOfItem-1; i >=0; i--) {
				if(Integer.parseInt(input) > Integer.parseInt(theQueues[i])) {
					theQueues[i+1] = theQueues[i];
				}else {
					break;
				}
				
			}
			
			theQueues[i+1] = input;
			rear++;
			numberOfItem++;
		}
	}

	public void peek() {

		System.out.println("The First Element is " + theQueues[front]);

	}

	public void displayTheQueue() {

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < sizeOfQueue; n++) {

			System.out.format("| %2s " + " ", n);

		}

		System.out.println("|");

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < sizeOfQueue; n++) {

			if (theQueues[n].equals("-1"))
				System.out.print("|     ");

			else
				System.out.print(String.format("| %2s " + " ", theQueues[n]));

		}

		System.out.println("|");

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		// Number of spaces to put before the F

		int spacesBeforeFront = 3 * (2 * (front + 1) - 1);

		for (int k = 1; k < spacesBeforeFront; k++)
			System.out.print(" ");

		System.out.print("F");

		// Number of spaces to put before the R

		int spacesBeforeRear = (2 * (3 * rear) - 1) - (spacesBeforeFront);

		for (int l = 0; l < spacesBeforeRear; l++)
			System.out.print(" ");

		System.out.print("R");

		System.out.println("\n");

	}
	
	
public static void main(String[] args){
		
	TheQueues theQueue = new TheQueues(10);
		
		theQueue.priorityQueue("16");
		
		theQueue.priorityQueue("25");
		
		theQueue.priorityQueue("10");
		
		theQueue.priorityQueue("13");
		
		theQueue.priorityQueue("99");
		
		theQueue.priorityQueue("63");
		
		theQueue.priorityQueue("1");
		
		theQueue.priorityQueue("52");
		

//		theQueue.insert("10");
//		
//		theQueue.displayTheQueue();
//		
//		theQueue.insert("15");
//		
//		theQueue.displayTheQueue();
//		
//		theQueue.insert("25");
//		
//		theQueue.displayTheQueue();
//		
//		theQueue.insert("25");
//		
//		theQueue.displayTheQueue();
//		
//		theQueue.insert("25");
//		
//		theQueue.displayTheQueue();
//		
//		theQueue.remove();
//		
//		theQueue.displayTheQueue();
//		
//		theQueue.remove();
//		
		theQueue.displayTheQueue();
		
//		theQueue.peek();
		
	}
}
