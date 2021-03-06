import java.util.HashSet;

class Student {
	int id;
	String name;
	
	Student(int argId, String argName){
		id = argId;
		name = argName;
	}
	
	public boolean equals(Object obj) {
		return this.id == ((Student)obj).id;
	}
	
	public int hashCode() {
		return Integer.valueOf(id).hashCode();
	}
	
	public String toString() {
		return id+" "+name;
	}
	
}

public class TP45 {

	public static void main(String[] args) {
		Student std1 = new Student(1, "YCJung");
		Student std2 = new Student(1, "TIWon");
		Student std3 = new Student(2, "CHChoi");
		Student std4 = new Student(3, "SSKim");
		
		HashSet myList = new HashSet();
		
		myList.add(std1);
		myList.add(std2);
		myList.add(std3);
		myList.add(std4);
		
		System.out.println(myList); // hashcode가 먼저 실행되고 equals(?) 가 실행됨,  실행되는 순서가 다름
		//set 로직으로 호출되는 것임

	}

}
