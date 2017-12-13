public class StringFun {
  public static void main (String[] args) {
    //String literals may have 0 or more characters
    //Strings are immutable, cannot be edited
    //stored in String Pool, collection of uniques strings
    //compiler searches pool, and returns string if exists
    //or creates if not
    //(String).equals(comparedString), == compares the reference

    //char array to String
    char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
    String helloString = new String(helloArray);
    System.out.println(helloString);

    String str = "hello";
    //String str2 = "hello";
    //String str2 = str;
    String str2 = new String("hello");
    System.out.println(str.equals(str2));
    System.out.println(str == str2);

    //java.lang.StringBuilder
    //Mutable sequence of characters, not threadsafe

    //java.lang.StringBuffer
    //same, but threadsafe (much slower)
  }
}