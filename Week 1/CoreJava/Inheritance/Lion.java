public class Lion extends Cat implements Shed{
  public void makeSound() {
    System.out.println("ROAR");
  }

  public void kill() {
    System.out.println("You Died!");
  }

  public boolean canShed() {
    return true;
  }

  public boolean canShed(String str) {
    return false;
  }

  public int numberOfTeeth() {
    return 50;
  }

  public int numberOfTeeth(int teeth) {
    return teeth;
  }

  public int numberOfTeeth(Integer teeth) {
    System.out.println(teeth);
    return teeth;
  }
}