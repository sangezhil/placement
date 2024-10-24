package placement;
import java.io.*;
import java.util.*;

public class max{
	
	public static void main(String args[])
	{
		int arr[]= {10,20,30,15};
		int max = 0;
		for(int i=0 ; i<arr.length	; i++)
		{
			if(arr[i] >max)
			{
				max = arr[i];
			}
		}
		System.out.println("max number:"+max);
	}
}