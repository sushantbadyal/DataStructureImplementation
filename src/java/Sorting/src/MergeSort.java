import java.util.Scanner;


public class MergeSort {


	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter Array Count : ");
		int length=sc.nextInt();
		int inputs[]=new int[length];
		//int sortedArray[]=new int[length];
		System.out.println(" Enter The Array : ");
		   for(int count=0;count<length;count++)
			 inputs[count]=sc.nextInt();
		   
		   mergeSort(inputs);
		   System.out.println("Merge Sort : ");
		   for(int count=0;count<length;count++)
	    	   System.out.println(inputs[count]);
	           sc.close(); 
		   

	}
	
	 static void mergeSort(int[] inputs)
	{
		int length=inputs.length;
		if(length>1)
		{
		int leftArray[]=new int[length/2];
		int rightArray[]=new int[length-(length/2)];
		int rightArrayLength=(length-length/2);
	
		for(int count=0;count<length/2;count++)
		{
			leftArray[count]=inputs[count];
		}
		for(int count=0;count<rightArrayLength;count++)
		{
			rightArray[count]=inputs[length/2];
			length++;
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		MergeSort.merge(leftArray,rightArray,inputs);
	}
  }
	 
	 
	 static void merge(int[] leftArray,int[] rightArray,int[] inputs)
	 {
		 int indexOfLeftArray=0,indexOfRightArray=0,indexOfInputs=0;
		 while(indexOfLeftArray<leftArray.length && indexOfRightArray<rightArray.length)
		 {   
			 if(leftArray[indexOfLeftArray]<rightArray[indexOfRightArray])
			 {
				 inputs[indexOfInputs]=leftArray[indexOfLeftArray];
				 indexOfLeftArray++;
			 }
			 else
			 {
				 inputs[indexOfInputs]=rightArray[indexOfRightArray];
				 indexOfRightArray++;
			 }
				 
			 indexOfInputs++;	 
		 }
		 while(indexOfLeftArray<leftArray.length)
		 {
			 inputs[indexOfInputs]=leftArray[indexOfLeftArray];
			 indexOfLeftArray++;
			 indexOfInputs++;
		 }
		 
		 while(indexOfRightArray<rightArray.length)
		 {
			 inputs[indexOfInputs]=rightArray[indexOfRightArray];
			 indexOfRightArray++;
			 indexOfInputs++;
		 }
	 }


}
