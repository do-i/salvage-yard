package com.fun.pizzeria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by acorn on 9/19/15.
 */
public class CombinationTest {
  private Combination combination;
  @Before
  public void setUp() {
    combination = new Combination(new Factorial());
  }

  @Test
  public void from_5and3_10() {
    assertEquals(10, combination.of(5, 3));
  }

  @Test
  public void from_10and1_10() {
    assertEquals(10, combination.of(10, 1));
  }

  @Test(expected = IllegalArgumentException.class)
  public void from_3and5_3isLessThan5() {
    combination.of(3, 5);
  }

  @Test(expected = IllegalArgumentException.class)
  public void from_zero() {
    combination.of(0, 0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void from_tooBig() {
    combination.of(10000, 8888);
  }
}