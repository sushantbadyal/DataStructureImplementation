import java.io.PrintStream;
import java.util.Scanner;

public class StackImplementation {
	Scanner sc = new Scanner(System.in);
	int stackIndex = -1, size, input;

	{
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		sc.nextLine();
	}

	String[] stack = new String[size];
	String value;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackImplementation object = new StackImplementation();
		do {
			System.out.println("\n\nSelect any of the action on stack : ");
			System.out.println("Push        : Press 1 ");
			System.out.println("Pop         : Press 2 ");
			System.out.println("Peek        : Press 3 ");
			System.out.println("Print Stack : Press 4 ");
			System.out.println("Exit        : Press 0 ");
			object.input = sc.nextInt();

			if (object.input == 1) {
				object.push();
			}
			if (object.input == 2) {
				object.pop();
			}
			if (object.input == 3) {
				object.peek();
			}
			if (object.input == 4) {
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
			System.out.println("Enter Value : ");
			value = sc.nextLine();
			stackIndex++;
			stack[stackIndex] = value;
			System.out.println(" !!....Value Inserted....!!");
		}

	}

	void pop() {

		if (stackIndex == -1)
			System.out.println(" Can't Pop: Stack is empty ");
		else {
			stackIndex--;
			System.out.println(" !!....Value Popped....!!");
		}

	}

	void peek() {
		if (stackIndex == -1)
			System.out.println(" Can't Peek: Stack is empty ");

		else {
			System.out.println(" Value : " + stack[stackIndex]);
		}
	}

	void printStack() {

		if (stackIndex == -1)
			System.out.println(" Can't Print: Stack is empty ");

		else {
			System.out.print(" Stack : ");
			for (int count = 0; count <= stackIndex; count++) {
				System.out.print(" " + stack[count]);
			}
		}
	}

}
