import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;

public class Optionpane {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Hello World!", "Title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello World!", "Title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello World!", "Title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello World!", "Title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello World!", "Title", JOptionPane.ERROR_MESSAGE);

//        System.out.println(JOptionPane.showConfirmDialog(null, "do you code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION));
        //int answer = JOptionPane.showConfirmDialog(null, "do you code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello " + name);
        String[] responses = {"No, you are awesome!", "Thank you!", "Blush"};
        ImageIcon icon = new ImageIcon("src\\neww.jpg");
        JOptionPane.showOptionDialog(null,
                "you are awesome!",
                "Title",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null ,
                responses,
                0);
    }
}
