package lab11;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sudthirak
 */
public class TellerGUI extends Account implements ActionListener{
    private JFrame fr;
    private JTextField txt2;
    private JPanel panel, panel2, panel3;
    private JButton b1, b2, b3;
    private JLabel l1, l2, l3;
    private Account acct;
    
    public TellerGUI(){
        
        super(6000, "Mongsae");
        acct = new Account(6000, "Mongsae");
        
        //create
        fr = new JFrame("Teller GUI");
        l1 = new JLabel("  Balance ");
        l2 = new JLabel("  Amount ");
        l3 = new JLabel("6000");
        txt2 = new JTextField();
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        
        b1 = new JButton("Deposite");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        
        //set Layout
        fr.setLayout(new GridLayout(4, 1));
        panel.setLayout(new GridLayout(1, 2));
        panel2.setLayout(new GridLayout(1, 2));
        
        //format
        panel.add(l1);
        panel.add(l3);
        
        panel2.add(l2);
        panel2.add(txt2);
        
        panel3.add(b1);
        panel3.add(b2);
        panel3.add(b3);
        
        fr.add(panel);
        fr.add(panel2);
        fr.add(panel3);
        
        //setting
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        fr.setResizable(false);
 
        
        //connect button
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(b2) && acct.getBalance() - Integer.parseInt(txt2.getText()) >= 0){
           acct.withdraw(Integer.parseInt(txt2.getText())); //convert String -> Int
           l3.setText(String.valueOf(acct.getBalance()));
            
        }
        
        else if(e.getSource().equals(b1)){
            acct.deposit(Integer.parseInt(txt2.getText()));
            l3.setText(String.valueOf(acct.getBalance()));
        }
        
        else if(e.getSource().equals(b3)){
            System.exit(0);
        }
    }
}
