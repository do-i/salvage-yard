package com.fun.swank.p30event;

import javax.swing.SwingUtilities;

/**
 * Created by acorn on 7/18/15.
 */
public class MainSwankyEvent {

  public static void main(String... params) {
    SwingUtilities.invokeLater(com.fun.swank.p30event.parts.GuiPreper::createAndShowGUI);
  }
}
