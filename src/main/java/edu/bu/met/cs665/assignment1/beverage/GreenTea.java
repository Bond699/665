package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewSlow;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class GreenTea extends Tea {
  
  public GreenTea() {
    description = "Green Tea";
    brewBehavior = new BrewSlow();
  }
  
}
