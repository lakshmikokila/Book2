import java.util.*;
public class HashsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ccc");
		//set.remove("bbb");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		HashSet<String> set1=new HashSet<String>();
		set1.add("EEE");
		set1.add("FFF");
		set.addAll(set1);
		Iterator<String> itr2=set1.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		set.removeAll(set1);
		System.out.println(set);
		set.clear();
		System.out.println(set);
		
		
	}

}
