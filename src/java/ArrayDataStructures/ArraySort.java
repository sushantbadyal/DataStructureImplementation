package ArrayDataStructures;

import java.util.Scanner;

public class ArraySort {
    Scanner sc = new Scanner(System.in);
    int size, zero=0, one= 0, two=0 ;

    {
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        sc.nextLine();
    }

    int[] arrayItem = new int[size];


    public static void main(String args[]) {
        ArraySort arraySortObject = new ArraySort();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\nSelect any of the option : ");
            System.out.println("Enter Array                      : Press 1 ");
            System.out.println("Sort The Array                       : Pres 2 ");
            System.out.println("Print The Array                       : Pres 3 ");
            System.out.println("Exit                                 : Press 0");
            choice = sc.nextInt();

            if (choice == 1) {
                int values;

                System.out.println("Enter valuess : ");
                for (int count = 0; count < arraySortObject.size; count++) {

                    values = sc.nextInt();
                    arraySortObject.arrayItem[count] = values;
                    if (values == 0) {
                        arraySortObject.zero++;
                    } else if (values == 1) {
                        arraySortObject.one++;
                    } else if (values == 2) {
                        arraySortObject.two++;
                    } else {
                        count--;
                        System.out.println(" WARNING: RE-ENTER: Please enter only 0, 1 or 2 ");
                    }
                }


            }


            if (choice == 2) {

                for (int count = 0; count < arraySortObject.size; count++) {

                    if (arraySortObject.zero > 0) {
                        arraySortObject.arrayItem[count] = 0;
                        arraySortObject.zero--;
                        //System.out.println(" 0 ");
                    }
                    else if (arraySortObject.one > 0) {
                        arraySortObject.arrayItem[count] = 1;
                        arraySortObject.one--;
                      //  System.out.println(" 1 ");
                    }
                   else {
                        arraySortObject.arrayItem[count] = 2;
                        arraySortObject.two--;
                       // System.out.println(" 2 ");
                    }
                }

                System.out.println("Sorting Done ");
            }

            if (choice == 3) {

                for (int count = 0; count < arraySortObject.size; count++) {

                    System.out.println(" " + arraySortObject.arrayItem[count]);
                }

                if (choice == 0) {
                    System.exit(0);
                }


            }

        } while (choice != 0);

    }
}


