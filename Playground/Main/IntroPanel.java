import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class IntroPanel extends JPanel {
	JLabel label = new JLabel("Choose a Tab");
	
	public IntroPanel(){
		this.setBackground(Color.CYAN);
		this.add(label);
	}

}
