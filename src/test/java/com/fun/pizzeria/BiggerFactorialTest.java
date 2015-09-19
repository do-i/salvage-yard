package com.fun.pizzeria;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by acorn on 9/19/15.
 */
public class BiggerFactorialTest {
  @Test
  public void of_21_justAboveLongRealm() {
    assertEquals("51090942171709440000", BiggerFactorial.of(21).toString());
  }

  @Test
  public void of_100_hugeNumberWayBeyondLongRealm() {
    assertEquals("933262154439441526816992388562667004907159682643816214685929638952175999932299" +
            "15608941463976156518286253697920827223758251185210916864000000000000000000000000",
        BiggerFactorial.of(100).toString());
  }

//  @Test
//  public void of_9863_edgeOfMemoryLimit() {
//    assertEquals(35112,
//        BiggerFactorial.of(9863).toString().length());
//  }
}