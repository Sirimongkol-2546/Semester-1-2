package lab12_oop;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sudthirak
 */
public class ChatDemo implements ActionListener{
    private JFrame fr;
    private JTextArea area;
    private JTextField blank;
    private JPanel panel;
    private JButton submit, reset;
    
    public ChatDemo(){
        fr = new JFrame("Chat Demo");
        fr.setLayout(new BorderLayout());
   
        area = new JTextArea(20, 45);
        area.setEditable(false);
        fr.add(area);
        
        blank = new JTextField(45);
        fr.add(blank);
        
        panel = new JPanel();
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        panel.add(submit);
        panel.add(reset);
        fr.add(panel);
        
        fr.add(area, BorderLayout.NORTH);
        fr.add(blank, BorderLayout.CENTER);
        fr.add(panel, BorderLayout.SOUTH);
        
        submit.addActionListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(submit)){
           
        }
    }
    
    //setter getter
//    public void setFr(JFrame fr){
//        this.fr = fr;
//    }
//    
//    public void setArea(JTextArea area){
//        this.area = area;
//    }
//    
//    public void setBlank(JTextField blank){
//        this.blank = blank;
//    }
//    
//    public void setPanel(JPanel panel){
//        this.panel = panel;
//    }
//    
//    public void setSubmit(JButton submit){
//        this.submit = submit;
//    }
//    
//    public void setReset(JButton reset){
//        this.reset = reset;
//    }
//    
//    public JFrame getFr(){
//        return fr;
//    }
//    
//    public JTextArea getArea(){
//        return area;
//    }
//    
//    public JTextField getBlank(){
//        return blank;
//    }
//    
//    public JPanel getPanel(){
//        return panel;
//    }
//    
//    public JButton getSubmit(){
//        return submit;
//    }
//    
//    public JButton getReset(){
//        return reset;
//    }

    
}
