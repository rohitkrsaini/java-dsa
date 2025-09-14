package while_III;
import java.util.Scanner;
public class Q8_2part {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		printLeftTORighit(n);

	}
	
	public static void printLeftTORighit(int n) {
		
		int digit = (n+"").length();
		while(digit>0) {
			System.out.println(n/(int)Math.pow(10, --digit)%10);
		}
	}

}
