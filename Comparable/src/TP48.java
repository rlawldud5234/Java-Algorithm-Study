import java.util.ArrayList;

class Student implements Comparable<Student> {
	int id;
	String name;
	Student(int argId, String argName) {
		id = argId;
		name = argName;
	}
	
	//Comparable interface �������̵�
	// Collection sort() �޼��� ȣ�� �� ��ü �� �˰��� �ۼ�
	public int compareTo(Student o) {
		if(id==o.id)
			return 0;
		
		return (id>((Student)o).id)?1:-1;
	}
	
	@Override
	public String toString() {
		return id+" : "+name;
	}
}

public class TP48 {

	public static void main(String[] args) {
		ArrayList<Student> myList = new ArrayList<Student>();
		
		myList.add(new Student(1, "����ö"));
		myList.add(new Student(10, "�̽¿�"));
		myList.add(new Student(5, "����"));
		myList.add(new Student(8, "������"));
		
		System.out.println(myList);
		
		myList.sort(null);
		
		System.out.println(myList);
		

	}

}
