package Legato;
 
public class NonRepeatingChar 
{
	public static void main(String args[]) {

		String vai = "vvaidhya"; 

		char arr[] = vai.toCharArray();

		boolean b = false;

		int position = 0;

		for (int i = 0; i < arr.length; i++)
		{

		for (int j = 0; j < arr.length; j++)
		{

		if (i == j) {

		continue;

		} else {

		if (arr[i] == arr[j]) {

		b = false;

		break;

		} else {

		b = true;



		}

		}

		}

		if (b) {

		System.out.println(arr[position] );

		break;

		}

		}

		}
}