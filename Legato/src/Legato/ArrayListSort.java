package Legato;

import java.util.*;


public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a=new ArrayList();
		a.add(12);
		a.add(20);		
		a.add(50);
		a.add(40);		
		a.add(30);
		int temp=0;
		
		System.out.println(a);
		
		//using inbuilt method
		 /*Collections.sort(a); 
		 System.out.println(a);*/
		
		//without collection
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<a.size()-1;j++)
			{
				 if ((int)a.get(j) >(int) a.get(j + 1)) 
				 {
	                  temp = (int)a.get(j);
	                  a.set(j, a.get(j + 1));
	                  a.set(j + 1, temp);
	               }
			}
		}
		System.out.println(a);
	}

}