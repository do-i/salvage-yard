package com.fun.pizzeria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by acorn on 9/19/15.
 */
public class BigComboTest {

  @Test
  public void of() {
    assertEquals(1143,
        BigCombo.of(8888, 777).toString().length());
  }
}