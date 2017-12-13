import java.util.*;

public class ListFun {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(5);
    arrayList.add(5);
    arrayList.add(17);
    arrayList.add(2);
    arrayList.add(6);

    System.out.println("ArrayList: " + arrayList);
    System.out.println("SingleValue: " + arrayList.get(2));

    List<Integer> linkedList = new LinkedList<>();
    Deque<Integer> dequeLinkedList = new LinkedList<>();
    Queue<Integer> queueLinkedList = new LinkedList<>();
    LinkedList<Integer> normalLinkedList = new LinkedList<>();

    linkedList.add(5);
    dequeLinkedList.add(5);
    normalLinkedList.add(2);

    System.out.println(normalLinkedList instanceof Queue);

    System.out.println("\nQueue (FIFO): ");
    queueLinkedList.add(7);
    queueLinkedList.add(64);
    queueLinkedList.add(15);
    queueLinkedList.remove();
    System.out.println("Queue: " + queueLinkedList);

    //Iterator: filters or iterates over Collection
    //methods: boolean hasNext();, <> next();, void remove();
    System.out.println("\nArrayList: " + arrayList);
    filter(arrayList);
    System.out.println("\nArrayList: " + arrayList);

  }

  static void filter(Collection<Integer> c) {
    for (Iterator<Integer> it = c.iterator(); it.hasNext();) {
      if (it.next() > 3)
        it.remove();
    }
  }
}