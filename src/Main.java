import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Dictionary");
    Scanner scanner = new Scanner(new File("res/dict.txt"));
    String n = scanner.nextLine();
    int total = Integer.parseInt(n);
    System.out.println(" Our dictionary hat " + (total+1) + " words");
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
        System.out.println("Input a word");
        String word = scanner1.next();
        for (int i = 0; i < total; i++) {
          //Доделать здесь
          String word1 =scanner.next();
          if (word1.equals(word)){
            String definition = scanner.nextLine();
            System.out.println(definition);
          } else {
            System.out.println("Word '" + word + "' not found ");
          }
        }
        break;
      default:
        System.out.println("Input 1 or 2");
        break;
    }
    scanner.close();
    scanner1.close();
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
