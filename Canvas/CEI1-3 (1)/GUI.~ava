import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * CEI1 Aufgabe 3
  *
  * @version 1.0 vom 23.01.2019
  * @Markus Paul
  */ 

public class GUI extends JFrame {
  // Anfang Attribute
  private Schaubild graph = new Schaubild();
  private JNumberField nfa = new JNumberField();
  private JNumberField nfb = new JNumberField();
  private JButton bZeichnen = new JButton();
  private JLabel lA = new JLabel();
  private JLabel lB = new JLabel();
  private JNumberField nfc = new JNumberField();
  private JLabel lC = new JLabel();
  private JNumberField nfd = new JNumberField();
  private JLabel lC1 = new JLabel();
  private JRadioButton rbGerade = new JRadioButton();
  private JRadioButton rbParabel = new JRadioButton();
  private JRadioButton rbSinus = new JRadioButton();
  private ButtonGroup bgFunktion = new ButtonGroup();
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 563; 
    int frameHeight = 740;
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
    
    graph.setBounds(24, 160, 150, 150);
    cp.add(graph);
    nfa.setBounds(56, 72, 75, 20);
    nfa.setText("1.0");
    nfa.setVisible(true);
    cp.add(nfa);
    nfb.setBounds(168, 72, 75, 20);
    nfb.setText("0.5");
    cp.add(nfb);
    bZeichnen.setBounds(464, 40, 75, 25);
    bZeichnen.setText("Zeichnen");
    bZeichnen.setMargin(new Insets(2, 2, 2, 2));
    bZeichnen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bZeichnen_ActionPerformed(evt);
      }
    });
    cp.add(bZeichnen);
    lA.setBounds(32, 72, 22, 20);
    lA.setText("a=");
    cp.add(lA);
    lB.setBounds(144, 72, 22, 20);
    lB.setText("b=");
    cp.add(lB);
    nfc.setBounds(280, 72, 75, 20);
    lC.setBounds(256, 72, 22, 20);
    nfc.setText("2.0");
    cp.add(nfc);
    lC.setText("c=");
    cp.add(lC);
    nfd.setBounds(384, 72, 75, 20);
    lC1.setBounds(360, 72, 22, 20);
    nfd.setText("0.0");
    cp.add(nfd);
    lC1.setText("c=");
    cp.add(lC1);
    rbGerade.setBounds(36, 25, 100, 20);
    rbGerade.setOpaque(false);
    rbGerade.setText("Gerade");
    bgFunktion.add(rbGerade);
    cp.add(rbGerade);
    rbParabel.setBounds(147, 25, 100, 20);
    rbParabel.setOpaque(false);
    rbParabel.setText("Parabel");
    bgFunktion.add(rbParabel);
    cp.add(rbParabel);
    rbSinus.setBounds(263, 26, 100, 20);
    rbSinus.setOpaque(false);
    rbSinus.setText("Sinus");
    bgFunktion.add(rbSinus);
    cp.add(rbSinus);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void bZeichnen_ActionPerformed(ActionEvent evt) {
    //graph.setzeLinFkt(nfa.getDouble(),nfb.getDouble());
    double a = nfa.getDouble();
    double b = nfb.getDouble();
    double c = nfc.getDouble();
    double d = nfd.getDouble();
    switch(bgFunktion_getSelectedRadioButtonLabel()) {
      /*case "Gerade":
        int xB2 =0, yB2 =0;  
        for(int xB=0; xB<=500; xB++){
          double xM = xMath(xB);
          double yM = xM*xM+2*xM+0;
          int yB = yBild(yM);
          g.drawLine(xB,yB,xB,yB);
          if(xB==0){
            xB2 = xB;
            yB2 = yB;
          }
          g.drawLine(xB,yB,xB2,yB2);
          xB2 = xB;
          yB2 = yB;
        }
        break; */
      case "Parabel":
        System.out.println("3");
        graph.setzeFkt(new Parabel(a,b,c));
        break;
      case "Sinus":
        System.out.println("4");
        graph.setzeFkt(new Sinus(a,b,c,d));
        break;
      default: 
    }
  } // end of bZeichnen_ActionPerformed

  public String bgFunktion_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = bgFunktion.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }

  // Ende Methoden
} // end of class GUI

