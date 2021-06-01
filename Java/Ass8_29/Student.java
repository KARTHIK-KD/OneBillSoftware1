import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Student {
	int id;
	String name;
	int mark;
	int age;
	public Student(int id, String name, int mark, int age) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		ArrayList<Student> ts= new ArrayList<Student>();
		ts.add(new Student(1,"karthik",80,20));
		ts.add(new Student(2,"mani",81,21));
		ts.add(new Student(3,"arun",90,20));
		System.out.println("1.ID\n2.Name\n3.Mark\n4.Age\nEnter your choice : ");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		switch(choice) {
		case 1:{
			Comparator<Student> c=new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					return o1.id - o2.id;
				}
				
			};
			Collections.sort(ts,c);
			for(Student s:ts)
				System.out.println(s);
		}break;
		
		case 2:{
			Comparator<Student> c=new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					return o1.name.compareTo(o2.name);
				}
				
			};
			Collections.sort(ts,c);
			for(Student s:ts)
				System.out.println(s);
		}break;
		case 3:{
			Comparator<Student> c=new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					return o1.mark - o2.mark;
				}
				
			};
			Collections.sort(ts,c);
			for(Student s:ts)
				System.out.println(s);
		}break;
		case 4:{
			Comparator<Student> c=new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					return o1.age - o2.age;
				}
				
			};
			Collections.sort(ts,c);
			for(Student s:ts)
				System.out.println(s);
		}break;
		}
	}
}






