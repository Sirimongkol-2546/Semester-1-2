package calculatoronegui;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author sudthirak
 */
public class CalculatorOneGUI {
    private JFrame fr;
    private JButton btn1, btn2, btn3, btn4;
    private JTextField txt1, txt2, txt3;
    private JPanel panel;
    
    //consturctor
    public CalculatorOneGUI(){
        //create
        fr = new JFrame("Calculator");
        panel = new JPanel();
        
        btn1 = new JButton("+");
        btn2 = new JButton("-");
        btn3 = new JButton("*");
        btn4 = new JButton("/");
        
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        
        //format
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        fr.add(txt1);
        fr.add(txt2);
        fr.add(panel);
        fr.add(txt3);
        
        
        // setting
        fr.setLayout(new GridLayout(4,1));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        fr.setResizable(false);
    
    }
}
