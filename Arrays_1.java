import java.util.*;
class Arrays_1
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter limit of Arrays");
		int size = in.nextInt();

		int num[]=new int[size];
		System.out.println("Enter numbers into array");

		for(int i=0;i<size;i++)
		{
			num[i]=in.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			System.out.println(num[i]);
		}
	}
}
