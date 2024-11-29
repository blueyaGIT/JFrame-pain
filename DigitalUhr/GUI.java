import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 31.03.2022
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private JNumberField jNFstd = new JNumberField();
  private JNumberField jNFmin = new JNumberField();
  private JNumberField jNFsek = new JNumberField();
  private JButton jB1 = new JButton();
  private JLabel jLuhr = new JLabel();
  private Uhr eineUhr;
  private Timer timer1 = new Timer(1000, null);
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 442; 
    int frameHeight = 415;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jNFstd.setBounds(13, 24, 27, 20);
    jNFstd.setText("");
    cp.add(jNFstd);
    jNFmin.setBounds(45, 24, 27, 20);
    jNFmin.setText("");
    cp.add(jNFmin);
    jNFsek.setBounds(77, 24, 27, 20);
    jNFsek.setText("");
    cp.add(jNFsek);
    jB1.setBounds(19, 49, 75, 25);
    jB1.setText("Uhr stellen");
    jB1.setMargin(new Insets(2, 2, 2, 2));
    jB1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jB1_ActionPerformed(evt);
      }
    });
    cp.add(jB1);
    jLuhr.setBounds(132, 28, 230, 60);
    jLuhr.setText("HH:MM:SS");
    jLuhr.setBackground(Color.WHITE);
    jLuhr.setOpaque(true);
    jLuhr.setHorizontalAlignment(SwingConstants.CENTER);
    jLuhr.setFont(new Font("Dialog", Font.BOLD, 22));
    cp.add(jLuhr);
    timer1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        timer1_ActionPerformed(evt);
      }
    });
    timer1.setRepeats(true);
    timer1.setInitialDelay(1000);
    // Ende Komponenten
    eineUhr = new Uhr(this);
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  public void GUI(){};
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void jB1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jB1_ActionPerformed

  public void timer1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of timer1_ActionPerformed

  // Ende Methoden
} // end of class GUI

