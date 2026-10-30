import java.awt.*;
import javax.swing.*;

public class Frame{
    public static void main(String[] args){
    JFrame frame = new JFrame("FRAME!");
    frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,15));
    frame.setSize(500,600);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);


    JLabel lblnum = new JLabel("Number");
    lblnum.setBounds(0,0,0,0);





    }
}