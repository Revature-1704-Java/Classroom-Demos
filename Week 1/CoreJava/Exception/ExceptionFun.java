public class ExceptionFun {
  public static void main(String[] args) {
    try {
      System.out.println("Hello");
    } catch (NullPointerException ex) {
      System.out.println("catch");
    } finally {
      System.out.println("finally");
    }

    try {
      //throw new Exception();
      //throw new MyException();
      doesThing();
    } catch (MyException ex) {
      System.out.println(ex.getMessage());
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
      System.out.println("finally");
    }
  }

  static void doesThing() throws MyException {
    throw new MyException("throwing my exception, deal with it");
  }
}