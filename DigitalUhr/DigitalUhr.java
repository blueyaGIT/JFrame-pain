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

public class DigitalUhr extends JFrame {
  // Anfang Attribute
  private JNumberField nfStd = new JNumberField();
  private JNumberField nfMin = new JNumberField();
  private JNumberField nfSek = new JNumberField();
  private JButton btnStellen = new JButton();
  private JTextField display = new JTextField();
  
  Uhr eineUhr;
  private Timer myTimer = new Timer(1000, null);
  // Ende Attribute
  
  public DigitalUhr() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 425; 
    int frameHeight = 173;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("DigitalUhr");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    nfStd.setBounds(14, 17, 35, 20);
    nfStd.setText("");
    cp.add(nfStd);
    nfMin.setBounds(55, 17, 35, 20);
    nfMin.setText("");
    cp.add(nfMin);
    nfSek.setBounds(96, 17, 35, 20);
    nfSek.setText("");
    cp.add(nfSek);
    btnStellen.setBounds(16, 47, 115, 25);
    btnStellen.setText("Uhr stellen");
    btnStellen.setMargin(new Insets(2, 2, 2, 2));
    btnStellen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnStellen_ActionPerformed(evt);
      }
    });
    cp.add(btnStellen);
    display.setBounds(151, 38, 230, 60);
    display.setHorizontalAlignment(SwingConstants.CENTER);
    display.setFont(new Font("Dialog", Font.PLAIN, 30));
    cp.add(display);
    myTimer.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        myTimer_ActionPerformed(evt);
      }
    });
    myTimer.setRepeats(true);
    myTimer.setInitialDelay(0);
    // Ende Komponenten
    eineUhr = new Uhr(this);
    myTimer.start();
    setVisible(true);
  } // end of public DigitalUhr
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new DigitalUhr();
    
  } // end of main
  
  public void btnStellen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    eineUhr.stelleUhr(nfStd.getInt(), nfMin.getInt(), nfSek.getInt());
  } // end of btnStellen_ActionPerformed
  
  
  public void zeitAusgeben(String zeit){
    display.setText(zeit);
    }
  public void myTimer_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    eineUhr.timerTick();
  } // end of myTimer_ActionPerformed

  // Ende Methoden
} // end of class DigitalUhr

