package com.fun.swank.p10custom;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 * Created by acorn on 7/18/15.
 */
public class SwankPanel extends JPanel {
  public SwankPanel() {
    super(new BorderLayout());
    JToolBar toolBar = new JToolBar("Still draggable");
    toolBar.add(new JButton("Push"));
    toolBar.add(new JButton("Pull"));
    toolBar.add(new JButton("Press"));
    setPreferredSize(new Dimension(450, 130));
    add(toolBar, BorderLayout.NORTH);


//    add(scrollPane, BorderLayout.CENTER);
  }
}
