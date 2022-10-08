package Stringbuffer;

public class Sampleinterface {

	public static void main(String[] args) {
		workers sc=new workers ();
		        sc.maximum(6,60);
		        sc.officetime();
		        
		        
		

	}

}

interface human
{
	public void maximum(int hieght,int weight);
}
abstract class company
{
	abstract void officetime();
}
class workers extends company implements human
{
	 void officetime()

  {
	System.out.println("morning 11 clock");
  }
	 public void maximum(int hieght,int weight)
{
	System.out.println("human"+hieght +"\n"+"Human"+ weight);
 }
}