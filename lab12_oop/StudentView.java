package lab12;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LAB203_44
 */
public class StudentView implements ActionListener, WindowListener{
     private JFrame fr;
    private JPanel panel1, panel2;
    private JLabel id, name, money;
    private JTextField text_ID, text_Name, text_Money;
    private JButton deposit, withdraw;
    private Student s;
    
    public StudentView(){
        fr = new JFrame("Student View");
        fr.setLayout(new GridLayout(4, 2));
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        id = new JLabel("ID:");
        name = new JLabel("Name:");
        money = new JLabel("Money:");
        
        text_ID = new JTextField();
        text_Name = new JTextField();
        text_Money = new JTextField("0");
        text_Money.setEditable(false);
        
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        
        panel1.add(deposit);
        panel2.add(withdraw);
        
        fr.add(id);
        fr.add(text_ID);
        fr.add(name);
        fr.add(text_Name);
        fr.add(money);
        fr.add(text_Money);
        fr.add(panel1);
        fr.add(panel2);
        
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        fr.addWindowListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(deposit)){
            int total = Integer.parseInt(text_Money.getText()) + 100; //convert Str -> int
            text_Money.setText(total + ""); //convert int -> Str
            s.setMoney(total);
            
        }
        
        else if(e.getSource().equals(withdraw)){
            if (Integer.parseInt(text_Money.getText()) - 100 >= 0){
                int total = Integer.parseInt(text_Money.getText()) - 100;
                text_Money.setText(total + "");
                s.setMoney(total);
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
//        s = null;
        File file = new File("StudentM.dat");
        
        if(s == null){
            s = new Student();
            try {
                file.createNewFile();
            } 
            catch (IOException ex) {
                Logger.getLogger(StudentView.class.getName()).log(Level.SEVERE, null, ex);
//                ex.printStackTrace();
            }
        }
        
        // Load
        try{
            FileInputStream fin = new FileInputStream("StudentM.dat"); 
            ObjectInputStream oin = new ObjectInputStream(fin);
            
            s = (Student)oin.readObject(); // convert Obj -> Student
            text_ID.setText(s.getID() + "");
            text_Name.setText(s.getName());
            text_Money.setText(s.getMoney() + "");
                 
            oin.close();
            fin.close();
            
        }
        catch(IOException ex){
            System.out.println("1");
            ex.printStackTrace();
            
        }
        catch(ClassNotFoundException c){
            c.printStackTrace();
        }
        
    }

    // Save
    @Override
    public void windowClosing(WindowEvent e) {
        s.setID((Integer.parseInt(text_ID.getText())));
        s.setName(text_Name.getText());
        try{FileOutputStream fw = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fw);
            oout.writeObject(s);
            
            oout.close();
            fw.close();
            System.out.println("Serialized data is saved.");
        }
        catch(IOException ex){
            ex.printStackTrace();
            
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
}
