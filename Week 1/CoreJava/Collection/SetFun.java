import java.util.*;

public class SetFun {
  public static void main(String[] args) {
    Set<Integer> hashSet = new HashSet<>();
    hashSet.add(5);
    hashSet.add(5);
    hashSet.add(2);
    hashSet.add(17);
    hashSet.add(6);

    System.out.println("HashSet: " + hashSet);
    System.out.println("Size: " + hashSet.size());

    Set<Integer> treeSet = new TreeSet<>();
    treeSet.addAll(hashSet);

    System.out.println("TreeSet: " + treeSet);
  }
}