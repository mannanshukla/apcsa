/*mannan shukla
 *homework - fortune teller
 *due feb 8 2021*/

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FortuneTeller extends JFrame
    implements ActionListener
{


  // Declare an array of "fortunes" (strings):

  String[] fortunes = {"A beautiful, smart, and loving person will be coming into your life.",
  "A dubious friend may be an enemy in camouflage.", "A faithful friend is a strong defense.",
  "A feather in the hand is better than a bird in the air.", "A fresh start will put you on your way.",
  "A friend asks only for your time not your money."};



  private JTextField display;
  
  public FortuneTeller()
  {
    super("Fortune Teller");

    display = new JTextField("  Press \"Next\" to see your fortune...", 25);
    display.setBackground(Color.WHITE);
    display.setEditable(false);

    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    // Pick and display a random fortune:

    int max = fortunes.length - 1;
    int min = 0;
    int rand = (int) (Math.random()*(max - min + 1));
    String text = fortunes[rand];
    display.setText("  " + text);

  }

  public static void main(String[] args)
  {
    JFrame window = new FortuneTeller();
    window.setBounds(300, 300, 300, 100);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true); 
  }
}
