import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Dictionary");
    Scanner scanner = new Scanner(new File("res/dict.txt"));
    String n = scanner.nextLine();
    System.out.println(" Our dictionary hat " + n + " words");
    printMenu();
    Scanner scanner1 = new Scanner(System.in);
    byte choice = scanner1.nextByte();

    switch (choice) {
      case (1):
        System.out.println("Input number of words:");
        Byte m = inputBytePostNumber(); // ввод положительного числа
        for (int i = 0; i < m; i++) {
          System.out.println(scanner.nextLine());
        }
        break;
      case (2):

        break;
      default:
        System.out.println("Input 1 or 2");
        break;
    }


  }

  public static void printMenu() {
    System.out.println("What do you want?");
    System.out.println("1. Get the number of words");
    System.out.println("2. Get a accurate word");
    System.out.print("\n Input the number of menu point ");
  }

  public static Byte inputBytePostNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" ");
    byte n = scanner.nextByte();
    while (n <= 0) {
      System.out.println("Вы ввели отрицательное число. Введите число больше нуля:");
      n = scanner.nextByte();
    }
    return n;
  }
}
