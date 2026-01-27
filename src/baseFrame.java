import javax.swing.*;
import java.awt.*;

public class baseFrame extends JFrame {
    public baseFrame() {
        getContentPane().setBackground(new Color(0, 33, 71));
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        try {
        ImageIcon logoIcon = new ImageIcon("Academic Evaluations no.2.png"); 

        Image scaledImage = logoIcon.getImage().getScaledInstance(200, 170, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(scaledImage));

        logoLabel.setBounds(50, 100, 150, 150); 

        this.getLayeredPane().add(logoLabel, JLayeredPane.PALETTE_LAYER);

        System.out.println("Logo loaded successfully!"); 
    } catch (Exception e) {
        System.out.println("Still can't find the file: " + e.getMessage());
    }
    }
}