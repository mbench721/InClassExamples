package bort;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PushCounterPanel extends JPanel{
	private int count = 0;
	private JButton leftbutton = new JButton("Left");
	private JButton rightbutton = new JButton("Right");
	private JLabel label = new JLabel("Pushes: " + count);
	private JTextField typehere = new JTextField("",5);
	
	private JCheckBox bold = new JCheckBox("Bold"), italics = new JCheckBox("Italics");
	private int style = Font.PLAIN;
	
	public PushCounterPanel(){
		ButtonListener meh = new ButtonListener();
		CheckBoxListener maaa = new CheckBoxListener();
		
		
		leftbutton.addActionListener(meh);
		rightbutton.addActionListener(meh);
		typehere.addActionListener(meh);
		
		this.add(leftbutton);
		this.add(rightbutton);
		this.add(label);
		this.add(typehere);
		this.add(bold);
		this.add(italics);
		this.setBackground(Color.CYAN);
		this.setPreferredSize(new Dimension (300,40));
		
	}
	private class CheckBoxListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e){
			if(bold.isSelected()){
				style = Font.BOLD;
			}
			else if(italics.isSelected()){
				style = Font.ITALIC;
			}
		}

		
		
	}
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == leftbutton){
				label.setText("Left");
				label.setFont(new Font("Helvetica", style,12));
				typehere.setText("");
			}
			else if(e.getSource() == rightbutton){
				label.setText("Right");
				label.setFont(new Font("Helvetica", style,12));
				typehere.setText("");
			}
			else if(e.getSource() == typehere){
				label.setText(typehere.getText());
				label.setFont(new Font("Helvetica", style,12));
			}
			
		}
		
	}
	//

}
