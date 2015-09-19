package com.fun.swank.p40woker.parts;

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
class SwankyPanel extends JPanel {
  private final JTextArea output;
  private final JScrollPane scrollPane;

  SwankyPanel() {
    super(new BorderLayout());
    setOpaque(true);

    output = new JTextArea(5, 30);
    output.setEditable(true);
    scrollPane = new JScrollPane(output);

    add(scrollPane, BorderLayout.CENTER);

    // Prep for Button
    JButton toLower = new JButton("ToLower");
    toLower.addActionListener(new ToLowerActionListener());
    add(toLower, BorderLayout.WEST);

    JButton toUpper = new JButton("ToUpper");
    toUpper.addActionListener(new ToUpperActionListener());
    add(toUpper, BorderLayout.EAST);

    JButton hardWork = new JButton("Hard Work");
    hardWork.addActionListener(new HardWrokActionListener());
    add(hardWork, BorderLayout.SOUTH);
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

  private class HardWrokActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      HardWorker hardWorker = new HardWorker(output);
      hardWorker.execute();
    }
  }

}
