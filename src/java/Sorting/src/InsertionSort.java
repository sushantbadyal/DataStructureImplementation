  import java.util.Scanner;


public class InsertionSort
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{ 
			int length;
			System.out.println(" Enter Array Count : ");
			length=sc.nextInt();
			int inputs[]=new int[length];
			System.out.println(" Enter The Array : ");
			   for(int count=0;count<length;count++)
				 inputs[count]=sc.nextInt();
			   
			       for(int count=0;count<length-1;count++)	   
			        {
				      int value=inputs[count+1];
				      int temporaryCount=count;
				        while(temporaryCount>=0 && inputs[temporaryCount]>value)
				         {
				         	inputs[temporaryCount+1]=inputs[temporaryCount];
				    	    temporaryCount--;
				         }
				       inputs[temporaryCount+1]=value;
			        }
			       
			   System.out.println("Insertion Sort : ");
			   for(int count=0;count<length;count++)
		    	   System.out.println(inputs[count]);
		       sc.close();

	}

}
