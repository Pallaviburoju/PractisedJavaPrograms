package basic;

import java.util.Scanner;

public class Anagrams {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		Anagrams anagrams = new Anagrams();
		if(anagrams.result(a, b)) {
			System.out.println("Anagrams");
		}else
		System.out.println("Not Anagrams");
		
//		if(s1.equalsIgnoreCase(s2)) {
//			System.out.println("Anagrams");
//		}else {
//			System.out.println("Not Anagrams");
//		}
//		int count=1;
//		
//		if(s1.length() == s2.length()) {
//			for(int i=0; i< s1.length(); i++) {
//				for(int j=i+1; j< s1.length();j++) {
//					if(s1.charAt(i) == s1.charAt(j)) {
//						count++;
//					}
//					if(count== s1.length()) {
//						break;
//					}
//				}
//				if(count== s1.length()) {
//					break;
//				}
//				if(count>0) {
//					System.out.println(s1.charAt(i)+" "+ count);
//				}
//				
//			}
//		}
//		else {
//		System.out.println("Not Anagrams");
//	}
	}
	public boolean result(String a, String b) {
//		int x[] = new int[26];
//		System.out.println("This post increments value at 10th index "+ x[10]++);
//		System.out.println("Now when we print this we get incremented value"+x[10]);
		if(a.length() != b.length()) return false;
        int c[] = new int[26], d[] = new int[26] ;
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i=0; i<a.length(); i++){
        	//incrementing the array value at particular index
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for(int i =0;i<26; i++)
            if(c[i] != d[i] ) return false;
        return true;
		
	}
}
