package com.fun.swank.p20simple;

import javax.swing.SwingUtilities;

import com.fun.swank.p20simple.parts.GuiPreper;

/**
 * Created by acorn on 7/18/15.
 */
public class MainSimpleSwank {

  public static void main(String... params) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        GuiPreper.createAndShowGUI();
      }
    });
  }
}
