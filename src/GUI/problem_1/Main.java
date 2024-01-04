package GUI.problem_1;
import org.w3c.dom.xpath.XPathNamespace;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> start());
    }
    public static void start(){
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");

        JPanel panel = new JPanel();

        JTextField text1 = new JTextField(20);
        JTextField text2 = new JTextField(20);
        JTextField text3 = new JTextField(20);

        JFrame frame = new JFrame();

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);


        panel.add(text1);
        panel.add(text2);
        panel.add(text3);

        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
