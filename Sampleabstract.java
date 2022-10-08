package Stringbuffer;

public class Sampleabstract {

	public static void main(String[] args) {
		pig sc= new pig();
		     sc.animalsound();
		

	}
}
	abstract class animal{		
		int a=5;
		 int b=4;
		int c=0;
		abstract void animalsound();
		
			void sleep()
			{
				System.out.println("wwww");
			}
		}
	
	class pig extends animal
	{
       void  animalsound()
       {
    	   System.out.println(a+b);
       }
       
       
		
        }
	
	
	
	


