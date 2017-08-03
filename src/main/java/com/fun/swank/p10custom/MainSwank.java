package com.fun.swank.p10custom;

import javax.swing.SwingUtilities;

/**
 * Created by acorn on 7/18/15.
 */
public class MainSwank {
  public static void main(String... params) {
    // This invokeLater runs the runnable.run() method on EDT or Event Dispatching Thread
    // without blocking the initial thread or main thread
    SwingUtilities.invokeLater(SwankFrame::new);
  }
}
