package edu.bu.met.cs665.assignment1.beverage;


/**.
 *  Black Tea is a concrete implementation of Tea.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public class BlackTea extends Tea {
  
  /**
   * BleakTea constructor. No need to set the brew behavior here
   * because the default behavior in Tea (immersion) is used.
   */
  public BlackTea() {
    setDescription("Black Tea");
  }
  
}
