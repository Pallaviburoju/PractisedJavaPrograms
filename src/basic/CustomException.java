package basic;

public class CustomException extends Exception{
	
	public CustomException(String msg) {
		System.err.println(msg);

	}
}
