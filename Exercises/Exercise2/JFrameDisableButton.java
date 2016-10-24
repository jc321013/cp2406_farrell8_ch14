package Exercise2; /**
 * Created by jmarc on 24/10/2016.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JFrameDisableButton extends JFrame implements ActionListener
{
    final int SIZE = 180;
    Container con = getContentPane();
    JButton button = new JButton("Click");
    public JFrameDisableButton()
    {
        super("My Window");
        con.setLayout(new FlowLayout());
        setSize(SIZE, SIZE);
        setVisible(true);
        con.add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        button.setEnabled(false);
    }
    public static void main(String[] args)
    {
        JFrameDisableButton frame =
                new JFrameDisableButton();
    }
}