import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("src\\neww.jpg");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Bro wtf am I actually doing");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(255,255,255));
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setIconTextGap(20);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,100,500,500);

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setSize(500, 500);
    frame.setVisible(true);
    frame.add(label);
    //frame.setLayout(null);
    frame.pack();
    }
}