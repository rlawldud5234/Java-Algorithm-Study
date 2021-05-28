import java.util.ArrayList;

class Student implements Comparable<Student> {
	int id;
	String name;
	Student(int argId, String argName) {
		id = argId;
		name = argName;
	}
	
	//Comparable interface 오버라이딩
	// Collection sort() 메서드 호출 시 객체 비교 알고리즘 작성
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
		
		myList.add(new Student(1, "정영철"));
		myList.add(new Student(10, "이승엽"));
		myList.add(new Student(5, "김상수"));
		myList.add(new Student(8, "원태인"));
		
		System.out.println(myList);
		
		myList.sort(null);
		
		System.out.println(myList);
		

	}

}
