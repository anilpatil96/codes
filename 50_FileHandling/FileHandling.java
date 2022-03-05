import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileHandling {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

	try {
		File myObj = new File("filename.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
		  String data = myReader.nextLine();
		  System.out.println(data);
		}
		myReader.close();
	  } catch (FileNotFoundException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
  }
}
}