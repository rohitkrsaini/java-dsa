package while_III;

public class Q5 {
	
	public static void printBigDigit(int n) {
		int big = n%10;
		while(n>0) {
			int digit = n % 10;
				if(digit > big) {
					big = digit;
				}
			
			n = n/10;
		}
		System.out.println(big);
	}
	public static void main(String[] args) {
		printBigDigit(43705);

	}

}
