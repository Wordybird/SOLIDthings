package wizard_management;

public abstract class FlyingObject {
  
  String name;

  public FlyingObject(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
  
}