class Mobile
{
	static class Apple
	{
		int x=20;
		void display()
		{
		System.out.println("static nested class:"+x);
		}
	}
}
public class InnerClassStatic
{
	public static void main(String args[])
	{
	Mobile.Apple ob2=new Mobile.Apple();
	ob2.display();
	}
}
