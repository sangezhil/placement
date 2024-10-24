package placement;

import java.io.*;
import java.util.*;

public class fact {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int number;
        int factioral=1;
        number = sc.nextInt();
        for (int i=number; i>0; i--) {
            factioral = factioral*i;

        }
        System.out.println("fact " + factioral);
    }
}
