package wizard_management;

public class Muggle {
  String name;
  Flyable flyable;
  Protectable protection;

  public Muggle(String name, Flyable flyable) {
    this.name = name;
    this.flyable = flyable;
    this.protection = protection;
  }

  public void setRide (Flyable flyable) {
    this.flyable = flyable;
  }

  public String getName() {
    return this.name;
  }

  public Flyable getFlyable() {
    return this.flyable;
  }

  public String fly() {
    return this.flyable.fly();
  }

  public void setProtection(Protectable protection) {
    this.protection = protection;
  }

  public Protectable getProtection() {
    return this.protection;
  }

  public String protect() {
    return this.protection.protect();
  }

}