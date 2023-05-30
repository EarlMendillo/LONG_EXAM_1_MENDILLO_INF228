package Trial;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

class About extends Frame {
    public About() {
        super("About Me");
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

        addLabelWithMouseListener(panel, "Home", 174, 20, 116, 29,
                new Font("Microsoft PhagsPa", Font.ITALIC, 24),
                Color.WHITE, new Color(255, 128, 192),
                new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        Home home = new Home();
                        home.setVisible(true);
                        dispose();
                    }
                });

        addLabelWithMouseListener(panel, "Works", 325, 14, 130, 40,
                new Font("Microsoft PhagsPa", Font.ITALIC, 24),
                Color.WHITE, new Color(255, 128, 128),
                new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        Works works = new Works();
                        works.setVisible(true);
                        dispose();
                    }
                });

        addLabelWithMouseListener(panel, "Contacts", 498, 20, 108, 29,
                new Font("Microsoft PhagsPa", Font.ITALIC, 24),
                Color.WHITE, panel.getBackground(),
                new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        Contacts contacts = new Contacts();
                        contacts.setVisible(true);
                        dispose();
                    }
                });
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\pic.png"));
        lblNewLabel.setBounds(0, 162, 462, 514);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\Hello! I'm Earl Edward Mendillo, a first-year college student at National University - MANILA. I'm pursuing a Bachelor of Science degree in Computer Science with a specialization in Digital Forensics. .png"));
        lblNewLabel_1.setBounds(462, 198, 625, 480);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\Earl Edward Mendillo Student Bachelor of Science degree in Computer Science with a specialization in Digital Forensics. National University-Manila.png"));
        lblNewLabel_2.setBounds(462, 80, 500, 115);
        panel.add(lblNewLabel_2);
    }
}
