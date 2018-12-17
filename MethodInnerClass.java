class Sss
{
	void display()
	{
	System.out.println("Normal Method");
	class Bbb
	{
		int x=20;
		void display()
		{
		System.out.println("Method Local:"+x);
		}
	}
	Bbb b1=new Bbb();
	b1.display();
	}
}
public class MethodInnerCLass
{
	public static void main(String args[])	
	{
	Sss s1=new Sss();
	s1.display();
	}
}

		
	