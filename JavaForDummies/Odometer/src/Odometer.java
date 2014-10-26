import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.Timer;


public class Odometer extends JApplet implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	Timer timer;
	public void init() {
		OdometerPanel panel = new OdometerPanel();
		panel.setBackground(Color.white);
		setContentPane(panel);
	}
	
	public void start() {
		if(timer == null) {
			timer = new Timer(100, this);
			timer.start();
		} else {
			timer.restart();
		}
	}
	
	public void stop() {
		if(timer != null){
			timer.stop();
			timer = null;
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

}
