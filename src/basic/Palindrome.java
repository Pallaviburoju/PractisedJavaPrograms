package basic;

import java.util.Scanner;

public class Palindrome {
	
	public void meth(String s) {
		int count=0;
		int a=0;
		int b= s.length()-1;
		for(int i=0; i<s.length()/2; i++) {
			
			if(s.charAt(a) == s.charAt(b)) {
				count++;
				a++;
				b--;
			}
			else
				break;
		}
		if(count==s.length()/2) {
			
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
	

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Palindrome palindrome = new Palindrome();
		palindrome.meth(sc.next());
		sc.close();
	}
}
