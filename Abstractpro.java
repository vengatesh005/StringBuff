package Stringbuffer;

public abstract class Abstractpro {
	public static void main(String[] args) {
	
	}

}
class addnum{
void add()
{
int n=10;
int  sum=0;
 for(int i=1;i<=n;i++)
  {
  sum=sum+i;  
 
  }
     System.out.println(sum);
}
} 
class addnum1 extends addnum{
void mul()
{
int n=6;
int  sum=1;
 for(int i=1;i<=n;i++)
  {
  sum=sum*i;  
 
  }
     System.out.println(sum);
 }
}

class addnum2 extends addnum1{
void mod()
{
int n=6;
 for(int i=1;i<=n;i++)
  {
  if(n%i==0)
   {
   System.out.println(i);
   
   } 
  }
 }
} 

