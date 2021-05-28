import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TP41 {

	public static void main(String[] args) {
		Set mySet = new HashSet();
		
		mySet.add(1);mySet.add(2);mySet.add(3);mySet.add(4);mySet.add(5);
		
		Iterator myList = mySet.iterator();
		
		while(myList.hasNext()) {
			System.out.println(myList.next());  // 1,2,3,4,5 출력
			myList.remove();
		}
		
		System.out.println(mySet);  // HashSet 내 원소 [ ] <-- 이유?

	}

}
