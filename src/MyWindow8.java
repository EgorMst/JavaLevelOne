import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow8 extends JFrame
{
public MyWindow8()
{
    setLocation(700, 500);
    setSize(500, 500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JButton myButton = new JButton("Exit");

    ActionListener oneLis = new closeAction8();
    myButton.addActionListener(oneLis);

    JButton my2Button = new JButton("Hello");

   JPanel myPanel = new JPanel(new GridLayout(1, 2));
   myPanel.add(myButton);
   myPanel.add(my2Button);

   add(myPanel, BorderLayout.SOUTH);
    setVisible(true);
}
}
