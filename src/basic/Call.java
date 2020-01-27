package basic;

import java.io.IOException;

public class Call {

	int age=10;
	
	int meth() throws IOException{
		throw new IOException("Device Error");
	}
	
	void meth2() {
		
		
		try {
			if(age>5) {
				throw new ArithmeticException("Less Age");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception handled");
		}
	}
	
	void meth3() throws CustomException {
		throw new CustomException("Custom exception thrown for age = "+ age);
	}
	
	public static void main(String args[]) throws CustomException{
		Call call = new Call();
		try {
		call.meth();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error handled");
		}
		call.meth2();
		//call.meth3();
		
		String s1= "pallavi";
		String s2= "queen";
		
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		if(c1<c2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		String s1U = s1.toUpperCase();
		s1 = s1.replace(s1.charAt(0), s1U.charAt(0));
		System.out.println(s1);
		s1 = s1.substring(1, 5);
		System.out.println(s1);
		////////////////////////////////////////////////////////////////////
		String s = "lavanyakumari";
		
		int j=3;//If j=3, then no of iteration in the string are "stringlength-(j-1)"
		String temp1[] = new String[s.length()-(j-1)];
		for(int i=0;i< (s.length()-(j-1)); i++){
			
				temp1[i]=s.substring(i, i+j);
								
		}
		System.out.println("Not in lexographical order");
		for(int i = 0; i < (s.length()-(j-1)); i++) {
            System.out.println(temp1[i]);
        }
		
		for(int i=0; i< (s.length()-(j-1));i++) {
			
			for (int k = i + 1; k < (s.length()-j) ; k++) {
                if (temp1[i].compareTo(temp1[k]) > 0) {
                    // swap words[i] with words[j[
                    String temp = temp1[i];
                    temp1[i] = temp1[k];
                    temp1[k] = temp;
                }
            }

		}
		System.out.println("In lexicographical order:");
        for(int i = 0; i < (s.length()-(j-1)); i++) {
            System.out.println(temp1[i]);
        }
        System.out.println("Smallest and largest substrings of lexographical order");
        System.out.println(temp1[0]);
        
        System.out.println(temp1[(s.length()-(j))]); 
		
	}
}
