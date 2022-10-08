package Stringbuffer;
import java.util.Scanner;

import java.util.InputMismatchException;

public class Exceptionhandlin {

	public static void main(String[] args) {
		
		Exceptionhandlin Eh=new Exceptionhandlin();
		               Eh.add(2, 4);
		                Eh.sub(8, 4);
		                Eh. div(6, 0);
		               	
	}
	
	 void  add(int a,int b)
	 {
		 System.out.println("addtion value"+(a+b));
	 }
	 
   void  sub(int a,int b)
   {
	   System.out.println("subraction value"+(a-b)); 
   }
   void  div(int a,int b) 
   {
	   try {   
	 
	   System.out.println("enter value");
		 Scanner sc=new Scanner(System.in);
	          a=sc.nextInt();
	          b=sc.nextInt();
	          System.out.println("divide value"+(a+b));
	   
	   }
	   
	   catch(ArithmeticException e) {
		
		   System.out.println("divide wont word");
		   
	   }
	   catch(NullPointerException e) {
		   System.out.println("the caught space");
		   
	   }
	  catch(InputMismatchException e) {
	   System.out.println("the mixing words");
		   
	   }
	    catch(Exception e) {
		   System.out.println("the find value");
		   
	   }
	   
   }
   
  }

   
