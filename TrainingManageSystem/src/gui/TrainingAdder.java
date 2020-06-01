package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class TrainingAdder extends JFrame{
	
	public TrainingAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelCode = new JLabel("Code: ", JLabel.TRAILING);
		JTextField fieldCode = new JTextField(10);
		labelCode.setLabelFor(fieldCode);
		panel.add(labelCode);
		panel.add(fieldCode);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelMax = new JLabel("Max Weight: ", JLabel.TRAILING);
		JTextField fieldMax = new JTextField(10);
		labelMax.setLabelFor(fieldMax);
		panel.add(labelMax);
		panel.add(fieldMax);
		
		JLabel labelCount = new JLabel("Max Count: ", JLabel.TRAILING);
		JTextField fieldCount = new JTextField(10);
		labelCount.setLabelFor(fieldCount);
		panel.add(labelCount);
		panel.add(fieldCount);
		
		panel.add(new JButton("Add trianing"));
		panel.add(new JButton("Cancel"));

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
