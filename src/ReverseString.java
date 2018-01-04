
public class ReverseString {

	public static void main(String[] arg) {
		String a = "Iamgreatandwonderful";
		byte[] b = a.getBytes();
		byte[] c = new byte[b.length];
		for(int i=0; i< b.length; i++) {
			c[i] = b[b.length-i-1];
		}
		System.out.println(new String(c) + " " + new String(b));
	}
}
