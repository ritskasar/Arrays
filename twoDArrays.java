import java.util.*;

class twoDArrays{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter limit of rows and column");
		int rows = in.nextInt();
		int colm = in.nextInt();
		System.out.println("Enter the numbers into array");

		// 2DArrays declaration..
		int numbers[][]=new int [rows][colm];

		//Input

		for(int i=0;i<rows;i++)              //rows
		{
			for(int j=0;j<colm;j++)          //columns
			{
				numbers[i][j]=in.nextInt();
			}
		}

		//output

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colm;j++)
			{
				System.out.print(numbers[i][j] +" ");
			}
			System.out.println();
		}
	}
}

