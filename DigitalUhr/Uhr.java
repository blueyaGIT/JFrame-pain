/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 31.03.2022
 * @author 
 */

public class Uhr {
  
  // Anfang Attribute
  Uhrzeit zeit;
  
  DigitalUhr dasGUI;
  // Ende Attribute
  
  // Anfang Methoden
  public Uhr(DigitalUhr eineGUI){
     dasGUI = eineGUI; 
     zeit = new Uhrzeit();  
    }
  
  public void stelleUhr(int std, int min, int sek){
      zeit.setZeit(std, min, sek);     
    }
  
  public void timerTick(){
    zeit.timerTick();
    dasGUI.zeitAusgeben(zeit.UhrzeitString());
    }
  // Ende Methoden
} // end of Uhr

