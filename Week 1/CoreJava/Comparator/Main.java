import java.util.*;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person(4, "Lakshmi", 328);
    Person p2 = new Person(1, "Bhraman", 520);
    Person p3 = new Person(7, "Shiva", 410);

    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    persons.add(p3);

    for (Person p : persons) {
      System.out.println(p);
    }

    Collections.sort(persons, new IdComparator());
    for (Person p : persons) {
      System.out.println(p);
    }
  }
}