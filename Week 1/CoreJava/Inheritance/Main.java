public class Main {
  public static void main(String[] args) {
    Lion l = new Lion();
    l.setName("Simba");
    l.makeSound();
    l.kill();

    Cat c = new Lion();
    c.setName("Mufasa");
    c.makeSound();
    Lion newLion = (Lion) c;
    newLion.kill();

    newLion.numberOfTeeth(new Integer(5));
  }
}