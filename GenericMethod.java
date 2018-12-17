
class sample
{
	
	<T>void  dispaly(T a,T b)
	{
		System.out.println(b);
		System.out.println(a);
	}
	
}

public class GM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sample s1=new sample();
		s1.dispaly(12, 45);	
		s1.dispaly(12.34f, 45.34f);
		s1.dispaly("adsfaf", 45);
	}

}
