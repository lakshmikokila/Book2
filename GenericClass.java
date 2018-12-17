
class Student<T>
{	
	void display(T a)
	{
		System.out.println("This is generic class "+a);
	}
	
	
}


public class GC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student<Integer> s1=new Student<>();
		s1.display(44);
		Student<String> s2=new Student<>();
		s2.display("Kokila");
		Student<Float> s3=new Student<>();
		s3.display(123.34f);
		
	}

}
