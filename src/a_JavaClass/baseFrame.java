package a_JavaClass;

import javax.swing.*;
import java.awt.*;

public class baseFrame extends JFrame {
    public baseFrame() {
        // 1. Set the Oxford Blue background color
        getContentPane().setBackground(new Color(0, 33, 71));
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        // 2. Setup the Logo
        try {
        // 1. Create the icon using the exact filename
        ImageIcon logoIcon = new ImageIcon("Academic Evaluations no.2.png"); 

        // 2. Scale it to fit your design
        Image scaledImage = logoIcon.getImage().getScaledInstance(200, 170, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(scaledImage));

        // 3. Position it on the left side (x=50, y=100)
        logoLabel.setBounds(50, 100, 150, 150); 

        // 4. Add to LayeredPane so it stays on top of your blue background
        this.getLayeredPane().add(logoLabel, JLayeredPane.PALETTE_LAYER);

        System.out.println("Logo loaded successfully!"); // Confirmation check
    } catch (Exception e) {
        System.out.println("Still can't find the file: " + e.getMessage());
    }
    }
}