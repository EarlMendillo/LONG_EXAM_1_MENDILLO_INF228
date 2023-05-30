package Trial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
	public Frame(String title) {
		super(title);
		setResizable(false);
		getContentPane().setBackground(new Color(255, 255, 255));
		setBackground(new Color(0, 128, 192));
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\Ellipse 1 (1).png"));
		setSize(1101, 778);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	}

	protected void addLogoLabel(JPanel panel, String imagePath) {
		JLabel logoLabel = new JLabel("New label");
		logoLabel.setBounds(11, 13, 130, 128);
		logoLabel.setForeground(Color.BLACK);
		logoLabel.setIcon(new ImageIcon(imagePath));
		panel.add(logoLabel);
	}

	protected void addHomeButton(JPanel panel) {
		JButton homeButton = new JButton("");
		homeButton.setBounds(1007, 10, 70, 70);
		homeButton.setBackground(new Color(0, 119, 182));
		homeButton.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\🦆 icon _home house_.png"));
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home home = new Home();
				home.setVisible(true);
				dispose();
			}
		});
		panel.add(homeButton);
	}

	protected void addLabelWithMouseListener(JPanel panel, String text, int x, int y, int width, int height, Font font,
			Color foregroundColor, Color backgroundColor, MouseAdapter mouseAdapter) {
		JLabel label = new JLabel(text);
		label.setBounds(x, y, width, height);
		label.setForeground(foregroundColor);
		label.setBackground(backgroundColor);
		label.setFont(font);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.addMouseListener(mouseAdapter);
		label.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add(label);
	}
}
