/*
Font setting sample
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class fontSample extends JFrame
{
	JPanel panel;
	JPanel checkBoxPanel;
	JLabel label;
	JTextField textfield;
	JCheckBox italic;
	JCheckBox bold;
	JCheckBox exit;

	public fontSample()
	{
		setTitle("Font sample");

		createComponents();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();

	}
	public void createComponents()
	{
		panel = new JPanel();

		label = new JLabel("Style Options");
		textfield = new JTextField(20);

		//Listener
		CheckBoxListener listener = new CheckBoxListener();

		checkBoxPanel = new JPanel();

		italic = new JCheckBox("Italic");
		italic.addItemListener(listener);

		bold = new JCheckBox("Bold");
		bold.addItemListener(listener);

		exit = new JCheckBox("Exit");
		exit.addItemListener(listener);

		checkBoxPanel.add(italic);
		checkBoxPanel.add(bold);
		checkBoxPanel.add(exit);

		panel.add(label);
		panel.add(textfield);
		panel.add(checkBoxPanel);

		add(panel);



	}

	private class CheckBoxListener implements ItemListener
	{
		public void itemStateChanged(ItemEvent evt)
		{
			int style = Font.PLAIN;
			if(exit.isSelected()){
				System.exit(0);
			}
			if(italic.isSelected()){
				style+=Font.ITALIC;
			}
			if(bold.isSelected()){
				style+=Font.BOLD;
			}

			int size = (textfield.getFont()).getSize();
			String name =(textfield.getFont()).getName();

			Font textfieldFont = new Font(name, style, size);
			textfield.setFont(textfieldFont);

		}
	}

	public static void main(String[] args) {
		new fontSample();
	}

}