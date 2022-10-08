package Stringbuffer;

import java.util.Scanner;

public class Stringindexofbound {
	void add (){
	try {
 	      //String a[]= "vengat";
		
		System.out.println("enter the value");
		Scanner sc=new Scanner(System.in);
		String[]a= new String[2];
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
			 Stringindexofbound sb=new  Stringindexofbound();
			               sb.add();
		}
	}





