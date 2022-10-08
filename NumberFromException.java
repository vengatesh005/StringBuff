package Stringbuffer;
import java.util.Scanner;

public class NumberFromException {

	public static void main(String[] args) {
		try {
			System.out.println("enter the value");
			Scanner sc=new Scanner(System.in);
			long n=sc.nextLong();
			
			if(n!=1234567890)
			 {
				System.out.println("if block working");
				throw new NumberFormatException("number format except");
			}
			else {
				System.out.println("correct number");
			}
			
		}
//	     catch(NumberFormatException e) {
//		System.out.println("number format except");
//		}
		catch(Exception e) {
			System.out.println("number format except");
	    }
	}

}
