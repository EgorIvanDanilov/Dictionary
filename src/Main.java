import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Dictionary");
    Scanner scanner = new Scanner(new File("res/dict.txt"));
    String n = scanner.nextLine();
    System.out.println(" Our dictionary hat " + n + " words");
    System.out.println("Input number of words:");
  }
}
