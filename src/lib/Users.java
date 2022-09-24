package lib;

public class Users {
  String[] users = new String[2];
  
  public void addUser(String name, int position) throws ArrayIndexOutOfBoundsException {
    if (position < 0 || position > 2) throw new ArrayIndexOutOfBoundsException("La posición está fuera del rango permitido");
    users[position] = name;
  }
}
