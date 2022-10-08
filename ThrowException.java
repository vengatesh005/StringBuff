package Stringbuffer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException {
	void getclass(int a)throws ArithmeticException,NegativeNumberException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age<0)
		{
			//throw new ArithmeticException ("enter greater then 0");
		    throw new NegativeNumberException("dont enter negative number");
		}
		else
		{
			System.out.println("correct age");
		}
	}
	

	public static void main(String[] args) {
		ThrowException eh=new ThrowException();
		    try {
		    eh.getclass(0);
		    }
//		   catch(ArithmeticException e){
//		    System.out.println(e.getMessage());
//		    }
		    catch( InputMismatchException e){
			    System.out.println(e.getMessage());
			    System.out.println("mixing words");
		    }
		    catch(NegativeNumberException e)
		    {
		    	System.out.println(e.getMessage());
		    }
		   
			    catch(Exception e){
				    System.out.println(e.getMessage());
				    System.out.println("last option");
				    }
	}

}
