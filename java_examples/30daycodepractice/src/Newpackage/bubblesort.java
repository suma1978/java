package Newpackage;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bubblesort {


public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    int temp=0;
    int noofswaps = 0;
    for(int a_i=0; a_i < n; a_i++){
        a[a_i] = in.nextInt();
    }
    
    for(int i=0;i<a.length;i++)
    {
    	  //noofswaps=0;
    	for(int j=0;j<a.length-1;j++)
    	{
    		if( a[j]>a[j+1])
    		{
    			temp=a[j];
    			a[j]=a[j+1];
    			a[j+1]=temp;
    			noofswaps++;
    		}
    	}
    	if(noofswaps==0)
    	{
    		break;
    	}
    	
    }
    
    System.out.println("Array is sorted in " + noofswaps +" swaps.");
    System.out.println("First Element: "+a[0]);
    System.out.println("Last Element: "+a[a.length-1]);
    
}
}