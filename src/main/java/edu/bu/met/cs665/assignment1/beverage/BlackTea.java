package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewVerySlow;
import edu.bu.met.cs665.assignment1.condiments.*;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public class BlackTea extends Tea {
  
  public BlackTea() {
    description = "Black Tea";
    brewBehavior = new BrewVerySlow();
  }
  
}
