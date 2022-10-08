package Stringbuffer;

public class Staticpro {

	public static void main(String[] args) {
;		Staticpro st=new Staticpro();
                 st.add(2,3);
                 st.add(2,3,4);
		
		
	   }
	
		
	
	  static void add(int a,int b)
	{
		//int a=9;
		//int b=7;
		int c=a+b;
		System.out.println(c);
	
	   
	}
	   static void add(int a,int b,int c)
	   {
		   c=a+b+c;
		   System.out.println(c);
		   
	   }
}
