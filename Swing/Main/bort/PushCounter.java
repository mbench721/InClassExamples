package bort;

import javax.swing.JFrame;

public class PushCounter {

	public static void main(String[] args) {
	JFrame frame = new JFrame("Push Counter");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	PushCounterPanel panel = new PushCounterPanel();
	frame.getContentPane().add(panel);
	frame.pack(); // Auto-resizes the frame to contain the panel(s)
	frame.setLocation(100, 100);
	frame.setVisible(true);

	}

}
