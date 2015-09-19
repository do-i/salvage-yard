package com.fun.swank.p40woker.parts;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

/**
 * Created by acorn on 7/18/15.
 */
class SwankyMenuBar extends JMenuBar {
  SwankyMenuBar() {
    JMenu menu, submenu;
    JMenuItem menuItem;
    JRadioButtonMenuItem rbMenuItem;
    JCheckBoxMenuItem cbMenuItem;

    menu = new JMenu("A Menu");
    menu.setMnemonic(KeyEvent.VK_A);
    menu.getAccessibleContext().setAccessibleDescription(
        "The only menu in this program that has menu items");
    super.add(menu);

    menuItem = new JMenuItem("A text-only menu item",
        KeyEvent.VK_T);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_1, ActionEvent.ALT_MASK));
    menuItem.getAccessibleContext().setAccessibleDescription(
        "This doesn't really do anything");
    menu.add(menuItem);
    menu.addSeparator();
    ButtonGroup group = new ButtonGroup();
    rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
    rbMenuItem.setSelected(true);
    rbMenuItem.setMnemonic(KeyEvent.VK_R);
    group.add(rbMenuItem);
    menu.add(rbMenuItem);

    rbMenuItem = new JRadioButtonMenuItem("Another one");
    rbMenuItem.setMnemonic(KeyEvent.VK_O);
    group.add(rbMenuItem);
    menu.add(rbMenuItem);

    //a group of check box menu items
    menu.addSeparator();
    cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
    cbMenuItem.setMnemonic(KeyEvent.VK_C);
    menu.add(cbMenuItem);
    cbMenuItem = new JCheckBoxMenuItem("Another one");
    cbMenuItem.setMnemonic(KeyEvent.VK_H);
    menu.add(cbMenuItem);
    menu = new JMenu("Another Menu");
    menu.setMnemonic(KeyEvent.VK_N);
    menu.getAccessibleContext().setAccessibleDescription(
        "This menu does nothing");
    super.add(menu);
    menu.addSeparator();
    submenu = new JMenu("A submenu");
    submenu.setMnemonic(KeyEvent.VK_S);
    menuItem = new JMenuItem("An item in the submenu");
    menuItem.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_2, ActionEvent.ALT_MASK));
    submenu.add(menuItem);
    menuItem = new JMenuItem("Another item");
//    menuItem.addActionListener(this);
    submenu.add(menuItem);
    menu.add(submenu);
  }
}
