package Legato;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {  
  public static void main(String[] args) {  
    try {  
      FileWriter myWriter = new FileWriter("C:\\eclips code\\Legato\\src\\Legato\\abc.text");
      myWriter.write("Hello am vaidhyanath K S whovever you are i will find you and kill you ");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 
