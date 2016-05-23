/*
text area sample
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class textAreaBorderLayout extends JFrame
{
	JPanel panel;
	JTextArea textArea;
	JScrollPane textAreaScrollPane;
	JButton lockButton;
	JButton clearButton;
	boolean isLocked = false;

	public textAreaBorderLayout()
	{
		setTitle("BorderLayout sample");

		createTextArea();
		createButtons();
		
		panel = new JPanel();

		//add BorderLayout
		panel.setLayout(new BorderLayout());

		// panel.add(button, BorderLayout.EAST)
		panel.add(textAreaScrollPane, BorderLayout.CENTER);

		// add button group
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(lockButton);
		buttonPanel.add(clearButton);

		//add borderlayout for buttonPanel
		panel.add(buttonPanel, BorderLayout.SOUTH);

		add(panel);
		pack();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createTextArea()
	{	
		//JTextArea(int Rows, int Columns)
		textArea = new JTextArea(10, 20);

		//In order to wrap the line
		textArea.setLineWrap(true);

		//Wrapping at words 
		textArea.setWrapStyleWord(true);

		//Scroll bar setting
		textAreaScrollPane = new JScrollPane(textArea);
	}

	private void createButtons()
	{
		lockButton = new JButton("Lock");
		lockButton.addActionListener(new ButtonListener());

		clearButton = new JButton("Clear");
		clearButton.addActionListener(new ButtonListener());


	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == lockButton)
			{
				isLocked =!isLocked;
			
			if(isLocked)
			{
				lockButton.setText("Unlock");
				textArea.setEditable(false);
			}else{
				lockButton.setText("Lock");
				textArea.setEditable(true);
			}
			
			}else{
				textArea.setText(null);
			}
			

		}
	}
	public static void main(String[] args)
	{
		new textAreaBorderLayout();
	}
}