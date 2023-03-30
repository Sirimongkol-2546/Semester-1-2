package tellergui;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author sudthirak
 */
public class TellerGUI {
    private JFrame fr;
    private JTextField txt, txt2;
    private JPanel panel, panel2, panel3;
    private JButton b1, b2, b3;
    private JLabel l1, l2;
    
    public TellerGUI(){
        //create
        fr = new JFrame("Teller GUI");
        l1 = new JLabel("  Balance ");
        l2 = new JLabel("  Amount ");
        txt = new JTextField("6000");
        txt2 = new JTextField();
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        
        b1 = new JButton("Deposite");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        
        //set Layout
        txt.setEditable(false);
        fr.setLayout(new GridLayout(4, 1));
        panel.setLayout(new GridLayout(1, 2));
        panel2.setLayout(new GridLayout(1, 2));
        
        //format
        panel.add(l1);
        panel.add(txt);
        
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
 
    
    }
    
}
