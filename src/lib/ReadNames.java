package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadNames {
  public static void readFile(String file) throws FileNotFoundException {
    InputStream ins = new FileInputStream(file);
    Scanner obj = new Scanner(ins);
    while (obj.hasNextLine()) System.out.println(obj.nextLine());
  }
}
