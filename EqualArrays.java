import java.util.*;
import java.util.Arrays;
class EqualArrays
{
	public static void main(String []args)
	{
		Scanner in = new Scanner (System.in);

		System.out.println("Enter size of array 1: ");
        int n = in.nextInt();
		System.out.println("Enter the numbers into array 1 : ");
		int arr1[]=new int[n];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=in.nextInt();
		}


		System.out.println("Enter size of array 2: ");
        int m = in.nextInt();
		System.out.println("Enter the numbers into array 2 : ");
		int arr2[]=new int[m];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=in.nextInt();
		}

		boolean x = Arrays.equals(arr1,arr2);

		if(x==true)
		{
			System.out.println("Both Arrays are equal");
		}else{
			System.out.println("Both arrays are not equal");
		}

	}
}

