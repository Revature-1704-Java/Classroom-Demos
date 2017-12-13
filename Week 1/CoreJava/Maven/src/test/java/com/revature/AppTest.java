package com.revature;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class AppTest {
  @Test
  public final void twoNumbersReturnSum() {
    int sum = App.add("1,2");
    assertEquals(3, sum);
  }

  @Test(expected = RuntimeException.class)
  public final void moreThanTwoException() {
    App.add("1, 2, 3");
  }

  @Test(expected = RuntimeException.class)
  public final void nonNumberException() {
    App.add("Hello");
  }

  @Test
  public final void emptyInputIsZero() {
    assertEquals(0, App.add(""));
  }

  @Test
  public final void oneOperandReturnsitself() {
    assertEquals(4, App.add("4"));
  }

  @Test
  public final void handlesWhiteSpace() {
    assertEquals(7, App.add("  3, 4 "));
  }
}