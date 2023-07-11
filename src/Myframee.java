import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframee extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    Myframee(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(new FlowLayout());

         button = new JButton("Submit");

         textField = new JTextField();
         textField.setPreferredSize(new Dimension(250,40));
         textField.setFont(new Font("Consolas", Font.PLAIN, 35));
         textField.setForeground(Color.green);

         this.add(textField);
         this.add(button);
         this.pack();
         this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("hello " + textField.getText());
        }
    }
}
