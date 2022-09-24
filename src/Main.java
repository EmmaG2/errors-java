import lib.Calculator;
import lib.ReadNames;
import lib.Users;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Users u = new Users();
    Calculator c = Calculator.getInstance();
    
    try {
      u.addUser("Emmanuel", 0);
      System.out.println(c.dividir(34.45, 3));
      ReadNames.readFile("No existo.txt");
    } catch (ArrayIndexOutOfBoundsException | ArithmeticException | FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage() + " " + Arrays.toString(e.getStackTrace()));
    }
  }
}
