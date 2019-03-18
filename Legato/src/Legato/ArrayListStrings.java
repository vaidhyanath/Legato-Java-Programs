package Legato;

import java.util.ArrayList;
import java.util.List;
public class ArrayListStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a=new ArrayList();
		a.add("vai");
		a.add("arp");
		a.add("vam");
		a.add("jp");
		
		String temp;
		int i;
		System.out.println(a);
		
		
		for( i=0; i<a.size()/2; i++)
		{
		temp =(String)a.get(i);
		a.set(i,a.get(a.size()-1-i));
		a.set(a.size()-1-i, temp);
		
		}
		System.out.println(a);
	}

}