package lab13;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sudthirak
 */
public class PoringConstructor implements ActionListener{
    private JFrame fr;
    private JPanel panel;
    private JButton add;
    private Thread thread;
    
    public PoringConstructor(){
        fr = new JFrame();
        fr.setLayout(new FlowLayout());
        panel = new JPanel();
        
        add = new JButton("Add");
        panel.add(add);
        fr.add(panel);
        
        add.addActionListener(this);
        
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        (new Thread(new Poring())).start();
            
        }
    }

 

