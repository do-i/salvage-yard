package com.fun.pizzeria;

import com.google.common.collect.ImmutableSet;

/**
 * Created by acorn on 9/19/15.
 */
public class Main {
  public static void main(String... params) {
    ImmutableSet<String> s1 = ImmutableSet.of("Onion", "Pepper", "Sausage");
    ImmutableSet<String> s2 = ImmutableSet.of("Sausage", "Onion", "Pepper");
    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);
    System.out.println("Are they same? " + s1.equals(s2));
  }
}
