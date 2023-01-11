public class App {
    public static void main(String[] args) {
      User user = new User();
      Address address = new Address();

      user.setFirstName("Bruno");
      user.setLastName("Kohn");
      address.setCountry("Brasil");

      System.out.println(user.getFirstName());
      System.out.println(address.getCountry());

        
    }
}