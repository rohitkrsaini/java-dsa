package while_III;

public class Q4 {


	public static void printGreter5(int n){ 
		while(n>0) {
			int  digit = n % 10;
			if(digit >= 5) {
				System.out.println(digit);
			}
			n=n/10;
		}
	}
	public static void main(String[] args) {
		printGreter5(43705);

	}

}
