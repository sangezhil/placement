package placement;
import java.util.*;

public class armstrong_03 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int len=0;
        int n=num;
        int nn=num;
        while(n!=0){
            len++;
            n=n/10;
        }
        int rem=0,ans=0;
        while(nn!=0){
            rem=nn%10;
            ans =(int)(ans+Math.pow(rem,len));
            nn=nn/10;
        }
        if(num==ans){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not a armstrong number");
        }
    }
    
}
