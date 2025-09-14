package while_III;

public class Q6 {

	public static int printDiffrence(int n) {
		int big = n%10;
		int small = n%10;
		
		while(n > 0) {
			int digit = n%10;
			if(digit > big) {
				big = digit;
			}
			else if(digit < small) {
				small = digit;
				
			}
			n = n/10;
		}return big - small;
	}
	public static void main(String[] args) {
	
		System.out.println(printDiffrence(43705));

	}
}
