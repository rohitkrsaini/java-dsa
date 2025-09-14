package while_III;

public class Q8 {

	public static void main(String[] args) {
		int n = 43705;
		leftToRight(n);

	}
	
	public static void leftToRight(int n) {
		int num = n;
		int digitCount = getCount(n);
		int pow = getPower(10,digitCount-1);
		
		while(pow>0) {
			int digit = (n/pow)%10;  // digit = (n/10^digit-1)%10;
			System.out.println(digit);
			pow/=10;
		}
	}

	
	public static int getCount(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}return count;
	}
	
	public static int getPower(int a,int b) {
		int power = 1;
		int i = 0;
		while(i<b) {
			power = power*a;
			i++;
		}return power;
	}
}
