import javax.swing.*;

public class Main{
    public static void main(String[] args){
        // Creating instance of JFrame
        JFrame frame = new JFrame();

        // Creating instance of JButton
        JButton button = new JButton("Click");
        
        // Creating instance of JLabel
        JLabel label = new JLabel("Hello world");

        // x axis, y axis, width, height
        button.setBounds(150, 200, 220, 50);

        // label bounderies
        label.setBounds(20,20,100,50);


        // adding button in JFrame
        frame.add(button);

        // adding label in JFrame
        frame.add(label);

        // 400 width and 500 height
        frame.setSize(500, 600);

        // using no layout managers
        frame.setLayout(null);

        // making the frame visible
        frame.setVisible(true);
    }
}