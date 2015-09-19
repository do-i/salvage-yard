package com.fun.pizzeria;

import java.math.BigInteger;

/**
 * Created by acorn on 9/19/15.
 */
public class BigCombo {
  public static BigInteger of(int s, int k) {
    BigInteger sFact = BiggerFactorial.of(s);
    BigInteger kFact = BiggerFactorial.of(k);
    BigInteger skFact = BiggerFactorial.of(s-k);
    return sFact.divide((kFact.multiply(skFact)));
  }
}
