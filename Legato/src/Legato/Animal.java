package Legato;

public class Animal {

	//Encapsulation
	private String name;
	private String breed;
	private int age;
	private static int count;
	
	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Animal(){
		count++;
	}
	
	Animal(String name,String breed,int age,int count){
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.count=count++;
		System.out.println("Name="+this.name+" Breed="+this.breed+" Age="+this.age);
	}
	
	void getAnimalLifeStyle() {
		//int a;
		System.out.println("Name="+this.name+" Breed="+this.breed+" Age="+this.age);
	}
}