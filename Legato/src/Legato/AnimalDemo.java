package Legato;

/*import java.util.*;
public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many details r required");
		Scanner scn=new Scanner(System.in);
		//int n= scn.nextInt();
		int n=3;
		Animal[] a1= new Animal[n];
		
		for(int i=0;i<=n;i++) {
		
		System.out.println("Enter animal details");
		Scanner s=new Scanner(System.in);
		String name= s.next();
		String breed=s.next();
		int age=s.nextInt();
	
		
		Animal a= new Animal();
		a.setName(name);  //a1.name="dog
		a.setBreed(breed);  //a1.breed="dog"
		a.setAge(age);  //a1.age=5
		
		//System.out.println(a.getName()+a.getBreed()+a.getAge());
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a1[i].getName()+a1[i].getBreed()+a1[i].getAge());
		}
		//s.close();
		/*Animal a2= new Animal("cat","Cat",12);
		a1=a2;
		a1.getAnimalLifeStyle();
		a2.getAnimalLifeStyle();
	}

}*/


import java.util.*;
public class AnimalDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int count=3;
	Animal[] d=new Animal[count];
	for (int i=0; i<count; i++) {
		System.out.println("Name:");
		String name=sc.next();
		System.out.println("Breed:");
		String breed=sc.next();
		System.out.println("Age:");
		int age=sc.nextInt();
		
	Animal e=new Animal();
	e.setName(name);
	e.setBreed(breed);
	e.setAge(age);
	d[i]=e;
	}
	
	for (int i=0;i<count;i++) {
		System.out.println("Name:"+d[i].getName()+" "+"Breed: "+d[i].getBreed()+" "+"Age:"+d[i].getAge());
	}
	/*Animal b=new Animal("Pig","Pink",1,2);
	Animal c=a;
	a=b;
	a.getAnimalLifeStyle();
	b.getAnimalLifeStyle();
	c.getAnimalLifeStyle();
*/
	}
}