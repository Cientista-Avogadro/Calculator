public class Calculate {

  public static void main(String[] args) {
    args = new String[] { "Somar", "1", "2" };
    int x = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);

    if (args[0].equals("Somar")) {
      Sum(x, y);
    } else if (args[0].equals("Subtrair")) {
      Minus(x, y);
    } else if (args[0].equals("Multiplicar")) {
      Multiply(x, y);
    } else if (args[0].equals("Dividir")) {
      Divide(x, y);
    } else {
      System.out.println("Expressão não encontrada");
    }
  }

  static void Sum(int x, int y) {
    System.out.println(x + y);
  }

  static void Minus(int x, int y) {
    System.out.println(x - y);
  }

  static void Multiply(int x, int y) {
    System.out.println(x * y);
  }

  static void Divide(int x, int y) {
    System.out.println(x / y);
  }
}
