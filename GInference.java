
public class GInference<X,Y> {
	 private X first;
	 private Y second;
	 public GInference(X a1,Y a2)
	 {
		 first=a1;
		 second=a2;
	 }
	 	
	 public X getFirst()
	 {
		 return first;
	 }
	 public Y getSecond()
	 {
		 return second;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GInference<String,Integer> obj1=new GInference<String,Integer>("Test",1);
		System.out.println("String is"+obj1.getFirst());
		System.out.println("Integer is"+obj1.getSecond());
		
	GInference<Integer,String> obj2=new GInference<Integer,String>(22,"Next");
		System.out.println("String is"+obj2.getFirst());
		System.out.println("Integer is"+obj2.getSecond());
		
		
		
	}

}
