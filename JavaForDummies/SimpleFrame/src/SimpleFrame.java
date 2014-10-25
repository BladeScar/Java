import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
public class SimpleFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SimpleFrame() {
		setTitle("Don't click the button!");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("Panic"));
		setSize(300, 100);
		setVisible(true);
	}
}
