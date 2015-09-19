package com.fun.swank.p40woker;

import javax.swing.SwingUtilities;

import com.fun.swank.p40woker.parts.GuiPreper;

/**
 * Created by acorn on 7/18/15.
 * More sample swing code can be found at
 * http://zetcode.com/tutorials/javaswingtutorial/firstprograms/
 * http://cs.nyu.edu/~yap/classes/visual/03s/lect/l7/
 */
public class MainSwankyWorker {

  public static void main(String... params) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        GuiPreper.createAndShowGUI();
      }
    });
  }
}
