/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 31.03.2022
 * @author 
 */

public class Uhrzeit {
  
  // Anfang Attribute
  int std = 00;
  int min = 00;
  int sek = 00;
  // Ende Attribute
  
  // Anfang Methoden
  public Uhrzeit(){
    
    }
  
  public void setZeit(int h, int m, int s){
    std = h;
    min = m;
    sek = s;
    }
  
  public String UhrzeitString(){
    String stdstr = String.format("%02d", std); 
    String minstr = String.format("%02d", min);
    String sekstr = String.format("%02d", sek);
    return stdstr + ":" + minstr + ":" + sekstr;
    }
  
  public void timerTick(){
    if(sek<59){
        sek++;
    }else{
        sek = 0;
        if(min<59){
           min++;  
        }else{
           min = 0;
           if(std<23){
             std++;
           }else{
             std = 0;
          }     
          
        }
        
      }
    
    
    
    }
  // Ende Methoden
} // end of Uhrzeit

