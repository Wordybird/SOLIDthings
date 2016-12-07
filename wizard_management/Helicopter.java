package wizard_management;

public class Helicopter extends FlyingObject implements Flyable {

  public Helicopter(String name) {
    super(name);
  }

  public String fly() {
    return "Spinning the propellors, generating speed, lift off!";
  }

}