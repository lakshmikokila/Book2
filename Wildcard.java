public class Wildcard<T>
{
	private T t;
	public void setValue(T t)
	{
		this.t=t;
	}
	public T getValue()
	{
		return t;  
	}
	public boolean compare (Wildcard <? extends Number > wcd) {
		if (t==wcd.t) {
			return true;
		}
		else
		{
			return false;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Wildcard<Integer> obj1=new Wildcard<Integer>();
 obj1.setValue(10);
 Wildcard<String>obj2=new Wildcard<String>();
 obj2.setValue("Test");
 
 System.out.println("Value of first:"+obj1.getValue());
 System.out.println("Value of second:"+obj2.getValue());
 
// System.out.println("Are you equal?"+obj1.compare(obj2));
 
 
 
	}

}
