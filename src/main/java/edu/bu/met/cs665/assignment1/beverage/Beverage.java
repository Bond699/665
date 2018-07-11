package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewBehavior;

/**.
 *  This is the interface for all beverages. AbstractBeverage implements this interface
 *  and Tea and Coffee extend AbstractBeverage. Various tea and coffee concrete
 *  classes extend Tea and Coffee.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018 */
public interface Beverage  {
  
  /**
   * Sets the beverage description.
   * @param description String of the description to set.
   */
  public void setDescription(String description);
  
  
  /**
   * Gets the beverage description.
   * @return String of the beverage description
   */
  public String getDescription();
  
  
  /**
   * Gets the brew behavior for an implementation.
   * @return BrewBehavior of the brew behavior associated with a beverage
   */
  public BrewBehavior getBrewBehavior();
  

  
  /**.
   * Set's the beverage brew behavior using Strategy Pattern
   * @param brewBehavior the brew behavior associated with a beverage
   */
  public void setBrewBehavior(BrewBehavior brewBehavior);
  
}
