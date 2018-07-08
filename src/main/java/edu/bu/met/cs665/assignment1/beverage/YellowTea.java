package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewVerySlow;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class YellowTea extends Tea {
  
  public YellowTea() {
    description = "Yellow Tea";
    brewBehavior = new BrewVerySlow();
  }
    
}
