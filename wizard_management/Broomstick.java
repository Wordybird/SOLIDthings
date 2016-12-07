package wizard_management;

public class Broomstick extends CleaningImplement implements Flyable {
// Extends must come before any implements you choose to add if you have both in one class.

  int speed;

  public Broomstick(String brand, int speed) {
    super(brand);
    this.speed = speed;
  }

  public int getSpeed() {
    return this.speed;
  }

  public String fly() {
    return "mounting broom, running, skipping, flying!";
  }

}