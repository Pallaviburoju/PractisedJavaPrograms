package basic;

import java.util.Scanner;

public class PracticeBasic {

//	public static void main(String args[]){  
//		  
//		for(int i=0;i<args.length;i++)  
//		System.out.println(args[i]);  
//		  System.out.println("Hai");
//		}  

	public static void main(String args[])
	{
	    Scanner dis=new Scanner(System.in);
//	    int a,b,c;
//	    String line;
//	    String[] lineVector;
//	System.out.println("enter 3 strings seperated by comma");
//	    line = dis.nextLine(); //read 1,2,3
//	
//	    //separate all values by comma
//	    lineVector = line.split(",");
//	
//	    //parsing the values to Integer
//	    a=Integer.parseInt(lineVector[0]);
//	    b=Integer.parseInt(lineVector[1]);
//	    c=Integer.parseInt(lineVector[2]);
//	
//	    System.out.println("a="+a);
//	    System.out.println("b="+b);
//	    System.out.println("c="+c);
	    
		System.out.println("Enter 3 strings seperated by comma");
		String CSV = dis.next(); 
		String[] values = CSV.split(",");
		System.out.println(values[0]+" "+ values[1]+" "+values[2]);
		
		dis.close();
	}
	
}
