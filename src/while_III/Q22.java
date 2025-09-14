package while_III;
import java.util.Scanner;
public class Q22 {
	
	public static void main() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("enter a number");
		int n = sc.nextInt();
		System.out.print(adjacentDigits(n));
	}

	public static boolean adjacentDigits(int n) {
		int lastDigit = n%10;
		n/=10;
		
		while(n>0) {
			int currDigit = n%10;
			if(lastDigit == currDigit) {
				return false;
			}
			n/=10;
		}return true;
	}
}
