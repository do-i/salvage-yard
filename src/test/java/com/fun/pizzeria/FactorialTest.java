package com.fun.pizzeria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by acorn on 9/19/15.
 */
public class FactorialTest {
  private Factorial factorial;
  @Before
  public void setUp() {
    factorial = new Factorial();
  }

  @Test
  public void from_valid() {
    assertEquals(120, factorial.from(5));

    // another way
    long result = factorial.from(5);
    for (int i = 5; i > 0; i--) {
      result /= i;
    }
    assertEquals(1, result);
  }

  @Test
  public void from_zero_one() {
    assertEquals(1, factorial.from(0));
  }

  @Test(expected = IllegalArgumentException.class)
  public void from_negative() {
    factorial.from(-5);
  }

  @Test(expected = IllegalArgumentException.class)
  public void from_tooBig() {
    factorial.from(21);
  }
}