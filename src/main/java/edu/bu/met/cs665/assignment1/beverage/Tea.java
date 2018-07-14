package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewImmersion;
import edu.bu.met.cs665.assignment1.beverage.AbstractBeverage;


/**.
 *  Tea extends AbstractBeverage and concrete Tea classes extend
 *  this class.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public abstract class Tea extends AbstractBeverage {
  
  /**
   * Tea Constructor that sets the default brew method. Many teas use immersion 
   * (also called Steeping), so the most common one is set here. Concrete tea 
   * classes will have to set BrewBehavior only if they do *not* use brew immersion.
   */
  public Tea() {
    setBrewBehavior(new BrewImmersion());
  }
}
