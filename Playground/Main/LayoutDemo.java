import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class LayoutDemo {

	public static void main(String[] args) {
	JFrame frame = new JFrame("LayoutDemo");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Dimension d = new Dimension(300,300);
	frame.setPreferredSize(d);
	JTabbedPane jtp = new JTabbedPane();
	jtp.add("Intro Tab",new IntroPanel());
	jtp.add("Flow Panel",new FlowPanel());
	jtp.add("BLP",new BorderLayoutPanel());
	
	frame.getContentPane().add(jtp);
	frame.pack();
	frame.setLocation(500, 500);
	frame.setVisible(true);

	}

}
