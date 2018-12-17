import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		list.add("abi");
		list.add("antony");
		list.add("indhu");
		System.out.println(list);
		
		//remove speicfic element
		list.remove("indhu");
		System.out.println(list);
		
		//removing from position
		list.remove(0);
		System.out.println(list);
		
		LinkedList<String>list1=new LinkedList<String>();
		list1.add("mohammed");
		list1.add("karthi");
		list1.add("hari");
		
		list.addAll(list1);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		list.add("indhu");
		list.add("karthi");
		list.addFirst("indhu");
		
		System.out.println(list);
		
		list.removeFirstOccurrence("indhu");
		System.out.println(list);
		
		list.removeLastOccurrence("karthi");
		System.out.println(list);
	}

}
