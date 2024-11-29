/**
 *
 * CGN1-2: Klasse MyMath
 *
 * @version 1.0 vom 07.04.2022
 * @Markus Paul 
 */

public class MyMath {
  
  // Anfang Attribute
  // Ende Attribute
  
  // Anfang Methoden
  // ---------------------------------
  // Größter gemeinsamer Teiler zweier Zahlen
  // (ggT) nach Euklid-Algorithmus
  public static int ggt(int zahl1, int zahl2)
  {
    if (zahl1 == 0)
    {
      if (zahl2 == 0)
      {
        return 1; 
      }
      else
      {
        return zahl2;
      }
    }
    else
    {
      if (zahl2 == 0)
      {
        return zahl1;
      }   
      else
      {
        int dividend = zahl1;
        int divisor = zahl2;
        int rest = 0;
        do
        {
          rest = dividend % divisor;
          if (rest != 0)
          {
            dividend = divisor;
            divisor = rest;
          }
        } while (rest != 0);
        return divisor;
      }      
    }
  }
  
  // ---------------------------------
  // Kleinstes gemeinsames Vielfaches  
  public static int kgv(int zahl1, int zahl2)
  {
    return zahl1*zahl2/ggt(zahl1,zahl2);
  } 
    
  // Ende Methoden
} // end of MyMath

