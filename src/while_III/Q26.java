package while_III;

public class Q26 {

	public static void main(String[] args) {
		int n= 42065;
		eachDigitFactorial(n);

	}
	
	public static void eachDigitFactorial(int n) {
		int sum =0;
		while(n>0) {
		int rem = n%10;
		int fact = 1;
		int i = 1;
			while(i <= rem) {
			
			 fact = fact*i;
			i++;
		}
		 sum= sum +fact;
			
			n/=10;
		}	System.out.print("factorial is "+sum);
			
	}

}
