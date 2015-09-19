package com.fun.pizzeria;

import java.math.BigInteger;

/**
 * Created by acorn on 9/19/15.
 */
public class BiggerFactorial {
  public static BigInteger of(int n) {
    validate(n);
    return of(BigInteger.valueOf(n));
  }

  private static BigInteger of(BigInteger bInt) {
    if (BigInteger.ZERO.equals(bInt)) {
      return BigInteger.ONE;
    }
    return bInt.multiply(of(bInt.subtract(BigInteger.ONE)));
  }

  private static void validate(int n) {
    if (n < 0 ) {
      throw new IllegalArgumentException(n + " should be non negative integer");
    }
  }
}
