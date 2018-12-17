
class GInterface<X,Y> {
    	 private X first;
    	 private Y second;
    	 public GInterface(X a1,Y a2)
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
		GInterface<String,Integer> obj1=new GInterface<String,Integer>("String1",12);
		System.out.println(obj1.getSecond());
		System.out.println(obj1.getFirst());
		
	}

}
