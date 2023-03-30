package calculatortwogui;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author sudthirak
 */
public class CalculatorTwoGUI {
    private JFrame fr;
    private JTextField txt;
    private JButton b1, b2, b3, b4 , b5, b6, b7, b8 ,b9 , b0, b_plus, b_minus, b_multi, b_divide, b_equal, b_c;
    private JPanel panel;

    //constructor
    public CalculatorTwoGUI(){
        //create
        fr = new JFrame("My Calculator Ver.2");
        txt = new JTextField();
        panel = new JPanel();
        
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b_plus = new JButton("+");
        b_minus = new JButton("-");
        b_multi = new JButton("x");
        b_divide = new JButton("/");
        b_equal = new JButton("=");
        b_c = new JButton("c");
        
        //setLayout
        fr.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(4, 4));
        
        //adds button
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b_plus);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b_minus);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b_multi);
        panel.add(b0);
        panel.add(b_c);
        panel.add(b_equal);
        panel.add(b_divide);
        
        //setting
        fr.add(panel);
        fr.add(txt, BorderLayout.NORTH);
    
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        fr.setResizable(false);
 
    }
}
