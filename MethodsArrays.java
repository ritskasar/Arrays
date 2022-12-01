import java.util.*;
import java.util.Arrays;
class MethodsArrays
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any size of array");
		int size = in.nextInt();

		int numbers[] = new int[size];  //declaration of array
		System.out.println("Enter "+size +" numbers into array : ");

		for(int i=0;i<size;i++)
		{
			numbers[i] = in.nextInt();
		}

		System.out.println("Enter number which you want to find from array");
		int n = in.nextInt();

		int x = Arrays.binarySearch(numbers,n);    // binarySearch method

		if(x>=0)
		{
			System.out.println(n +" Is found at " +x +" index");
		}else{
			System.out.println(n +" Is not found at array . ");
		}

/*
        System.out.println("Enter number which you want to change from array ");

		Arrays.fill(numbers,n);          //fill() Method...

		for(int i=0;i<size;i++)
		{
			System.out.println(Arrays.toString(numbers));
		}

*/
		System.out.println("Sorted Integers" );

		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++)
		{
		System.out.println(numbers[i]);
	    }


	}
}
