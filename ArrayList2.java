
/* class Student
{
	int rollno;
	String name;
	Student (int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
}*/
import java.util.*;
public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"ram");
		Student s2=new Student(102,"seetha");
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		//System.out.println(al);
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		Student st=(Student)itr.next();
		System.out.println(st.rollno+ " "+st.name);
	}
		
	}

}
