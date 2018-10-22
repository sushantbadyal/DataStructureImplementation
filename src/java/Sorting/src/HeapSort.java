import java.util.Scanner;


public class HeapSort
{
	static Scanner sc= new Scanner(System.in);
	static int length;
	public static void main(String[] args) 
	{
	    System.out.println(" Enter Array Count : ");
		int length=sc.nextInt();
		int inputs[]=new int[length];
		System.out.println(" Enter The Array : ");
		   for(int count=0;count<length;count++)
			 inputs[count]=sc.nextInt(); 
		     
		     heapSort(inputs);
		   
	          System.out.println ("Heap Sort: ");
		         for(int count=0;count<length;count++)
				   {
				     System.out.print(" "+inputs[count]);
				   }
		      sc.close();
		
	}
	
	static void createMaxHeap(int[] inputs,int length, int startIndex)
	{ 
		int largest=startIndex;
		int leftNode=2*startIndex+1;
		int rightNode=2*startIndex+2;
		  if(leftNode< length && inputs[leftNode]>inputs[largest])
		    {
			  largest=leftNode;
		    }
		
		
		      if(rightNode< length && inputs[rightNode]>inputs[largest])
		        {
		          largest=rightNode;
		        }
		
		           if(largest!=startIndex)
		              {
			            int temporary=inputs[startIndex];
			            inputs[startIndex]=inputs[largest];
			            inputs[largest]=temporary;
			            createMaxHeap(inputs,length, largest);
		              }
		
	}
	
	
	static void heapSort(int[] inputs)
	 {  
	   int length=inputs.length;
	   	for(int count=((length)/2)-1;count>=0;count--)
		  {
		    createMaxHeap(inputs,length, count);
		  }
		
		     for(int count=length-1;count>=0;count--)
		        {  
			      int rootNode=0;
			      int temporary=inputs[rootNode];
			      inputs[rootNode]=inputs[count];
			      inputs[count]=temporary;
			      createMaxHeap(inputs,count,rootNode);
		  }
		
	 } 

}
