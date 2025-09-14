package while_III;

public class Q13 {

	public static void main(String[] args) {
		lessThen5(42765);
	}

	public static void lessThen5(int n) {
		int num = n;
		int big= n%10;
		int count = 0;
		while(n>0) {
			int digit=n%10;
		if(digit < big) {
			count++;
		}
		n/=10;
	}
		System.out.println( num+ " 5 less then is : "+count);
}
}
