package basic;

import java.util.Scanner;

public class multiples {
	 public static void main(String args[]) {
//		 int count[]= new int[3];
//		 int resultMultiplied=1;
//		 Scanner sc = new Scanner(System.in);
//		 
//		 for(int i=0; i<3;i++) {
//			 count[i]= sc.nextInt();
//		 }
//		 
//		 for(int i=0; i<3;i++) {
//			 resultMultiplied = resultMultiplied*count[i];
//			 System.out.println(resultMultiplied);
//			 
//		 }
		 
		 int constantRate;
		 int initialEnergy;
		 int noOfIterations;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 initialEnergy = sc.nextInt();
		 constantRate = sc.nextInt();
		 noOfIterations = sc.nextInt();
		 
		 for(int i=0; i< noOfIterations;i++) {
			 System.out.println(initialEnergy);
			 initialEnergy = initialEnergy * constantRate;
		 }
	 }
}
