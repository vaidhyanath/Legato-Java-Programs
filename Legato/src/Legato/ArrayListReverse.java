package Legato;

import java.util.*;
public class ArrayListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a=new ArrayList();
		a.add(12);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		int temp=0,i;
		System.out.println(a);
		
		
		for( i=0; i<a.size()/2; i++)
		{
		temp =(int)a.get(i);
		a.set(i,a.get(a.size()-1-i));
		a.set(a.size()-1-i, temp);
		
		}
		System.out.println(a);
		/*for(i=0;i<a.length;i++) 
		{
		System.out.println(a[i]);
		}*/
	}

}