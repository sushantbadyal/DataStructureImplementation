package ArrayDataStructures;

import java.util.Scanner;

public class CheckTriangle {

    int size,triangleCount;
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("Enter the number of sides : ");
        size = sc.nextInt();
    }

    int[] input = new int[size];


    public static void main(String args[]) {
        CheckTriangle classObject = new CheckTriangle();
        classObject.inputValues();
        classObject.checkIfTriangle();
        System.out.println("Total Possible Triagles are : "+ classObject.triangleCount);

    }


    void inputValues() {
        System.out.println("Enter the sides : ");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
    }

    void checkIfTriangle(){
        for(int i = 0 ; i < size ; i++) {
            for( int j = i+2 ; j < size ; j++) {
                if( (input[i] + input[i+1] > input[j]) && (input[i] + input[j] > input[i+1]) && (input[i+1] + input[j] > input[i]) )
                {
                    triangleCount++;
                }
            }
        }
    }

}
