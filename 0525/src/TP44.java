import java.util.HashSet;
import java.util.Set;

public class TP44 {

	public static void main(String[] args) {
		Set mySet = new HashSet(); // set�� ������ ? �θ�, �ڽİ��迩��
		
		while(mySet.size()<6) {
			mySet.add((int)(Math.random()*45+1));
		}
		
		System.out.println(mySet);

	}
	


	
}
