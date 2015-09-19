package com.fun.pizzeria;

/**
 * Created by acorn on 9/19/15.
 */
public class Factorial {
  public long from(int n) {
    validate(n);
    if (n == 0) {
      return 1;
    }
    return n * from(n-1);
  }

  protected void validate(int n) {
    if (n < 0 || 20 < n) {
      throw new IllegalArgumentException(n + " should be between 0 and 20");
    }
  }
}
