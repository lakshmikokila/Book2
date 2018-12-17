import java.util.*;

public class HashTable1 {
public static void main(String args[])
{
	Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	ht.put(100,"abc123");
	ht.put(101, "Abc121");
	ht.put(103, "abc124");
	
	System.out.println(ht);
	
	for(Map.Entry em:ht.entrySet())
	{
	System.out.println(em.getKey()+ " "+em.getValue());
	}
	
	ht.remove(101);
	System.out.println(ht);
	
	System.out.println(ht.getOrDefault(100, "Not Found"));
	System.out.println(ht.getOrDefault(104, "Not Found"));
	
	ht.putIfAbsent(105,"abced");
	System.out.println(ht);
}
}
