public class Example {

  public static void main(String[] args) {
    // Your amazing code goes here...
    System.out.println("We are making a new Pez Dispenser.");
    PezDispenser dispenser = new PezDispenser("Donatello");
    System.out.printf("The dispenser character is %s\n",
      dispenser.getCharacterName());
  }
}
