package command;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class NotePad implements ActionListener{
	
	private JMenu file;
	private JMenuItem _new, open, save, saveas, exit;
	private JMenuBar bar;
	private JTextArea text;
	private JFrame frame;
	
	public NotePad() {
		file = new JMenu("File");
		_new = new JMenuItem("New");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		saveas = new JMenuItem("SaveAs");
		exit = new JMenuItem("Exit");
		bar = new JMenuBar();
		text = new JTextArea();
		
		file.add(_new);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.add(exit);
		bar.add(file);
		
		frame = new JFrame("NotePad");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setJMenuBar(bar);
		frame.add(text);
		frame.setBounds((1280-200)/2, (1024-150)/2, 200, 150);
		frame.setVisible(true);
		
		
	}
	public void addListener() {
		_new.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);
		exit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();
		String str = item.getText();
		switch (str) {
		case "New": clean(); break;
			
			

		default:
			break;
		}
		
		
	}
	private void clean() {
		// TODO Auto-generated method stub
		
	}

}
