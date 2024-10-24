package placement;
import java.util.*;

public class fibonaci {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i=0;
        int j=1;
        System.out.println("fibonaci series");
        for(i=0;i<n;i++){
                int temp=i+j;
                System.out.println(" "+temp);
                i=j;
                j=temp;
                
            }
            
        }
    }
    
}
