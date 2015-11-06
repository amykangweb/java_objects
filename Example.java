public class Example {

  public static void main(String[] args) {
    // Your amazing code goes here...
    System.out.println("We are making a new Pez Dispenser.");
    PezDispenser dispenser = new PezDispenser("Donatello");
    System.out.printf("The dispenser character is %s\n",
      dispenser.getCharacterName());
    if (dispenser.isEmpty()) {
      System.out.println("It is currently empty.");
    }
    System.out.println("Loading...");
    dispenser.load();
    if (!dispenser.isEmpty()) {
      System.out.println("It is no longer emtpy.");
    }
  }
}
