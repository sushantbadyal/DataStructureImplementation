
import java.util.Random;
import java.util.Scanner;


public class QuickSort {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter Array Count : ");
		int length=sc.nextInt();
		int inputs[]=new int[length];
		System.out.println(" Enter The Array : ");
		   for(int count=0;count<length;count++)
			 inputs[count]=sc.nextInt();
		   
	    int lastIndexOfInputs=inputs.length-1;
	    int startIndexOfInputs=0;
		   quickSort(inputs,startIndexOfInputs,lastIndexOfInputs);
		   System.out.println("Quick Sort : ");
		      for(int count=0;count<length;count++)
	    	     System.out.println(inputs[count]);
	           sc.close();

	}
	
	
	static void quickSort(int[] inputs,int startIndex,int lastIndex)
	{  
		if(startIndex<lastIndex)
			{	
			  int pivotIndex=QuickSort.partition(inputs,startIndex,lastIndex);
			  quickSort(inputs,startIndex,pivotIndex-1);
		      quickSort(inputs,pivotIndex+1,lastIndex);	
	        }
	}
	
	static int partition(int[] arrayForPartition,int startIndex, int lastIndex)
	{   
		int pivotIndex=startIndex;
		int pivot=arrayForPartition[lastIndex];	
		for(int count=startIndex;count<=lastIndex;count++)
		{
			if(arrayForPartition[count]<=pivot)
			{
				int temporary=arrayForPartition[pivotIndex];
				arrayForPartition[pivotIndex]=arrayForPartition[count];
				arrayForPartition[count]=temporary;
				pivotIndex++;
				
			}
		}
		return pivotIndex-1;
		
	}
}
