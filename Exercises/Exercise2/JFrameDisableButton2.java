package Exercise2;

/**
 * Created by jmarc on 24/10/2016.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JFrameDisableButton2 extends JFrame implements ActionListener
{
    final int SIZE = 180;
    Container con = getContentPane();
    JButton button = new JButton("Click");
    int count = 0;
    final int MAX = 8;
    JLabel label = new JLabel("It is now disabled!");
    public JFrameDisableButton2()
    {
        super("My Window");
        con.setLayout(new FlowLayout());
        setSize(SIZE, SIZE);
        setVisible(true);
        con.add(button);
        con.add(label);
        label.setVisible(false);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++count;
        if(count == MAX)
        {
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        JFrameDisableButton2 frame =
                new JFrameDisableButton2();
    }
}