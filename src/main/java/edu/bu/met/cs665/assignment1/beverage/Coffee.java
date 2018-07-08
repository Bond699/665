package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewBehavior;
import edu.bu.met.cs665.assignment1.behaviors.BrewFast;
import edu.bu.met.cs665.assignment1.condiments.*;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public abstract class Coffee implements Beverage {
  private int temperature = 150;
  protected String description = "";
  protected BrewBehavior brewBehavior = new BrewFast();
  
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
