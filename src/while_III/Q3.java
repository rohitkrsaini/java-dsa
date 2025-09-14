package while_III;

public class Q3 {


	public static void printOddDigit(int n) {
		while(n>0){
			int digit = n%10;
			if(digit%2!=0) {
				System.out.println(digit);
			}
			n = n/10;
		}
	}
	public static void main(String[] args) {
		printOddDigit(43705);

	}
}
