
public class FibonacciSeries {

	
	public static void main(String[] ar) {
		int n1=0, n2= 1, n3=0;
		for(int i=2; i < 1; ++i) {
			n3 = n1+n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
		int i = 3423;
		int sum = 0;
		int r;
		while(i>0) {
			r = i%10;
			sum = (sum*10) + r ;
			i= i/10;
		}
		System.out.println(sum);
	}
}
