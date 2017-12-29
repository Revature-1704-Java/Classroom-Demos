public class GenericFun {
  public static void main(String[] args) {
    Person peter = new Person();
    peter.setName("Peter");

    Person anotherPeter = (Person) someMethod(peter);
    System.out.println(anotherPeter.getName());

    anotherPeter = someBetterMethod(peter);
    System.out.println(anotherPeter.getName());
  }

  //Generics without using generics
  public static Object someMethod(Object obj) {
    return obj;
  }

  //Generics with using generics
  public static <T> T someBetterMethod(T thing) {
    return thing;
  }
}