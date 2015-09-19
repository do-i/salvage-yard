package com.fun.swank.p30event.parts;

import javax.swing.JFrame;

/**
 * Created by acorn on 7/18/15.
 */
public class GuiPreper {
  private GuiPreper() {

  }

  public static void createAndShowGUI() {
    //Create and set up the window.
    JFrame frame = new JFrame("Swanky Simple");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Create and set up the content pane.
    frame.setJMenuBar(new MenuBar());
    frame.setContentPane(new Panel());

    //Display the window.
    frame.setSize(450, 260);
    frame.setVisible(true);
  }
}
