//DownCasting
class Super
{	
	void Sample()
	{
		System.out.println("Method of Super class");
	}
}
public class Downcasting_Sub extends Super
{
	void Sample()
	{
		System.out.println("Method of Sub class");
	}
	public static void main(String srgs[])
	{
		Super obj=new Downcasting_Sub();
		Downcasting_Sub ds=(Downcasting_Sub)obj;
		ds.Sample();
	}
}
		