import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v1=new Vector<String>();
		v1.add("red");
		v1.add("blue");
		v1.add("green");
		System.out.println(v1);
		
		//check size and capasity
		System.out.println("Size"+v1.size());
		System.out.println("Capasity:"+v1.capacity());
		
		v1.addElement("yellow");
		v1.addElement("Orange");
		System.out.println("Size"+v1.size());
		System.out.println("Capasity:"+v1.capacity());
		
		if(v1.contains("red"))
		{
			System.out.println("REd color is present:"+v1.indexOf("red"));
			
		}
		else
		{
			System.out.println("Not present");
		}
		
		System.out.println("The last Element:"+v1.lastElement());
		System.out.println("First Element  "+v1.firstElement());
		
	
	}

}
