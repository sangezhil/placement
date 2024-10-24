package placement;
import java.io.*;
import java.util.*;

public class prime_03 {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int number;
        number=sc.nextInt();
        for(int i=2;i<number;i++){
            int count=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                System.out.println(i+" ");
            }
        }
        
    }
    
}
