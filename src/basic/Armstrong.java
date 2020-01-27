package basic;

import java.util.Scanner;

public class Armstrong {

	public void meth() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp= number;
		int sum=0, Rem;
		while(number > 0) {
			Rem= number%10;
			number=number/10;
			sum = sum + (Rem*Rem*Rem);
		}
		
		if (temp==sum) {
			System.out.println("the number is Armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong armstrong = new Armstrong();
		armstrong.meth();
	}

}
