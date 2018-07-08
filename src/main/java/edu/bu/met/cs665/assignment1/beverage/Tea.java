package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewBehavior;
import edu.bu.met.cs665.assignment1.behaviors.BrewSlow;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public abstract class Tea implements Beverage {
  private int temperature = 200;
  protected String description = "";
  protected BrewBehavior brewBehavior = new BrewSlow();
  
  public int getTemp() {
    return this.temperature;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public BrewBehavior getBrewBehavior() {
    return this.brewBehavior;
  }
}
