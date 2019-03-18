package Legato;

import java.util.*;
import java.util.regex.Pattern;


public class AnimalTest {


	public static void main(String[] args) {

		// TODO Auto-generated method stub


		Scanner s = new Scanner(System.in);

		Animal arr[] = null;


		while (true) {

			System.out.println("Please enter\n1-for new objects \n"

					+ "2 for displaying \n" + "3 for exit ");


			int option = s.nextInt();


			switch (option) {

			case 1:

				arr=addAnimals(arr);

				break;

			case 2:

				displayAnimals(arr);

				break;

			case 3:

				System.exit(0);

				break;

			default:

				System.out.println("Please enter correct option ");

				s.close();
			}

		}

	}


	public static Animal[] addAnimals(Animal[] arr) {

		int noa=0;
		Scanner s = new Scanner(System.in);

		System.out.println("please enter the no of objects to be created");

		int count = s.nextInt();


		arr = new Animal[count];


		for (int i = 0; i < count; i++) {

			System.out.println("Please enter animal name ");

			String name = s.next();
			
			reverse1(name);
			
			while(!validate(name))
			{
				System.out.println("Enter valid name");
				name= s.next();
				noa++;
				if(noa>2)
				{
					System.out.println("Exceeded max no of attempts");
					noa=0;
					System.exit(0);		
				}
							
			}
			

			System.out.println("Please enter animal breed ");


			String breed = s.next();
			
			
			
			while(!validate(breed))
			{
				System.out.println("Enter valid name");
				breed= s.next();
				noa++;
				if(noa>2)
				{
					System.out.println("Exceeded max no of attempts");
					noa=0;
					System.exit(0);		
				}
							
			}
			
			

			System.out.println("Please enter animal age ");


			int age = s.nextInt();


			Animal a1 = new Animal();


			System.out.println("Total no of objects =" + Animal.getCount());


			a1.setName(name);

			a1.setAge(age);

			a1.setBreed(breed);


			arr[i] = a1;

			
			

		}

		return arr;

		
	}


	private static void reverse(String name) {
		// TODO Auto-generated method stub
		
	}


	public static void displayAnimals(Animal[] arr) {

		System.out.println("the array is " + arr);


		if (arr != null) {

			for (int i = 0; i < arr.length; i++) {

				System.out.println(arr[i]);

			}

		} else {

			System.out.println("no objects to be displayed");

		}


	}
	
	public static boolean validate(String input)
	
	{
		
		if(Pattern.matches("^[a-zA-Z]+$", input))
			return true;
		else
			return false;
		
	}
	
	public static String reverse1 (String name) {
		
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
		 reverse= reverse + name.charAt(i);
		 System.out.println(reverse);
		}
		return reverse;	
	}

}