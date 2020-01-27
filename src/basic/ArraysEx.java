package basic;

import java.util.Scanner;

public class ArraysEx
{
	public void meth1() {
		int a[] = new int[3];
 	   Scanner sc= new Scanner(System.in);
 	   for(int i=0; i < a.length; i++) {
 		   
 		   a[i]= sc.nextInt();
 		   
 	   }
 	  
 	   for(int j=0; j<a.length ; j++) {
 		   System.out.println("The element is "+a[j]);
 	   }
 	  sc.close();
	}
	
	public void meth2() {
		
	}
       public static void main(String args[])
       {
    	   ArraysEx obj = new ArraysEx();
    	   obj.meth1();
       }
}

