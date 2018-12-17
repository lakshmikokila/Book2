class Super
{
	void sample()
	{
	System.out.println("Method of Super class");
	}
}
public class Upcasting_Sub extends Super
{	
	void sample()
	{
	System.out.println("Method of Sub class");
	}
	public static void main(String args[])
	{
	Super obj=(Super)new Upcasting_Sub();	
	obj.sample();
	}
}