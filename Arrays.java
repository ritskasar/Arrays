import java.util.*;
class Arrays
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);

		System.out.println("Enter size of array");
		int size = in.nextInt();

		int numbers [] = new int[size];

		for(int i=0;i<size;i++)
		{
			numbers[i] = in.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			System.out.println(numbers[i]);
		}
	}
}