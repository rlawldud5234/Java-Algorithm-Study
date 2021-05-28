// queue Ŭ���� ����
class MyCircularQueue{
	private final int MAX_QUEUE_SIZE;
	private int queueList[];
	private boolean isOWRMode;
	private int startIndex;
	private int endIndex;
	private int numOfData;
	
	// ������
	MyCircularQueue(int argSizeOfQueue){
		MAX_QUEUE_SIZE = argSizeOfQueue;
		queueList = new int[MAX_QUEUE_SIZE];
	}
	
	// ������ ���� : ť�� ���� ������ ��ġ�� �Է� ������ ����
	boolean enqueue(int argValue) {
		// ť�� ����� ���� á�� ���
		if(numOfData == MAX_QUEUE_SIZE)
			return false;
		
		// �� END Index ��ġ�� �Է� �� Queue�� ����
		// End Index�� ť�� ���Ӱ� ���Ե� �������� ���� ��ġ�� ��Ÿ��
		queueList[endIndex] = argValue;
		endIndex = (endIndex+1) % MAX_QUEUE_SIZE;
		
		numOfData++; // ť �� ������ ������ 1 ����
		
		return true;
	}
	
	// ������ ���� : ť�� ���� ���� ��ġ�� ������ ������ ��ȯ
	int dequeue() {
		// ������ ����� 0�� ��, int���� �ִ��� ��ȯ
		if(numOfData == 0)
			return Integer.MAX_VALUE;
		
		// Queue�� ���� ���� �� ��ȯ, startIndex 1 ����
		
		// queue ����Ʈ�� 
		int value = queueList[startIndex];
		
		// Start Index�� ť��
		startIndex = (startIndex + 1) % MAX_QUEUE_SIZE;
		
		numOfData--; // ť �� ������ ������ 1����
		
		return value;
	}
	
	// ���ڿ� ����
	public String toString() {
		String msg = "Start Index : "+startIndex+"\tEnd Index : "+endIndex+"\tData size : "+numOfData+"\n";
		msg+= "Values in the queue : ";
		for(int iCount=0; iCount<numOfData; iCount++) {
			msg += queueList[(startIndex + iCount)%MAX_QUEUE_SIZE]+" ";
		}
		
		msg+= "\nValues in the array : ";
		for(int iCount=0; iCount<queueList.length; iCount++) {
			msg+=queueList[iCount]+" ";
		}
		return msg += "\n\n";
	}
}


public class TP40 {

	public static void main(String[] args) {
		MyCircularQueue myCirQueue = new MyCircularQueue(5);
		
		System.out.println("enqueue: 5");
		myCirQueue.enqueue(5);
		System.out.println(myCirQueue);
		
		System.out.println("enqueue: 6");
		myCirQueue.enqueue(6);
		System.out.println(myCirQueue);
		
		System.out.println("enqueue: 7");
		myCirQueue.enqueue(7);
		System.out.println(myCirQueue);
		
		System.out.println("enqueue: 8");
		myCirQueue.enqueue(8);
		System.out.println(myCirQueue);
		
		System.out.println("enqueue: 9");
		myCirQueue.enqueue(9);
		System.out.println(myCirQueue);
		
		System.out.println("dequeue : "+myCirQueue.dequeue());
		System.out.println(myCirQueue);
		
		System.out.println("dequeue : "+myCirQueue.dequeue());
		System.out.println(myCirQueue);
		
		System.out.println("dequeue : "+myCirQueue.dequeue());
		System.out.println("dequeue : "+myCirQueue.dequeue());
		System.out.println("dequeue : "+myCirQueue.dequeue());
		System.out.println("dequeue : "+myCirQueue.dequeue());
		System.out.println(myCirQueue);
		

	}

}