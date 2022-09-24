package lib;

public class Calculator {
  private static Calculator instance;
  private Calculator() {}
  
  public static Calculator getInstance() {
    if (instance == null) {
      instance = new Calculator();
    }
    
    return instance;
  }
  
  public double dividir(double a, double b) throws ArithmeticException {
    if (a == 0 || b == 0) throw new ArithmeticException("No puedes dividir entre 0");
    
    return  a / b;
  }
  
}
