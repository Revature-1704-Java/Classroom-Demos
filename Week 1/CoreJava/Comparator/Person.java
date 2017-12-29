public class Person implements Comparable<Person> {
  private int id;
  private String name;
  private int age;

  public int getId() {
    return this.id;
  }

  public Person(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public Person() { };

  public int compareTo(Person p) {
    if (this.age > p.age) {
      return 1;
    } else if (this.age < p.age) {
      return -1;
    } else {
      return 0;
    }
  }

  public String toString() {
    return "Person [id= " + id + " , name= " + name + " , age= " + age + "]";
  }
}