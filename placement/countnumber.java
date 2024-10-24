package placement;
import java.util.Scanner;
public class countnumber 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int count=0;
        System.out.println("enter the number to count:");
        int search=sc.nextInt();

        while(num!=0)
        {
            int rem=num%10;
            if(search==rem){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
    
}
