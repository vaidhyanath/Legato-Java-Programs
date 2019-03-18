package Legato;

import java.util.Scanner;

public class NameVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name");
		String s=scn.next();
		try {
			pattern(s);
		}
		catch(NameInvalidException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static void pattern (String s) throws NameInvalidException
	{
		String pattern="^[A-Za-z]+$";
		if(s.matches(pattern))
		{
			System.out.println("Correct name");
		}
		else
		{
			System.out.println("Please enter name in a correct format");
			throw new NameInvalidException("Name invalid");
		}
	}
}
