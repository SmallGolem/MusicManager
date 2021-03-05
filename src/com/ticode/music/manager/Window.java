package com.ticode.music.manager;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Window {
		
	public static void setwindow(){
		
		JFrame window = new JFrame("Music Manager");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setIconImage(new ImageIcon("..\\logo.png").getImage());
		window.setMinimumSize(new Dimension(300, 200));
		window.setSize(600, 400);
		
		JMenuBar menu = new JMenuBar();
			JMenu file = new JMenu("File");
				JMenuItem open = new JMenuItem("Open");
				file.add(open);
			menu.add(file);
			JMenu edit = new JMenu("Edit");
			menu.add(edit);
			JMenu imp = new JMenu("Implementation");
			menu.add(imp);
			JMenu win = new JMenu("Window");
			menu.add(win);
			JMenu help = new JMenu("Help");
			menu.add(help);
			window.setJMenuBar(menu);
		
		window.setVisible(true);
		return;
	}
}

