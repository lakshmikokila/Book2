import java.util.*;

public class ArrayDeque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("aaa");
		dq.add("bbb");
		dq.add("ccc");
		
		
		for(String ad:dq)
		{
			System.out.println(ad);
		}
		dq.offerFirst("ddd");
		
		System.out.println(dq);
		 dq.pollFirst();
		 System.out.println(dq);
		
		dq.pollLast();
		System.out.println(dq);
		
		dq.offerLast("eee");
		System.out.println(dq);
	}

}
