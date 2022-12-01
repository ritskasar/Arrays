import java.util.*;
class twoDArrayMatrix
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the limit of rows and columns of matrix");
		int rows=in.nextInt();
		int colm=in.nextInt();
		System.out.println("Enter the numbers into Matrix");

		int numbers[][]=new int[rows][colm];     //array declaration

		//Input

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colm;j++)
			{
				numbers[i][j]=in.nextInt();
			}
		}

		//Output

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colm;j++)
			{
				System.out.print(numbers[i][j] +" ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Enter the number which you want to find..");
		int x = in.nextInt();

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colm;j++)
			{

				if(numbers[i][j]== x)
				{
					System.out.println("Number is found in array at " +"(" +i +"," +j +")" );
				}
			}
		}

	}
}

