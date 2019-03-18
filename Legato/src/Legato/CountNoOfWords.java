package Legato;


	public class CountNoOfWords {
	   public static void main(String[] args) {
	      String s1 = "     dsj doojs    oijdojo ooj djoj     ";
	    System.out.println(s1);
	  
	      System.out.println(s1.trim().split("[ ]+").length);
	   } 
	}

