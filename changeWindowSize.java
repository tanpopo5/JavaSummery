import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class changeWindowSize extends JFrame
{
	JPanel panel;
	JButton expandButton;
	JButton shrinkButton;
	int width = 250;
	int length = 200;
	int exWidth;
	int exLength;
	int shWidth;
	int shLength;

	public changeWindowSize()
	{
		setTitle("Expand and Shrink window");
		setSize(width, length);

		createComponents();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void createComponents()
	{
		panel = new JPanel();

		ButtonListener listener = new ButtonListener();

		expandButton = new JButton("Expand");
		expandButton.addActionListener(new ButtonListener());

		shrinkButton = new JButton("Shrink");
		shrinkButton.addActionListener(new ButtonListener());

		panel.add(expandButton);
		panel.add(shrinkButton);
		add(panel);

	}
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==expandButton)
			{
				width = width+(width*1/10);
				length = length+(length*1/10);

				setSize(width, length);
			}else if(e.getSource()==shrinkButton){
				width = width-(width*1/10);
				length = length-(length*1/10);

				setSize(width, length);

			}

		}
	}
	public static void main(String[] args)
	{
		new changeWindowSize();
	}
}