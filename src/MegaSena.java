public class MegaSena {

  public static void main(String[] args) {
    int x;
    if (true) {
      int y; //variavel local ou de escopo
      x = 10;
    } else {
      x = 2;
    }
    System.out.println(x);
  }
}
