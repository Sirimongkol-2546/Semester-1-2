package lab11;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sudthirak
 */
public class CalculatorTwoGUI implements ActionListener {
    private JFrame fr;
    private JTextField txt;
    private JButton b1, b2, b3, b4 , b5, b6, b7, b8 ,b9 , b0, b_plus, b_minus, b_multi, b_divide, b_equal, b_c;
    private JPanel panel;
    
    double num, ans;
    int calculator;

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
        
        //connect button
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b_plus.addActionListener(this);
        b_minus.addActionListener(this);
        b_multi.addActionListener(this);
        b_divide.addActionListener(this);
        b_equal.addActionListener(this);
        b_c.addActionListener(this);
        
        //setting
        fr.add(panel);
        fr.add(txt, BorderLayout.NORTH);
        txt.setHorizontalAlignment(JTextField.RIGHT);
    
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        fr.setResizable(false);
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(b0)){txt.setText(txt.getText() + "0");}
        else if(e.getSource().equals(b1)){txt.setText(txt.getText() + "1");}
        else if(e.getSource().equals(b2)){txt.setText(txt.getText() + "2");}
        else if(e.getSource().equals(b3)){ txt.setText(txt.getText() + "3");}
        else if(e.getSource().equals(b4)){txt.setText(txt.getText() + "4");}
        else if(e.getSource().equals(b5)){txt.setText(txt.getText() + "5");}
        else if(e.getSource().equals(b6)){txt.setText(txt.getText() + "6");}
        else if(e.getSource().equals(b7)){ txt.setText(txt.getText() + "7");}
        else if(e.getSource().equals(b8)){txt.setText(txt.getText() + "8");}
        else if(e.getSource().equals(b9)){txt.setText(txt.getText() + "9");}
        
        
        else if(e.getSource().equals(b_plus)){
            num = Double.parseDouble(txt.getText());
            calculator = 1;
            txt.setText("");
 
        }
        else if(e.getSource().equals(b_minus)){
            num = Double.parseDouble(txt.getText());
            calculator = 2;
            txt.setText("");
        }
        else if(e.getSource().equals(b_multi)){
            num = Double.parseDouble(txt.getText());
            calculator = 3;
            txt.setText("");
        }
        else if(e.getSource().equals(b_divide)){
            num = Double.parseDouble(txt.getText());
            calculator = 4;
            txt.setText("");
        }
        else if(e.getSource().equals(b_equal)){
            operation();
        }
        else if(e.getSource().equals(b_c)){
            txt.setText("");
        }
        
    }
    
    public void operation(){
        switch(calculator)
        {
            case 1:
                ans = num + Double.parseDouble((txt.getText()));
                txt.setText(Double.toString(ans));
                break;
                
            case 2:
                ans = num - Double.parseDouble((txt.getText()));
                txt.setText(Double.toString(ans));
                break;
                
            case 3:
                ans = num * Double.parseDouble((txt.getText()));
                txt.setText(Double.toString(ans));
                break;
            
            case 4:
                ans = num / Double.parseDouble((txt.getText()));
                txt.setText(Double.toString(ans));
                break;
                
        }
    }
}
