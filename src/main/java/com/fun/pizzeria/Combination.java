package com.fun.pizzeria;

/**
 * Created by acorn on 9/19/15.
 */
public class Combination {
  private final Factorial factorial;
  public Combination(Factorial factorial) {
    this.factorial = factorial;
  }
  /**
   * Computes combination of
   * s! / (k! * (s-k)!)
   *
   * @param s Set size
   * @param k subset size (selection)
   */
  public long of(int s, int k) {
    if (s < k || s < 1) {
      throw new IllegalArgumentException("k <= s and s > 0");
    }
    long sFact = factorial.from(s);
    long kFact = factorial.from(k);
    long skFact = factorial.from(s - k);
    return sFact / (kFact * skFact);
  }
}
