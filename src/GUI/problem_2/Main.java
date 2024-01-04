package GUI.problem_2;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> start() );
    }
    private static void start() {
        JFrame frame = new JFrame("Paris");
        JButton button1 = new JButton("Warsaw");
        JButton button2 = new JButton("Change title");
        JTextField textField = new JTextField(20);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.add(button1);
        panel.add(button2);
        panel.add(textField);
        frame.add(panel);
        frame.pack();

        button1.addActionListener(e -> textField.setText(button1.getText()));
        button2.addActionListener(e -> frame.setTitle(textField.getText()));

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
