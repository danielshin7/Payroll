import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Shin
 *
 */
public class GUI implements ActionListener
{
	private JFrame frame;
	private JFrame frame2;
	private JFrame frame3;
	private JButton fohButton;
	private JButton bohButton;
	private JButton danielButton;
	private JButton differentEmployee;
	private JPanel panel;
	private JPanel panel2;
	private JPanel panel3;
	private String hourly;
	private String tips;
	
	public GUI()
	{
		//First page
		frame = new JFrame();
		fohButton = new JButton("Jinya FOH Payroll");
		bohButton = new JButton("Jinya BOH Payroll");
		fohButton.addActionListener(this);
		bohButton.addActionListener(this);
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(fohButton);
		panel.add(bohButton);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Payroll");
		frame.pack();
		frame.setVisible(true);
		
		//Second page
		frame2 = new JFrame();
		danielButton = new JButton("Daniel Shin");
		danielButton.addActionListener(this);
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel2.setLayout(new GridLayout(0, 1));
		panel2.add(danielButton);
		frame2.add(panel2, BorderLayout.CENTER);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.pack();
		frame2.setVisible(false);
		
		//Third page
		frame3 = new JFrame();
		JTextField hourly = new JTextField("");
		JTextField tips = new JTextField("");
		frame3.add(tips, BorderLayout.CENTER);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		new GUI();
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		frame.setVisible(false);
		frame2.setVisible(true);
		frame3.setVisible(true);
	}
		

}
