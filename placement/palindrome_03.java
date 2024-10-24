package placement;
import java.util.*;

public class palindrome_03 {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int num=n;
        int rev=0;
        while(n !=0){
            int rem=n%0;
            rev=(rev*10)+rem;
            n=n/10;        
        }
    if(rev==num){
        System.out.println("palindrome");
    }else
    {
        System.out.println("not a palindrome");
    }
}
}
