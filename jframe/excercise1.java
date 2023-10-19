package jframe;
import javax.swing.JFrame;
public class excercise1 
{
    public static void name(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Titulo:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
    }
}
