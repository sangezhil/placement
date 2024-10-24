package placement;
import java.util.*;

public class zero {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);

        int num = sc.nextInt();
        int zeros = 0;

        while(num>=5) 
        {
          
            num = num/5;

            zeros = zeros+num;

            System.out.println("Trailing zeros in factorial: " +num);


        }
    }
}
