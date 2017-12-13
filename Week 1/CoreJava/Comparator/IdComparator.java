import java.util.Comparator;

public class IdComparator implements Comparator<Person> {
  public int compare(Person p1, Person p2) {
    if (p1.getId() > p2.getId()) {
      return 1;
    } else if (p1.getId() < p2.getId()) {
      return -1;
    } else {
      return 0;
    }
  }
}