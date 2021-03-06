// Node 생성
class Node{
	Node nextNode;
	int value;
	
	Node(int argValue, Node argNextNode) {
		value = argValue;
		nextNode = argNextNode;
	}
}

// Linked List를 활용한 Stack 구현
class MyStack{
	Node head, tail;
	int numOfData;
	
	// 생성자
	// Linked List Head, Tail 생성
	MyStack(){
		head = new Node(0, tail);
		tail = new Node(0, null);
	}
	
	// 유효성 검사
	boolean IsEmpty() {
		if(numOfData == 0)
			return true;
		return false;
	}
	
	// Stack 내 데이터 개수 반환
	int getNumOfElements() {
		return numOfData;
	}
	
	// Stack Push operation 구현
	int push(int argValue) {
		Node newNode = new Node(argValue, head.nextNode);
		head.nextNode = newNode;
		return ++numOfData;
	}
	
	// Stack pop operation 구현
	int pop() {
		if(IsEmpty())
			return Integer.MAX_VALUE;
		
		Node temp = head.nextNode;
		int value = temp.value;
		head.nextNode = temp.nextNode;
		temp = null;
		numOfData--;
		return value;
	}
	
	// Stack 내 원소를 Top -> Bottom 순서로 출력
//	public String toString() {
//		msg+=" " + nextNode;
//		Node temp = head.nextNode;
//		while(numOfData != null)
//			return value;
//	}
}

public class MidTermExam {
	public static void main(String[] args) {

		MyStack stackObj = new MyStack();
		stackObj.push(5);
		stackObj.push(4);
		stackObj.push(3);
		stackObj.push(2);
		stackObj.push(1);
		System.out.println(stackObj);
		
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
	}
}