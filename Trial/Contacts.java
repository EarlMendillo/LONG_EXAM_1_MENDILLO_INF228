package Trial;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

class Contacts extends Frame {
	public Contacts() {
		super("Contacts");
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 119, 182));
		panel.setBounds(0, 45, 1087, 708);
		getContentPane().add(panel);
		panel.setLayout(null);

		addLogoLabel(panel, "C:\\Users\\Earl\\Pictures\\Eclipese Logos\\Ellipse 1 (1).png");

		// Add action listener to logo label
		JLabel logoLabel = (JLabel) panel.getComponent(0);
		logoLabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
			}
		});

		addHomeButton(panel);

		addLabelWithMouseListener(panel, "Home", 174, 20, 116, 29, new Font("Microsoft PhagsPa", Font.ITALIC, 24),
				Color.WHITE, new Color(255, 128, 192), new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						Home home = new Home();
						home.setVisible(true);
						dispose();
					}
				});

		addLabelWithMouseListener(panel, "About Me", 325, 14, 130, 40, new Font("Microsoft PhagsPa", Font.ITALIC, 24),
				Color.WHITE, new Color(255, 128, 128), new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						About aboutMe = new About();
						aboutMe.setVisible(true);
						dispose();
					}
				});

		addLabelWithMouseListener(panel, "Works", 498, 20, 108, 29, new Font("Microsoft PhagsPa", Font.ITALIC, 24),
				Color.WHITE, panel.getBackground(), new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						Works works = new Works();
						works.setVisible(true);
						dispose();
					}
				});

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(484, 244, 180, 170);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(7, 85, 0, 0);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1_1.add(lblNewLabel_3);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.instagram.com/earl_mendillo/").toURI());
				} catch (Exception E1) {

				}
			}
		});
		lblNewLabel_1.setBounds(7, 5, 165, 160);
		panel_1_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\🦆 icon _facebook icon_.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(107, 244, 180, 170);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://web.facebook.com/earledward.mendillo/").toURI());
				} catch (Exception E1) {

				}
			}
		});
		lblNewLabel.setBounds(7, 5, 165, 160);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\🦆 icon _instagram icon_.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(831, 244, 192, 170);
		panel.add(panel_2);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://gitlab.com/mendilloearl/library_advance").toURI());
				} catch (Exception E1) {

				}
			}
		});
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\🦆 icon _gitlab_.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(
				"C:\\Users\\Earl\\Pictures\\Eclipese Logos\\Email_ mendilloearl@gmail.com Contact No._ 09179857172.png"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(377, 631, 392, 55);
		panel.add(lblNewLabel_4);
	}
}
