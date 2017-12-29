import java.lang.reflect.Field;

public class ReflectionFun {
  public static void main(String[] args) throws Exception{
    Class<?> clazz = Class.forName("Person");
    System.out.println(clazz.getName());
    
    //print fields
    Field[] fields = clazz.getDeclaredFields();
    for (Field f : fields) {
      System.out.println(f.getName());
    }

    Person joe = (Person) clazz.newInstance();
    System.out.println(joe);

    Field age = clazz.getDeclaredField("age");
    age.setAccessible(true);
    age.set(joe, -5000);
    System.out.println(joe);
  }
}