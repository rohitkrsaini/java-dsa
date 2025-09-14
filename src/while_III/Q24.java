package while_III;

public class Q24 {
	public static void main(String[] args) {
		System.out.print(countDigits(1248));
	}
	
	public static int countDigits(int num) {
        int count = 0;
        int origanal = num;

        while(num > 0){
            int digit = num%10;
            if(digit !=0 && origanal % digit ==0){
                count++;
            }
            num/=10;
        }return count;
    }
}
