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

class Works extends Frame {
    public Works() {
        super("Works");
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

        addLabelWithMouseListener(panel, "About Me", 325, 14, 130, 40,
                new Font("Microsoft PhagsPa", Font.ITALIC, 24),
                Color.WHITE, new Color(255, 128, 128),
                new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        About aboutMe = new About();
                        aboutMe.setVisible(true);
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
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Screenshots\\Screenshot 2023-05-08 121333.png"));
        lblNewLabel.setBounds(46, 148, 561, 362);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Earl\\Pictures\\Screenshot 2023-04-28 112348.png"));
        lblNewLabel_1.setBounds(617, 375, 460, 294);
        panel.add(lblNewLabel_1);
    }
}

