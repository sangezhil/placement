package placement;
import java.util.Scanner;

public class TrailingZerosInFactorial {

    public static int countTrailingZeros(int num) {
        int zeros = 0;

    
        while (num >= 5) {
            num /= 5;
            zeros += num;
        }

        return zeros;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();


        System.out.println("Trailing zeros in factorial: " + countTrailingZeros(num));

        scanner.close();
    }
}