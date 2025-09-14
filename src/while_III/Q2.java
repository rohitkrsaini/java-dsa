package while_III;

public class Q2 {
	public static void printEvanDigit(int n) {
		while(n>0){
			int digit=n%10;
			if(digit%2==0){
			System.out.println(digit);
			}
			 n= n/10;
		}
	}
	
	
	public static void main(String[] args) {
		printEvanDigit(43705);

	}
}
