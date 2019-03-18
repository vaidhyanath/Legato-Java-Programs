package Legato;

import java.io.File;  
import java.io.IOException;  

public class Filehandling { 
  public static void main(String[] args) { 
    try { 
      File myObj = new File("C:\\eclips code\\Legato\\src\\Legato\\abc.text"); 
      if (myObj.createNewFile()) { 
        System.out.println("File created: " + myObj.getName()); 
      } else { 
        System.out.println("File already exists."); 
      } 
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      
    } 
  } 
}