// Node ����
class Node{
	Node nextNode;
	int value;
	
	Node(int argValue, Node argNextNode) {
		value = argValue;
		nextNode = argNextNode;
	}
}

// Linked List�� Ȱ���� Stack ����
class MyStack{
	Node head, tail;
	int numOfData;
	
	// ������
	// Linked List Head, Tail ����
	MyStack(){
		head = new Node(0, tail);
		tail = new Node(0, null);
	}
	
	// ��ȿ�� �˻�
	boolean IsEmpty() {
		if(numOfData == 0)
			return true;
		return false;
	}
	
	// Stack �� ������ ���� ��ȯ
	int getNumOfElements() {
		return numOfData;
	}
	
	// Stack Push operation ����
	int push(int argValue) {
		Node newNode = new Node(argValue, head.nextNode);
		head.nextNode = newNode;
		return ++numOfData;
	}
	
	// Stack pop operation ����
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
	
	// Stack �� ���Ҹ� Top -> Bottom ������ ���
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