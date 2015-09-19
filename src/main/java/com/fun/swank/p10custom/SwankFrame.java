package com.fun.swank.p10custom;

import javax.swing.JFrame;

/**
 * Created by acorn on 7/18/15.
 */
public class SwankFrame extends JFrame {
  public SwankFrame() {
    super("Swank App");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getRootPane().setContentPane(new SwankPanel());
    setVisible(true);
  }
}
