package wizard_management;

public abstract class FlyingObjects {
  
  String name;

  public FlyingObject(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
  
}