import java.util.Scanner;

public class QueueImplementataion {
wswwwdwdwdwd
	Scanner sc = new Scanner(System.in);
	String value;
	int queueIndexMin = -1, queueIndexMax = -1, size, input,
			freedSpaceIndex = -1;

	{
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		sc.nextLine();
	}

	String[] queue = new String[size];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueueImplementataion object = new QueueImplementataion();
		do {
			System.out.println("\n\nSelect any of the action on queue : ");
			System.out.println("Enqueue     : Press 1 ");
			System.out.println("Dequeue     : Press 2 ");
			System.out.println("Peek        : Press 3 ");
			System.out.println("Print queue : Press 4 ");
			System.out.println("Exit        : Press 0 \n ");
			object.input = sc.nextInt();

			if (object.input == 1) {
				object.enQueue();
			}
			if (object.input == 2) {
				object.deQueue();
			}
			if (object.input == 3) {
				object.peek();
			}
			if (object.input == 4) {
				object.printQueue();
			}
			if (object.input == 0) {
				sc.close();
			}
		} while (object.input != 0);

	}

	void enQueue() {
		if (queueIndexMin == 0 && queueIndexMax == size - 1
				|| queueIndexMin > 0 && queueIndexMax == size - 1
				&& freedSpaceIndex == queueIndexMin - 1)
			System.out.println(" Can't Enqueue: Queue is full ");
		else {
			System.out.println("Enter Value : ");
			value = sc.nextLine();
			if (queueIndexMax < size - 1) {
				queueIndexMax++;
				queue[queueIndexMax] = value;

				if (queueIndexMin == -1)
					queueIndexMin++;
			} else {

				freedSpaceIndex++;
				queue[freedSpaceIndex] = value;
			}
		}
		System.out.println(" !!....Value Inserted....!!");
	}

	void deQueue() {

		if (queueIndexMax == -1 || queueIndexMin > queueIndexMax)
			System.out.println(" Can't DeQueue: Stack is empty ");
		else {
			queueIndexMin++;
			System.out.println(" !!....Value DeQueued....!!");
			if (queueIndexMin == queueIndexMax + 1) {
				if (freedSpaceIndex > -1) {
					queueIndexMin = 0;
					queueIndexMax = freedSpaceIndex;
					freedSpaceIndex = -1;
				} else {
					queueIndexMin = queueIndexMax = -1;
				}
			}
		}

	}

	void peek() {
		if (queueIndexMax == -1 || queueIndexMin > queueIndexMax)
			System.out.println(" Can't DeQueue: Stack is empty ");

		else {
			System.out.println("\n Value : ");
			System.out.println(" " + queue[queueIndexMin]);
		}
	}

	void printQueue() {
		if (queueIndexMax == -1 || queueIndexMin > queueIndexMax)
			System.out.println(" Can't DeQueue: Stack is empty ");

		else if (freedSpaceIndex == -1) {
			System.out.print("\nValues are : ");
			for (int count = queueIndexMin; count <= queueIndexMax; count++) {
				System.out.print(" " + queue[count]);
			}
		} else {
			for (int count = queueIndexMin; count <= queueIndexMax; count++) {
				System.out.print(" " + queue[count]);
			}
			for (int count = 0; count <= freedSpaceIndex; count++) {
				System.out.print(" " + queue[count]);
			}
		}

	}

}
