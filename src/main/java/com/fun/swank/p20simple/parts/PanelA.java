package com.fun.swank.p20simple.parts;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Created by acorn on 7/18/15.
 */
class PanelA {
  JTextArea output;
  JScrollPane scrollPane;
  String newline = "\n";

  Container createContentPane() {

    //Create the content-pane-to-be.
    JPanel contentPane = new JPanel(new BorderLayout());
    contentPane.setOpaque(true);

    //Create a scrolled text area.
    output = new JTextArea(5, 30);
    output.setEditable(true);
    scrollPane = new JScrollPane(output);

    //Add the text area to the content pane.
    contentPane.add(scrollPane, BorderLayout.CENTER);
    contentPane.add(new JButton("Push"), BorderLayout.WEST);
    contentPane.add(new JButton("Pull"), BorderLayout.EAST);
    return contentPane;
  }

}
