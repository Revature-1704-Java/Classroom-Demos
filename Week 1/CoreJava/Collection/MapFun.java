import java.util.*;
import java.util.Map.Entry;

public class MapFun {
  public static void main(String[] args) {
    //Maps don't have iterators
    Map<Integer, String> hashMap = new HashMap<>();
    hashMap.put(1, "Doug");
    hashMap.put(2, "Skeeter");
    hashMap.put(3, "Patty");
    hashMap.put(3, "Roger");

    System.out.println(hashMap);
    System.out.println("singleVal: " + hashMap.get(2));

    //Using entry
    for(Entry<Integer, String> entry : hashMap.entrySet()) {
      System.out.println(entry.getKey() + "\t" + entry.getValue());
    }

    //Using key SET
    Set<Integer> keys = hashMap.keySet();
    for (Integer key : keys) {
      System.out.println(key + ": " + hashMap.get(key));
    }

    Hashtable<String, String> characters = new Hashtable<>();

    characters.put("Jon", "Snow");
    characters.put("Arya", "Stark");

    Enumeration firstNames;
    String str;

    //Using keys()
    firstNames = characters.keys();
    while(firstNames.hasMoreElements()) {
      str = (String) firstNames.nextElement();
      System.out.println(str + " " + characters.get(str));
    }
  }
}