package while_III;

public class Q1 {
	
	public static void printEachDigit(int n) {
		while(n>0) {
			int lastDigit = n%10;
			System.out.println(lastDigit);
			n=n/10;
		}
	}

	public static void main(String[] args) {
		printEachDigit(43705);

	}

}


