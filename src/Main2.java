import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;

public class Main2 {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("src\\neww.jpg");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);


        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(750,750);
        frame.add(redPanel);
        greenPanel.add(label);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
