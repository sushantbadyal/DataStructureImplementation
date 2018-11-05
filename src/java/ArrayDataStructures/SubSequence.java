package ArrayDataStructures;

import java.util.Scanner;

public class SubSequence {
    int size, yes = 1, no = 0, startWithNegativeValue = yes, noteIndex = yes, index, positiveNumberSum = 0,
            negativeNumberSum = 0, largestSum, demoLargestSum, firstSumDone = no, sumCount = 1, startIndex, lastIndex,
            negativeCount = 0;
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("Enter the size of Array : ");
        size = sc.nextInt();
    }

    int[] input = new int[size];

    public static void main(String args[]) {

        SubSequence classObject = new SubSequence();
        classObject.inputValues();
        classObject.findMaximumSubArraySum();
        if (classObject.negativeCount++ == classObject.size) {
            System.out.println(" Sorry ! All the values entered are negative.");
        } else {
            System.out.println("largest subsequence with maximum sum is : [" + classObject.startIndex + ","
                    + classObject.lastIndex + "]");
            System.out.println("Maximum Sum                             : " + classObject.largestSum);
        }
    }

    void inputValues() {
        System.out.println("Enter the array : ");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
            if (input[i] < 0)
                negativeCount++;
        }

    }

    void findMaximumSubArraySum() {
        for (int i = 0; i < size; i++) {
            if (startWithNegativeValue == yes && input[i] <= 0 && i != size - 1 && firstSumDone == no) {
                if (input[i + 1] > 0) {
                    startWithNegativeValue = no;
                }
            } else {
                if (noteIndex == yes) {
                    noteIndex = no;
                    index = i;
                }

                if (i <= size - 1 && (input[i] > 0)) {
                    positiveNumberSum = positiveNumberSum + input[i];

                    if (i == size - 1 || input[i + 1] < 0) {
                        if (firstSumDone == no) {
                            firstSumDone = yes;
                            largestSum = positiveNumberSum;
                            demoLargestSum = largestSum;
                            startIndex = index;
                            lastIndex = i;
                        }

                        if (sumCount == 2) {
                            if ((demoLargestSum + negativeNumberSum + positiveNumberSum) > largestSum) {

                                if (demoLargestSum + negativeNumberSum < 0) {
                                    startIndex = index;
                                    largestSum = positiveNumberSum;
                                    demoLargestSum = largestSum;
                                }

                                else {
                                    largestSum = demoLargestSum + negativeNumberSum + positiveNumberSum;
                                }
                                lastIndex = i;
                                demoLargestSum = largestSum;
                                negativeNumberSum = 0;
                            } else if (positiveNumberSum > (demoLargestSum + positiveNumberSum)) {
                                largestSum = positiveNumberSum;
                                demoLargestSum = largestSum;
                                negativeNumberSum = 0;
                                startIndex = index;
                                lastIndex = i;
                            }

                            else {
                                demoLargestSum = demoLargestSum + negativeNumberSum + positiveNumberSum;
                                negativeNumberSum = 0;
                            }

                            sumCount = 1;
                        }

                    }
                } else if (firstSumDone == yes) {
                    negativeNumberSum = negativeNumberSum + input[i];
                    if (i == size - 1) {
                        break;
                    }
                    if (input[i + 1] > 0) {
                        noteIndex = yes;
                        positiveNumberSum = 0;
                        sumCount++;
                    }

                }

            }

        }
    }
}
