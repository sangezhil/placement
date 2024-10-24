package placement;
import java.io.*;
import java.util.*;
public class date 
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the date");
        int a=sc.nextInt();
        System.out.println("enter the month:");
        int b=sc.nextInt();
        System.out.println("enter the year:");
        int c=sc.nextInt();
        if((a>=1 && a<=31 )&& (b>=1 && b<=12) &&(c>=1999&&c<=9999)){
            System.out.println("vaild date");
        }
        else{
            System.out.println("invaild date");
        }

    }
}
