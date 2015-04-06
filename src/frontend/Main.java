package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.UIManager;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(UIManager.getColor("Button.disabledShadow"));
		frame.getContentPane().setBackground(UIManager.getColor("Button.foreground"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblWelcomeBackUser = new JLabel("Welcome back, user");
		lblWelcomeBackUser.setForeground(UIManager.getColor("Button.disabledShadow"));
		lblWelcomeBackUser.setBackground(UIManager.getColor("Button.foreground"));
		GridBagConstraints gbc_lblWelcomeBackUser = new GridBagConstraints();
		gbc_lblWelcomeBackUser.insets = new Insets(0, 0, 5, 0);
		gbc_lblWelcomeBackUser.gridx = 0;
		gbc_lblWelcomeBackUser.gridy = 1;
		frame.getContentPane().add(lblWelcomeBackUser, gbc_lblWelcomeBackUser);
		
		JLabel lblWhatDoYou = new JLabel("What do you want to do?");
		lblWhatDoYou.setBackground(UIManager.getColor("Button.foreground"));
		lblWhatDoYou.setForeground(UIManager.getColor("Button.disabledShadow"));
		GridBagConstraints gbc_lblWhatDoYou = new GridBagConstraints();
		gbc_lblWhatDoYou.insets = new Insets(0, 0, 5, 0);
		gbc_lblWhatDoYou.gridx = 0;
		gbc_lblWhatDoYou.gridy = 2;
		frame.getContentPane().add(lblWhatDoYou, gbc_lblWhatDoYou);
		
		JButton btnNewButton = new JButton("New Message");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setForeground(UIManager.getColor("Button.highlight"));
		btnNewButton.setBackground(UIManager.getColor("CheckBox.foreground"));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 4;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Messages");
		btnNewButton_1.setForeground(UIManager.getColor("Button.highlight"));
		btnNewButton_1.setBackground(UIManager.getColor("Button.foreground"));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 5;
		frame.getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
	}

}
