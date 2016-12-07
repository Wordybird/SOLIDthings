package wizard_management;

public class Plane extends FlyingObject implements Flyable {

  public Plane(String name) {
    super(name);
  }

  public String fly() {
    return "Revving the engines, driving down the runway, lift off!";
  }

}