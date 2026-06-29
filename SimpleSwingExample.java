import javax.swing.*;

public class SimpleSwingExample {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Simple Swing Window");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 

        JButton button = new JButton("Click Me");
        button.setBounds(100, 80, 100, 30); 

        frame.add(button);
        frame.setVisible(true);
    }
}

