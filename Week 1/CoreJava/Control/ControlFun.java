public class ControlFun {
  public static void main(String[] args) {
    //increment is a unary operation
    //binary operations (1+1)

    //logical operators/comparators:
    // <, >, <=, >=, ==, !=, |, ||, &, &&
    //||, && = short circuit 
    //(only first checked if true)
    boolean x, y;
    if((x = 1 > 0) | (y = 0 > 1)) {
      System.out.println(x + " " + y);
    }

    //ternary operator
    int val1 = 1;
    int val2 = 2;
    int result;
    boolean someCondition = true;
    result = someCondition ? val1 : val2;
    System.out.println(result);

    int day = 1;
    switch (day) {
      //default: System.out.println("Nothing!"); //break;
      case 2: System.out.println("Tuesday"); //break;
      case 3: System.out.println("Wednesday"); //break;
    }

  }
}