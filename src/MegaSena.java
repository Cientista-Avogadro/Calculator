import ao.cientista.User;

public class MegaSena {

  public static void main(String[] args) {
    User user = new User();

    user.setIdade(1);
    user.setName("Cientista");

    System.out.println(user.getIdade() + " " + user.getName());
  }
}
