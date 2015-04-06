package frontend;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.GridBagLayout;

public class NewMessage {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public NewMessage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(UIManager.getColor("CheckBox.background"));
		frame.getContentPane().setBackground(UIManager.getColor("Button.foreground"));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] patternExamples = {
                "dd MMMMM yyyy",
                "dd.MM.yy",
                "MM/dd/yy",
                "yyyy.MM.dd G 'at' hh:mm:ss z",
                "EEE, MMM d, ''yy",
                "h:mm a",
                "H:mm:ss:SSS",
                "K:mm a,z",
                "yyyy.MMMMM.dd GGG hh:mm aaa"
                };

       String currentPattern = patternExamples[0];

	}

}
