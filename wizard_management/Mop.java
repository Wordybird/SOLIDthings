package wizard_management;

public class Mop extends CleaningImplement implements Protectable {
  
  public Mop(String brand) {
    super(brand);
  }

  public String protect() {
    return "Step back, I've got... a mop?!";
  }

}