import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class jframe
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setTitle("title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(420,420);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("luis.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.green);
    }
}