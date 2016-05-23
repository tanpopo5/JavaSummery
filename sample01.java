/*
Only button sample
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sample01 extends JFrame
{

	JPanel panel;
	int cnt=0;

	public sample01()
	{

		//Panel basic setting
		panel = new JPanel();
		setTitle("test");	

		//ImageIcon
		ImageIcon icon = new ImageIcon("java.png");

		//Button Listener
		ButtonListener listener = new ButtonListener();

		//Button
		JButton btn1 = new JButton("click me!");
		btn1.addActionListener(new ButtonListener());

		btn1.setIcon(icon);


		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//show the window
		panel.add(btn1);

		add(panel);
		pack();

	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			if(cnt!=0)
			{
			panel.setBackground(Color.BLUE);
			cnt=0;
			}else{
				panel.setBackground(Color.YELLOW);
				cnt=1;
			}
		}
	}



	public static void main(String[] args) {
		new sample01();

	}
}