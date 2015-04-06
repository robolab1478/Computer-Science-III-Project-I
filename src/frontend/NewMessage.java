package frontend;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.DefaultComboBoxModel;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JTextField;

public class NewMessage {

	private JFrame frame;
	private JTextField textField;

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
		frame.getContentPane().setForeground(UIManager.getColor("Button.foreground"));
		frame.getContentPane().setBackground(UIManager.getColor("Button.foreground"));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblWhoDoYou = new JLabel("Who do you want to send the message to?");
		lblWhoDoYou.setForeground(UIManager.getColor("Button.highlight"));
		lblWhoDoYou.setBackground(UIManager.getColor("Button.foreground"));
		GridBagConstraints gbc_lblWhoDoYou = new GridBagConstraints();
		gbc_lblWhoDoYou.insets = new Insets(0, 0, 5, 0);
		gbc_lblWhoDoYou.gridx = 0;
		gbc_lblWhoDoYou.gridy = 1;
		frame.getContentPane().add(lblWhoDoYou, gbc_lblWhoDoYou);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalStrut.anchor = GridBagConstraints.WEST;
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 2;
		frame.getContentPane().add(horizontalStrut, gbc_horizontalStrut);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Govind", "Vikas", "Rohan the bitch"}));
		comboBox.setForeground(UIManager.getColor("Button.foreground"));
		comboBox.setBackground(UIManager.getColor("Button.foreground"));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 3;
		frame.getContentPane().add(comboBox, gbc_comboBox);
		
		JLabel lblWhatMessageDo = new JLabel("What message do you want to send?");
		lblWhatMessageDo.setBackground(UIManager.getColor("CheckBox.focus"));
		lblWhatMessageDo.setForeground(UIManager.getColor("Button.disabledShadow"));
		GridBagConstraints gbc_lblWhatMessageDo = new GridBagConstraints();
		gbc_lblWhatMessageDo.insets = new Insets(0, 0, 5, 0);
		gbc_lblWhatMessageDo.gridx = 0;
		gbc_lblWhatMessageDo.gridy = 5;
		frame.getContentPane().add(lblWhatMessageDo, gbc_lblWhatMessageDo);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 6;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnSendMessag = new JButton("Send Message");
		btnSendMessag.setBackground(UIManager.getColor("Button.foreground"));
		GridBagConstraints gbc_btnSendMessag = new GridBagConstraints();
		gbc_btnSendMessag.gridx = 0;
		gbc_btnSendMessag.gridy = 8;
		frame.getContentPane().add(btnSendMessag, gbc_btnSendMessag);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
