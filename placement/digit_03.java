package placement;
import java.util.*;

public class digit_03 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
