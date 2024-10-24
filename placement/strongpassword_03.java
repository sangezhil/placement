package placement;
import java.util.*;

public class strongpassword_03 {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String inp=input;
        int n=0;
        for(char i:input.toCharArray())
        {
            n++;
        }
        int lc=0,uc=0,dg=0,sp=0;
        for(char i:input.toCharArray()){
            if(Character.isLowerCase(i))
            lc=1;
            else if(Character.isUpperCase(i))
            uc=1;
            else if(Character.isDigit(i))
            dg=1;
            else
            sp=1;
        }
        if(lc==1 && uc==1 && dg==1 && sp==1 && n>=8){
            System.out.println("strong password");
        }
        else{
            System.out.println("not a strong password");
        }
    }
    
}
