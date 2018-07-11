package edu.bu.met.cs665.assignment1.beverage;

/**.
 *  GreenTea is a concrete implementation of Tea
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class GreenTea extends Tea {
  
  /**
   * GreenTea constructor. No need to set the brew behavior here
   * because the default behavior in Tea (immersion) is used.
   */
  public GreenTea() {
    setDescription("Green Tea");
  }
  
}

