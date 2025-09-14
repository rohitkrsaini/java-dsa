package while_III;

public class Q11 {


	public static void main(String[] args) {
		evanDigit(4345987);
	}

	public static void evanDigit(int n) {
		int num = n;
		int digit= 0;
		while(n>0) {
		if(n%2==0) {
			digit++;
		}
		n/=10;
	}
		System.out.println( num+ " even digit is : "+digit);
}

}
