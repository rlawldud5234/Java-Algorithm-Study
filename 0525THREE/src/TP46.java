import java.util.Set;
import java.util.HashSet;

public class TP46 {

	public static void main(String[] args) {
		Set mySet1 = new HashSet();
		Set mySet2 = new HashSet();
		
		mySet1.add(1);mySet1.add(2);mySet1.add(3);
		mySet2.add(4);mySet2.add(2);mySet2.add(3);
		
		mySet1.retainAll(mySet2); //������
		System.out.println(mySet1);
		
		mySet2.removeAll(mySet1); // ������
		System.out.println(mySet2);
		
		mySet1.addAll(mySet2); // ������
		System.out.println(mySet1);

	}

}
