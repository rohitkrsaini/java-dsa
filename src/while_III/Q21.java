package while_III;
import java.util.Scanner;
public class Q21 {

	public static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println(decrecOrder(n));
	}
	
	public static boolean decrecOrder(int n) {
		int lastValue = n%10;
		n/=10;
		
		while(n>0) {
			int currtValue = n%10;
			if(lastValue <= currtValue) {
				return true;
			}
			lastValue = currtValue;
			n/=2;
		}return false;
		
	}
}
