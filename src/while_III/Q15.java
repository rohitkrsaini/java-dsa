package while_III;

public class Q15 {

	public static void main(String[] args) {
		sumOfEvan(4207065);

	}
	
	public static void sumOfEvan(int n) {
		int num =n;
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			if(n%2==0) {
			sum = sum + digit;
			}
			n/=10;
		}
		System.out.print(num + " sum of evan digit = " + sum);
	}
}
