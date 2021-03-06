// queue 클래스 생성
class MyCircularQueue{
	private final int MAX_QUEUE_SIZE;
	private int queueList[];
	private boolean isOWRMode;
	private int startIndex;
	private int endIndex;
	private int numOfData;
	
	// 생성자
	MyCircularQueue(int argSizeOfQueue){
		MAX_QUEUE_SIZE = argSizeOfQueue;
		queueList = new int[MAX_QUEUE_SIZE];
	}
	
	// 데이터 삽입 : 큐의 제일 마지막 위치에 입력 데이터 삽입
	boolean enqueue(int argValue) {
		// 큐의 사이즈가 가득 찼을 경우
		if(numOfData == MAX_QUEUE_SIZE)
			return false;
		
		// 현 END Index 위치에 입력 값 Queue에 저장
		// End Index는 큐에 새롭게 삽입될 데이터의 저장 위치를 나타냄
		queueList[endIndex] = argValue;
		endIndex = (endIndex+1) % MAX_QUEUE_SIZE;
		
		numOfData++; // 큐 내 데이터 사이즈 1 증가
		
		return true;
	}
	
	// 데이터 삭제 : 큐의 제일 앞쪽 위치의 데이터 삭제후 반환
	int dequeue() {
		// 데이터 사이즈가 0일 때, int형인 최댓값을 반환
		if(numOfData == 0)
			return Integer.MAX_VALUE;
		
		// Queue의 제일 앞쪽 값 반환, startIndex 1 증가
		
		// queue 리스트를 
		int value = queueList[startIndex];
		
		// Start Index는 큐에
		startIndex = (startIndex + 1) % MAX_QUEUE_SIZE;
		
		numOfData--; // 큐 내 데이터 사이즈 1감소
		
		return value;
	}
	
	// 문자열 생성
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
