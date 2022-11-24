import java.util.*;
class SumOfArrays
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = in.nextInt();
		int numbers[]=new int [size];
		int i,sum=0;

		for(i=0;i<numbers.length;i++)
		{
			numbers[i]=in.nextInt();
			sum=sum+numbers[i];
		}

		System.out.println("Sum of numbers of array = " +sum);
	}
}