package Stringbuffer;

import java.util.Scanner;

public class Arrayindexout {
	void add()
	{

	
		try {
//	 	int a[]= {1,2,3,4};
		
		System.out.println("enter the value");
		Scanner sc=new Scanner(System.in);
		int[]a= new int[4];
		int c=sc.nextInt();
		System.out.println(a[c]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("enter the  four digits number");
		}
		catch(Exception e)
		{
			System.out.println("enter  number");
		}
	}
		public static void main(String[] args) {
			Arrayindexout aa=new Arrayindexout();
			               aa.add();
		}
	}


