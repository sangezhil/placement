package placement;
import java.util.*;

public class average 
{
    public static void main(String[] args) 
    {
        int n;float res=0;
        System.out.println("Enter the number:");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter number "+n);
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        res=res+a[i];
        System.out.println("average="+res/n);
    }
}
