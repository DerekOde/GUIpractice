import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    // Gui Lesson 1
//    MyFrame(){
//        this.setTitle("My First GUI");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(400, 400);
//        this.setVisible(true);
//
//        ImageIcon image = new ImageIcon("src\\neww.jpg");
//        this.setIconImage(image.getImage());
//        this.getContentPane().setBackground(new Color(123, 50, 250));
//    }

//   Gui Lesson 2 (main 3)
    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon icon = new ImageIcon("src\\neww.jpg");
        ImageIcon icon2 = new ImageIcon("src\\logo.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);
        //button.setIcon(icon);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        //button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("bruh");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
