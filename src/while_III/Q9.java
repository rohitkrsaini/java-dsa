package while_III;

public class Q9 {

	public static void main(String[] args) {
		System.out.print(zeroCount(430700205));
	}

	public static int zeroCount(int n) {
		int count= 0;
		while(n>0) {
		if(n%10==0) {
			count++;
		}
		n/=10;
	}return count;
}
}
