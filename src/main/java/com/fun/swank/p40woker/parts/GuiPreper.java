package com.fun.swank.p40woker.parts;

import javax.swing.JFrame;

/**
 * Created by acorn on 7/18/15.
 */
public class GuiPreper {
  private GuiPreper() {

  }

  public static void createAndShowGUI() {
    JFrame frame = new JFrame("Swanky Simple");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setJMenuBar(new SwankyMenuBar());
    frame.setContentPane(new SwankyPanel());

    //Display the window.
    frame.setSize(450, 260);
    frame.setVisible(true);
  }
}
