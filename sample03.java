/*
textfield sample
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sample03 extends JFrame
{
	JPanel panel;
	JButton btn1;
	JButton btn2;
	JTextField text1;
	JTextField text2;
	JLabel label1;
	JLabel label2;


	public sample03()
	{
		panel = new JPanel();

		setTitle("sample03");
		setSize(200, 200);
		

		creatTxtBox1();
		creatTxtBox2();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


		add(panel);
		

	}

	private void creatTxtBox1()
	{
		label1 = new JLabel("Enter your name:");
		panel.add(label1);
		text1 = new JTextField(15);
		text1.addActionListener(new TextListener());
		panel.add(text1);

	}
		private void creatTxtBox2()
	{
		label2 = new JLabel("Yourname:");
		panel.add(label2);
		text2 = new JTextField(15);
		panel.add(text2);

	}

	private class TextListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String name = text1.getText();
			text2.setText(name);

		}
	}
	public static void main(String[] args)
	{
		new sample03();
	}

}