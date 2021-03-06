class Node{
	Node nextNode;
	int value;
	
	Node(int argValue, Node argNextNode){
		value = argValue;
		nextNode = argNextNode;
	}
}

// Queue class
class MyQueueListVersion{
	Node head, tail;
	int numOfData;
	
	// 생성자
	MyQueueListVersion(){
		tail = new Node(0, null);
		head = new Node(0, tail);
	}
	
	// numOfData에 값이 비어있으면 true를 반환
	boolean IsEmpty() {
		if(numOfData == 0)
			return true;
		return false;
	}

	// enqueue
	void enqueue(int argValue) {
		Node temp = head;
		while(temp.nextNode != tail)
			temp = temp.nextNode;
		
		Node newNode = new Node(argValue, tail);
		temp.nextNode = newNode;
		numOfData++;
	}
	
	// queue 사이즈 반환
	int getSize() {
		return numOfData;
	}
	
	// dequeue
	int dequeue() {
		if(IsEmpty())
			return Integer.MAX_VALUE;
		
		// Head nextNode 주소 획득
		Node deletedNode = head.nextNode;
		
		// a Node의 value 값 획득
		int value = deletedNode.value;
		
		// Head nextNode = a.nextNode
		head.nextNode = deletedNode.nextNode;
		
		// a Node = Null;
		deletedNode = null;
		
		// numOfData--;
		numOfData--;
		
		// 값 반환
		return value;
		
	}
	
	// 문자열 반환
	public String toString() {
		String msg = "";
		Node temp = head.nextNode;
		while(temp.nextNode!=null) {
			msg+=" "+temp.value;
			temp = temp.nextNode;
		}
		return msg;
	}
	
}

public class TP30 {

	public static void main(String[] args) {
		
		MyQueueListVersion myQueue = new MyQueueListVersion();
		
		System.out.println("Enqueue : 1 "); myQueue.enqueue(1);
		System.out.println("Enqueue : 2 "); myQueue.enqueue(2);
		System.out.println("Enqueue : 3 "); myQueue.enqueue(3);
		System.out.println(myQueue);
		
		System.out.println("Dequeue : "+ myQueue.dequeue());
		System.out.println(myQueue);
		System.out.println("Dequeue : "+ myQueue.dequeue());
		System.out.println(myQueue);
		
		System.out.println("Enqueue : 6 "); myQueue.enqueue(6);
		System.out.println(myQueue);
		
		System.out.println("Dequeue : "+ myQueue.dequeue());
		System.out.println(myQueue);

	}

}
