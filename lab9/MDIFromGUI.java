package mdifromgui;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author sudthirak
 */
public class MDIFromGUI {
    private JFrame fr;
    private JPanel p1;
    
    //For Menu
    private JMenuBar menuBar;
    private JMenu menu1, menu2, menu3, sub_menu1;
    private JMenuItem mi1, mi2, mi3, mi_sub1, mi_sub2;
    
    //For MDI
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    
    public MDIFromGUI(){
        //create
        fr = new JFrame("SubMenuItem Demo");
        p1 = new JPanel();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1.setLayout(new BorderLayout());
        
        // MENU
        menuBar = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("Edit");
        menu3 = new JMenu("View");
        sub_menu1 = new JMenu("New");
        
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        mi_sub1 = new JMenuItem("Window");
        mi_sub2 = new JMenuItem("Message");
        
        //format MENU
        fr.setJMenuBar(menuBar);
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        
            // [File]
        menu1.add(sub_menu1);
        menu1.add(mi1);
        menu1.addSeparator();
        menu1.add(mi2);
        menu1.addSeparator();
        menu1.add(mi3);
        
            // [New]
        sub_menu1.add(mi_sub1);
        sub_menu1.addSeparator();
        sub_menu1.add(mi_sub2);
        
        // MDI
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application1", true, true, true, true);
        frame2 = new JInternalFrame("Application2", true, true, true, true);
        frame3 = new JInternalFrame("Application3", true, true, true, true);
          
        //format and setting MDI
        frame1.getContentPane().add(new JLabel(" Frame1 "));
        frame1.setSize(300, 100);
        frame1.setVisible(true);
        
        frame2.getContentPane().add(new JLabel(" Frame2 "));
        frame2.setSize(300, 100);
        frame2.setVisible(true);
        
        frame3.getContentPane().add(new JLabel(" Frame3 "));
        frame3.setSize(300, 100);
        frame3.setVisible(true);
        
            // set position
        frame1.setLocation(10, 50);
        frame2.setLocation(150, 175);
        frame3.setLocation(200, 300);
    
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        
        fr.add(desktopPane);
        
        //setting
        fr.setSize(800, 500);
        fr.setVisible(true);
        fr.setResizable(false);
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } 
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {frame1 = new JInternalFrame("Application1", true, true, true, true);});
        SwingUtilities.invokeLater(() -> {frame2 = new JInternalFrame("Application1", true, true, true, true);});
        SwingUtilities.invokeLater(() -> {frame3 = new JInternalFrame("Application1", true, true, true, true);});
    }   
}
