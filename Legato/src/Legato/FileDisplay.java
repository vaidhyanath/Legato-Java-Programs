package Legato;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class FileDisplay { 
  public static void main(String[] args) throws IOException { 
	  FileOutputStream fos = null;
    try {
      File myObj = new File("C:\\eclips code\\Legato\\src\\Legato\\abc.text");
      Scanner myReader = new Scanner(myObj); 
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    finally {
        // releases all system resources from the streams
        if(fos!=null)
           fos.close();
  } 
}
}