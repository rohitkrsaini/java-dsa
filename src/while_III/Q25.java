package while_III;

public class Q25 {

	public static void main(String[] args) {
		int n= 42065;
		eachDigitFactorial(n);

	}
	
	public static void eachDigitFactorial(int n) {
		while(n>0) {
		int rem = n%10;
		int fact = 1;
		int i = 1;
			while(i <= rem) {
			
			 fact = fact*i;
			i++;
		}
		
			System.out.println(rem +"! is = " + fact);
			n/=10;
		}	
	}

}
