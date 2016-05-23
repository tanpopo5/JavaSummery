/*
two button sample
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sample02 extends JFrame
{
	JPanel panel;
	JButton btn1;
	JButton btn2;


	public sample02()
	{
		panel = new JPanel();
		setSize(250, 200);

		setTitle("sample02");

		ButtonListener listener = new ButtonListener();

		btn1 = new JButton("Red");
		btn1.addActionListener(listener);

		btn2 = new JButton("BLUE");
		btn2.addActionListener(listener);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel.add(btn1);
		panel.add(btn2);
		add(panel);

		//pack();

	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//getSource()
			if(e.getSource()==btn1)
			{
				panel.setBackground(Color.RED);
			}else if(e.getSource() == btn2){
				panel.setBackground(Color.BLUE);
			}

		}
	}
	public static void main(String[] args)
	{
		new sample02();
	}

}