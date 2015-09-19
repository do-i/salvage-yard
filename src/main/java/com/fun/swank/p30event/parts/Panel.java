package com.fun.swank.p30event.parts;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Created by acorn on 7/18/15.
 */
class Panel extends JPanel {
  private final JTextArea output;
  private final JScrollPane scrollPane;

  Panel() {
    //Create the content-pane-to-be.
    super(new BorderLayout());
    setOpaque(true);

    //Create a scrolled text area.
    output = new JTextArea(5, 30);
    output.setEditable(true);
    scrollPane = new JScrollPane(output);

    //Add the text area to the content pane.
    add(scrollPane, BorderLayout.CENTER);

    // Prep for Button
    JButton toLower = new JButton("ToLower");
    toLower.addActionListener(new ToLowerActionListener());
    add(toLower, BorderLayout.WEST);

    JButton toUpper = new JButton("ToUpper");
    toUpper.addActionListener(new ToUpperActionListener());
    add(toUpper, BorderLayout.EAST);
  }

  private class ToLowerActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      output.setText(output.getText().toLowerCase());
    }
  }

  private class ToUpperActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      output.setText(output.getText().toUpperCase());
    }
  }

}
