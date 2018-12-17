class Fruit
{
	int x=10;
	void display()
	{	
		System.out.println("Normal class :"+x);
	}
	class Apple
	{
		int x=20;
		void display()
		{
	
			System.out.println("Regular Inner clas:"+x);
			System.out.println("From Outer class:"+Fruit.this.x);
		}
	}
}
	public class InnerClass
	{
		public static void main(String args[])
		{
		Fruit ob1=new Fruit();
		ob1.display();
		Fruit.Apple ob2=ob1.new Apple();
		ob2.display();
		}
	}
