package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewBehavior;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018 */
public interface Beverage  {
  String description = "Unknown Beverage";
  int temperature = 0;
  
  public String getDescription();
  
  public BrewBehavior getBrewBehavior();
  
}
