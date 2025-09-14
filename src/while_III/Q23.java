package while_III;

public class Q23 {
	
	 public static void main(String[] args) {
	        int num = 980376;
	        System.out.println(addDigits(num)); // Output: 3
	    }

	    public static int addDigits(int num) {
	        while (num >= 10) {
	            int sum = 0;
	            while (num > 0) {
	                sum += num % 10; // Add last digit
	                num /= 10;       // Remove last digit
	            }
	            num = sum;
	        }
	        return num;
	        
	    }
}


