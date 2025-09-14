package while_III;

public class Q17 {


	public static void main(String[] args) {
		sumOfLess5(42765);

	}
	
	public static void sumOfLess5(int n) {
		int num = n;
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			if(digit<=5) {
				sum = sum + digit;
			}n/=10;
		}System.out.print(num + " sum of less then 5 : " + sum);
	}
}
