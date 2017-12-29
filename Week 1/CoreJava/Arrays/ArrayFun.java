import java.util.Arrays;

public class ArrayFun {
  public static void main(String[] args) {
    //Increment: unary operator
    int i = 1;  //i = 1
    int j = ++i;  // i = 2, j = 2
    int k = j++;  // i = 2, j = 3, k = 2
    System.out.println(i + " " + j + " " +k);

    //for loops
    for (int l = 0; l < 5; l++) {
      if (l == 2) {
        continue;
      }

      else if (l == 3) {
        break;
      }

      else {
        System.out.println(l);
      }
    }

    //Arrays
    //Elements must same type
    //Immutable block of contiguous data
    //Arrays can hold primitives or objects
    //empty indexes set to default
    //Wrapper class: Arrays

    int[] intArr = { 2, 3, 4 };
    //intArr = new int[4];
    int intArr2[];
    int []intArr3;

    int[][] intArr2D = {{2}, {3, 4}, {5, 6}};
    //intArr2D = new int[3][5];
    int intArr2DA[][];
    int[] intArr2DB[];

    //Traversing Array
    for (int c = 0; c < intArr.length; c++) {
      System.out.println(intArr[c]);
    }
    //For Each
    for (int q : intArr) {
      System.out.println(q);
    }

    //Traversing a 2D Array
    for (int w = 0; w < intArr2D.length; w++) {
      for (int e = 0; e < intArr2D[w].length; e++) {
        System.out.println(intArr2D[w][e]);
      }
    }

    System.out.println(intArr);
    System.out.println(Arrays.toString(intArr));

    int[] messyArray = {38, 9, 2, 74};
    Arrays.sort(messyArray);
    System.out.println(Arrays.toString(messyArray));

    //Binary search
    System.out.println(Arrays.binarySearch(messyArray, 9));

    //varargs
    varArgs("hello", 2, 4, 7, 65, 34, 19);

    //enum
    Days myDay = Days.MONDAY;
    System.out.println(Arrays.toString(Days.values()));
  }

  public static void varArgs(String str, int ...args) {
    for (int i : args)
      System.out.println(i);
  }
}

