package while_III;
import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nums = sc.nextInt();

        System.out.println(increasOrder(nums));
    }

    public static boolean increasOrder(int n) {
        int prevDigit = n % 10;
        n /= 10;

        while (n > 0) {
            int currentDigit = n % 10;

            if (currentDigit >= prevDigit) {
                return false;
            }

            prevDigit = currentDigit;
            n /= 10;
        }

        return true;
    }
}
