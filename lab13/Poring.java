package lab13;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
/**
 *
 * @author sudthirak
 */
public class Poring implements Runnable, MouseListener{
    private JFrame fr;
    private ImageIcon image;
    private JPanel p1;
    private JLabel l_count, l_img;
    private static int count;
    
    public Poring(){
        fr = new JFrame("Poring");
        fr.setLayout(new BorderLayout());
        image = new ImageIcon(getClass().getResource("poring.jpeg"));
        
        count++;
        p1 = new JPanel(); 
        l_count = new JLabel(count+"");
        l_img = new JLabel(image);
        
        fr.add(l_img, BorderLayout.CENTER);
        fr.add(l_count, BorderLayout.EAST);
        
        l_img.addMouseListener(this);
        
        fr.pack();
        fr.setResizable(false);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    public void run(){
        while(true){
            try{
                fr.setLocation(new Random().nextInt(500), new Random().nextInt(500));
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        fr.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    

    
}
