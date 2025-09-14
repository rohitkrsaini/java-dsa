package while_III;
import java.util.Scanner;

public class Q7 {

	public static int countDigit(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n/=10;
		}return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		int scan =sc.nextInt();
		System.out.println(countDigit(scan));

	}

}
