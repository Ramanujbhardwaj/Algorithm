import java.util.Arrays;

public class TheStack {
	
	private String[] stackArrays;
	
	private int sizeOfStack;
	
	private int topOfTheStack = -1;
	
	TheStack(int size){
		sizeOfStack = size;
		stackArrays = new String[size];
		Arrays.fill(stackArrays, "-1");
	}
	
	public void push(String input) {
		if(topOfTheStack+1 < sizeOfStack) {
			topOfTheStack++;
			stackArrays[topOfTheStack] = input;
		}else {
			System.out.println("Sorry the Stack is not empty");
		}
		displayTheStack();
		System.out.println("Push the value in the stack");
		
	}
	
	public String pop() {
		if(topOfTheStack >= 0) {
			displayTheStack();
			System.out.println("Poping the item from the Stack");
			stackArrays[topOfTheStack] = "-1";
			return stackArrays[topOfTheStack--];
		}else {
			displayTheStack();
			System.out.println("Sorry But the Stack is Empty");
			return "-1";
		}
	}

	public String peek() {
		if(topOfTheStack >= 0) {
			displayTheStack();
			System.out.println("Peeking the item in the Stack");
			return stackArrays[topOfTheStack];
		}else {
			displayTheStack();
			System.out.println("Sorry But the Stack is Empty");
			return "-1";
		}
	}
	
	public void displayTheStack() {

		for (int n = 0; n < 61; n++)
			System.out.print("-");
		System.out.println();
		for (int n = 0; n < sizeOfStack; n++) {
			System.out.format("| %2s " + " ", n);
		}
		System.out.println("|");
		for (int n = 0; n < 61; n++)
			System.out.print("-");
		System.out.println();
		for (int n = 0; n < sizeOfStack; n++) {
			if (stackArrays[n].equals("-1"))
				System.out.print("|     ");
			else
				System.out.print(String.format("| %2s " + " ", stackArrays[n]));
		}
		System.out.println("|");
		for (int n = 0; n < 61; n++)
			System.out.print("-");
		System.out.println();
	}
	
	public void pushMany(String multipleValue) {
		String[] tempValue = multipleValue.split(" ");
		for(int i=0; i<tempValue.length; i++) {
			push(tempValue[i]);
		}
	}
	
	public void popAll() {
		for(int i=topOfTheStack; i >= 0; i--) {
			pop();
		}
	}

	public static void main(String[] args) {
		
		TheStack s = new TheStack(13);
		s.displayTheStack();
		
		
		s.push("Ramanuj");
		s.push("First Name");
		s.push("Bhardwaj");
		s.push("Last Name");
		s.pushMany("Name Ramanuj Bhardwaj");
		s.displayTheStack();
		
		s.popAll();
		s.displayTheStack();
	}
}
