




package download.manager;

import static download.manager.Menuconstants.aboutText;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class DownloadManager implements Menuconstants{

	


JFrame fob,fob1,fob2,fob3;
JMenu menu1,menu2,menu3,menu4;
JMenuBar menubar;
JMenuItem menuitem1,menuitem2,menuitem3,menuitem4;
JTabbedPane tabbedpane;
JTextField textfield;
JLabel l1,l2,background;
JPanel p1;
JButton b1,b2;

DownloadManager(){
	fob=new JFrame("Download Manager");
	fob.setSize(1000,650);
	fob.setLocation(25,25);
	fob.setLayout(new BorderLayout());
        
	    
          
        setIcon();
        setback();
        
        Container c= fob.getContentPane();
	c.setBackground(Color.WHITE);

	menu1=new JMenu("Add");
	menu2=new JMenu("Help");
	menu3=new JMenu("About");
	menu4=new JMenu("Exit");
	menuitem1=new JMenuItem("Add Download");
	menuitem2=new JMenuItem("View Help");
	menuitem3=new JMenuItem("About Download Manager");
	menuitem4=new JMenuItem("Click to Exit     Press E",KeyEvent.VK_E);
        
        
	 
        
	
	menuitem4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        System.exit(0);
        }

		
    });	
	
	menuitem3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae)
		{
			
			
			JOptionPane.showMessageDialog(DownloadManager.this.fob,aboutText,"About Download Manager",JOptionPane.INFORMATION_MESSAGE);
			
		}
	});
	
	menuitem2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae)
		{JOptionPane.showMessageDialog(DownloadManager.this.fob,helpText,"Help",JOptionPane.INFORMATION_MESSAGE);
			
		}

		
		
		
	});
	
        menu1.add(menuitem1);
        menu2.add(menuitem2);
        menu3.add(menuitem3);
        menu4.add(menuitem4);
        menubar=new JMenuBar();
	menubar.add(menu1);
	menubar.add(menu2);
	menubar.add(menu3);
	menubar.add(menu4);
        fob.setJMenuBar(menubar);
        fob.add(background);  
	
	menuitem1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
		
		new AddDownload().setVisible(true);
		
		
		}

		
	});
	
	
            fob.setSize(1000,650);
	    fob.setVisible(true);
}



	





	public static void main(String[] args) {
					
	new DownloadManager();
						
}

    private void setIcon() {
      fob.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
    }

    private void setIcon1() {
      fob2.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
    }
    
    private void setIcon2() {
      fob1.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
    }
   
    private void setback(){
        background=new JLabel(new ImageIcon("D:\\Download Manager\\src\\download\\manager\\test1.jpg"));
        
    } 
	}


interface Menuconstants{
final String aboutText="<html><big>Download Manager</big><hr><hr><br>"
        +"<p align=right>Prepared by a Himanshu vyas!"
        +"Ur Comments as well as bug reports r very welcome at<p align=center>"
        +"<hr><em><big>himanshuvyas7339@gmail.com</big></em><hr><html>" ;
 
final String helpText="<html><big>Help</big><hr><hr>"
        +"<p align=left>Simply just copy the link and download what do you want<br><br>"
        +" Need any help or got any bug so ur welcome.<p align=center"
        +"<hr><em><big>himanshuvyas7339@gmail.com";
}	