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

class Home extends Frame {
    public Home() {
        super("Home");
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

        addLabelWithMouseListener(panel, "About Me", 174, 20, 116, 29,
                new Font("Microsoft PhagsPa", Font.ITALIC, 24),
                Color.WHITE, new Color(255, 128, 192),
                new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        About aboutMe = new About();
                        aboutMe.setVisible(true);
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
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\518x115.png"));
        lblNewLabel.setBounds(124, 260, 460, 123);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\Keeping the standards up to date.png"));
        lblNewLabel_1.setBounds(258, 393, 218, 44);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Eclipese Logos\\Rectangle 2.png"));
        lblNewLabel_2.setBounds(644, 136, 382, 377);
        panel.add(lblNewLabel_2);
    }
}

