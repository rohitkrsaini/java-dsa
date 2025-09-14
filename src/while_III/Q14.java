package while_III;

public class Q14 {

	public static void main(String[] args) {
		sumOfEach(4207065);

	}
	
	public static void sumOfEach(int n) {
		int num =n;
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			sum = sum + digit;
			n/=10;
		}
		System.out.print(num + " sum of each digit = " + sum);
	}

}
