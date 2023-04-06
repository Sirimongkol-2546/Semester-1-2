package lab11;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sudthirak
 */
public class CalculatorOneGUI implements ActionListener {
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
        
        //connect button
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        
        // setting
        fr.setLayout(new GridLayout(4,1));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        fr.setResizable(false);
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double text1 = Double.parseDouble(txt1.getText()); //convert String -> Double
        double text2 = Double.parseDouble(txt2.getText());
        
        if(ae.getSource().equals(btn1)){
            // +
            txt3.setText(String.valueOf(text1 + text2));
        }
        
        else if(ae.getSource().equals(btn2)){
            // -
            txt3.setText(String.valueOf(text1 - text2));
        }
        
        else if(ae.getSource().equals(btn3)){
            // *
            txt3.setText(String.valueOf(text1 * text2));
        }
        
        else if(ae.getSource().equals(btn4)){
            // divide
            txt3.setText(String.valueOf(text1 / text2));
        }
        
    }
}
