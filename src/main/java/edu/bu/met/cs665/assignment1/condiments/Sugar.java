package edu.bu.met.cs665.assignment1.condiments;

import edu.bu.met.cs665.assignment1.behaviors.BrewBehavior;
import edu.bu.met.cs665.assignment1.beverage.Beverage;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class Sugar extends CondimentDecorator {
  private String description = "Sugar";
  
  Beverage beverage;
  
  public Sugar(Beverage beverage) {
    this.beverage = beverage;
  }
  
  public String getDescription() {
    return beverage.getDescription() + " + [" + description + "]";
  }
  
  public BrewBehavior getBrewBehavior() {
    return null;
  }
  
}
