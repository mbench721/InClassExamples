import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;


public class BorderLayoutPanel extends JPanel {
	public BorderLayoutPanel(){
		this.setLayout(new BorderLayout());
		this.setBackground(Color.RED);
		JButton[] buttons = new JButton[5];
		String[] locations = {BorderLayout.CENTER,BorderLayout.NORTH,BorderLayout.EAST,BorderLayout.SOUTH,BorderLayout.WEST};
		for(int i = 0; i< buttons.length; ++i){
			buttons[i] = new JButton("Button " + (i+1));
			this.add(buttons[i],locations[i]);
			
		}
		
	}
}
