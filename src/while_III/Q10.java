package while_III;

public class Q10 {

	public static void main(String[] args) {
		count3(437353343663193133l);

	}

	public static void count3(long n) {
		long count = 0;
		while(n>0) {
			if(n%10==3) {
				count++;
			}n/=10;
		}
		System.out.println(count);
	}
}
