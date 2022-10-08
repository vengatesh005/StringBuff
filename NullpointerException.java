package Stringbuffer;

import java.util.Scanner;

public class NullpointerException {

	public static void main(String[] args) {
		try {
			
			String a=null;
			System.out.println(a.charAt(0));
			
		}
		catch(NullPointerException e){
			System.out.println("null pointer exception not found");
			
		}
		catch(Exception e){
			System.out.println("null  found");
			
		}

	}

}
