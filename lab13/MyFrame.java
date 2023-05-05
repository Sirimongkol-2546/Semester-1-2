package lab13;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sudthirak
 */
public class MyFrame{
    private JFrame fr;
    private MyClock clock;
    private Thread t;
    
    
    public MyFrame(){
        fr = new JFrame();
        
        
        clock = new MyClock();
        t = new Thread(clock);
        t.start();
        
        
        fr.add(clock);
        
        
        
        fr.setSize(500, 300);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
