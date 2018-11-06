package LinkedListPrograms;

import java.util.Scanner;

public class LoopLengthCount {

        int no = 0, yes = 1, enter = no, count = -1, loopLength = 0, actualLength = -1, loopLengthCount = -1,loopCountDone =no;

        class Node {
            Node rightNode = null;
            int value;
        }

        Node start = null, targetNode = null;

        void insert(Node start, int value) {

            if (start == null) {

                start = new Node();
                start.value = value;
            } else {

                if (start.rightNode != null) {
                    insert(start.rightNode, value);

                } else {
                    start.rightNode = new Node();
                    start.rightNode.value = value;
                }

            }
            this.start = start;

        }

        void createLoop(Node start, int value) {

            if(loopCountDone == no)
            {
                if ( start != null && count < value) {
                    count++;
                    if (count == value) {
                        targetNode = start;
                        start = this.start;
                    } else  {
                        createLoop(start.rightNode, value);
                    }
                }
                if (start != null) {
                    actualLength++;
                    createLoop(start.rightNode, value);
                } else {
                    start = targetNode;
                    loopLengthCount = actualLength - (value-1);
                    loopCountDone = yes;
                }
            }

        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int choice;
            LinkedListPrograms.LoopLengthCount classObject = new LinkedListPrograms.LoopLengthCount();
            do {
                System.out.println("To enter element in Linked List        : Press 1 ");
                System.out.println("To create loop in Linked List          : Press 2 ");
                System.out.println("To create loop and Count its length    : Press 3 ");
                System.out.println(" For Exit                              : Press 0 ");
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Insert Value : ");
                    int value = sc.nextInt();
                    classObject.insert(classObject.start, value);
                }

                if (choice == 2) {
                    System.out.println("Enter the Position where u want to start the loop \n NOTE: Index starts from 0 to n-1 : ");
                    classObject.createLoop(classObject.start, sc.nextInt());
                    System.out.println(" Value of TargetNode is : " + classObject.targetNode.value);
                    System.out.println(" Length of Loop is      : " + classObject.loopLengthCount);
                    System.out.println("---------------------------------------");
                }

                if (choice == 0) {
                    System.exit(0);
                }

            } while (choice != 0);

        }

}
