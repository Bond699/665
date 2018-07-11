package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewDrip;
import edu.bu.met.cs665.assignment1.beverage.AbstractBeverage;


/**.
 *  Coffee extends AbstractBeverage and concrete Coffee classes extend
 *  this class. 
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public abstract class Coffee extends AbstractBeverage {
  
  /**
   * Coffee Constructor that sets the default brew method. Many coffees are drip 
   * brewed, so the most common one is set here. Concrete coffee classes will have 
   * to set BrewBehavior only if they do not use brewdrip.
   */
  public Coffee() {
    setBrewBehavior(new BrewDrip());
  }
    
}
