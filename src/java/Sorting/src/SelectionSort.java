import java.util.Scanner;


public class SelectionSort 
{	
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter Array Count : ");
		int length=sc.nextInt();
		int inputs[]=new int[length];
		System.out.println(" Enter The Array : ");
		   for(int count=0;count<length;count++)
			 inputs[count]=sc.nextInt();
		   
		        for(int countOne=0;countOne<length-1;countOne++)
		          {  
			        int minimumValue=inputs[countOne];
			           for(int countTwo=countOne+1;countTwo<length;countTwo++)
			              {
				            if(minimumValue>inputs[countTwo])
				              {
					            int temporaryValue=inputs[countTwo];
					            inputs[countTwo]=minimumValue;
					            minimumValue=temporaryValue;
				              }
			               }
			         inputs[countOne]=minimumValue;
		          }
		      
		   System.out.println("Selection Sort : ");
		      for(int count=0;count<length;count++)
	    	    System.out.println(inputs[count]);
	       sc.close();

	}

}
