package ArrayDataStructures;

import java.util.Scanner;

public class LargestNumber {
    int size, demoSize, nthLargestValue, index, nthValue, nthValueCount = 1;
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("Enter the size of Array : ");
        size = sc.nextInt();
        demoSize = size;
    }

    int[] input = new int[size];

    public static void main(String args[]) {
        LargestNumber classObject = new LargestNumber();
        classObject.inputValues();
        classObject.findNthLargestValue();
        System.out.println(" Nth largest Value is : " + classObject.nthLargestValue);

    }

    void inputValues() {
        System.out.println("Enter the array : ");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }

        System.out.println("Enter the nth largest Value to find : ");
        nthValue = sc.nextInt();

    }

    void findNthLargestValue() {
        for (int i = 0; i < demoSize; i++) {
            nthLargestValue = input[0];
            for (int j = 1; j < demoSize; j++) {
                if (input[j] > nthLargestValue) {
                    nthLargestValue = input[j];
                    index = j;
                }
            }

            if (demoSize < size && nthLargestValue == input[demoSize]) {
                nthValueCount--;
            }

            if (nthValueCount != nthValue) {

                int temporary = input[demoSize - 1];
                input[demoSize - 1] = nthLargestValue;
                input[index] = temporary;
                nthValueCount++;
                demoSize--;

                findNthLargestValue();
            }

            else {
                break;
            }
        }

    }
}
