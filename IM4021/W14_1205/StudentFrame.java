package W14_1205;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentFrame extends JFrame{
	public StudentFrame(){
		setTitle("student ID");
		setBounds(100, 100, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));

		JPanel row1 = new JPanel();
		row1.setLayout(new FlowLayout());
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		
		JPanel row2 = new JPanel();
		JButton button3 = new JButton("Button 3");

		row1.add(button1);
		row1.add(button2);
		row2.add(button3);
		panel.add(row1);
		panel.add(row2);

		add(panel);

		button1.addActionListener(e -> JOptionPane.showMessageDialog(this, "you press the button 1"));
		button2.addActionListener(e -> JOptionPane.showMessageDialog(this, "you press the button 2"));
		button3.addActionListener(e -> JOptionPane.showMessageDialog(this, "you press the button 3"));

		setVisible(true);
	}

	public static void main(String[] args) {
		new StudentFrame();
	}
}

