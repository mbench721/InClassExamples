import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class FlowPanel extends JPanel {
	public FlowPanel(){
		this.setLayout(new FlowLayout());
		this.setBackground(Color.BLUE);
		JButton[] buttons = new JButton[5];
		for(int i = 0;i < buttons.length; ++i){
			buttons[i] = new JButton("Button " +(i+1));
			this.add(buttons[i]);
			
		}
	}

}
