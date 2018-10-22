import java.util.Arrays;
import java.util.Scanner;

public class QueueUsingStack {

	Scanner sc = new Scanner(System.in);
	int begin = 0, pushDone = 1, popDone = -1, printDone = 1, action = 0;
	int stackIndex = -1, newStackIndex = -1, size, input, popCount;

	{
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		sc.nextLine();
	}

	String[] stack = new String[size];
	String value;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueueUsingStack object = new QueueUsingStack();
		do {
			System.out.println("\n\nSelect any of the action on stack : ");
			System.out.println("Push        : Press 1 ");
			System.out.println("Pop         : Press 2 ");
			System.out.println("Print Stack : Press 3 ");
			System.out.println("Exit        : Press 0 ");
			object.input = sc.nextInt();

			if (object.input == 1) {
				object.push();
			}
			if (object.input == 2) {
				object.pop();
			}

			if (object.input == 3) {
				object.printStack();
			}
			if (object.input == 0) {
				sc.close();
			}
		} while (object.input != 0);

	}

	void push() {
		if (stackIndex == size - 1)
			System.out.println(" Can't Push: Stack is full ");
		else {

			if (action == popDone && action != printDone) {
				int index = 0;
				String[] stack2 = new String[size];

				for (int count = newStackIndex; count >= 0; count--) {
					stack2[index] = stack[count];

					index++;
				}
				index = 0;
				for (int count = stackIndex; count >= 0; count--) {
					stack[index] = stack2[count];
					index++;
				}

			}

			System.out.println("Enter Value : ");
			value = sc.nextLine();

			stackIndex++;
			stack[stackIndex] = value;
			action = pushDone;

			System.out.println(" !!....Value Inserted....!!");
		}

	}

	void pop() {

		if (stackIndex == -1)
			System.out.println(" Can't Pop: Stack is empty ");
		else {
			newStackIndex = stackIndex;
			stackIndex--;

			action = popDone;

			System.out.println(" !!....Value Popped....!!");
		}
	}

	void printStack() {

		if (stackIndex == -1)
			System.out.println(" Can't Print: Stack is empty ");

		else {

			if (action == popDone) {
				int index = 0;
				String[] stack2 = new String[size];

				for (int count = newStackIndex; count >= 0; count--) {
					stack2[index] = stack[count];

					index++;
				}

				index = 0;
				for (int count = stackIndex; count >= 0; count--) {
					stack[index] = stack2[count];
					index++;
				}

				action = printDone;
				System.out.print(" Stack : ");
			}
			for (int count = 0; count <= stackIndex; count++) {
				System.out.print(" " + stack[count]);
			}
		}

	}
}
