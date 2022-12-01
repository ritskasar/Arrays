import java.util.*;
import java.util.Arrays;
class NameArray
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		//int size=in.nextInt();
		System.out.println("Enter names of Students");
		String names[] = new String[5];

		for(int i=0 ; i<names.length ; i++)
		{
			names[i]=in.next();
		}

		System.out.println("Names of Students : " );

		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
}
