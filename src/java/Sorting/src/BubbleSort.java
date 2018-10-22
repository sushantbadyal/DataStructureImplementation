import java.util.Scanner;


public class BubbleSort 
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
			   for(int countTwo=0;countTwo<(length-countOne-1);countTwo++)
			   {
				   if(inputs[countTwo+1]<inputs[countTwo])
				   {
					   int temporaryValue=inputs[countTwo+1];
					   inputs[countTwo+1]=inputs[countTwo];
					   inputs[countTwo]=temporaryValue;
				   }
			   }
		   }
		   System.out.println("Bubble Sort : ");
		   for(int count=0;count<length;count++)
	    	   System.out.println(inputs[count]);
	       sc.close();

	}

}
