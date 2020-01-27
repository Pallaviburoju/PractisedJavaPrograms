package basic;

import java.util.Scanner;

public class SpecialCharSplit {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        scan.close();
	        
	       SpecialCharSplit specialCharSplit = new SpecialCharSplit();
	       specialCharSplit.result(s);
	    }

	    public void result(String str){
	    	
	    	  String[] arrOfStr = str.split("[!,_' ?.@]+"); 
	    	  
	     	  System.out.println(arrOfStr.length);
		    	 for (String a : arrOfStr) {
		    		 System.out.println(a);
		    	 }
	    	 
	    }
}
