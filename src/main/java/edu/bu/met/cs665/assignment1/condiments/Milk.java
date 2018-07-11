package edu.bu.met.cs665.assignment1.condiments;

import edu.bu.met.cs665.assignment1.beverage.Beverage;

/**.
 *  Milk is a condiment used in the decorator pattern
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class Milk extends CondimentDecorator {
  private String name = "Milk";
     
  /**.
   * Create a new Milk object/condiment
   * @param beverage to be decorated with the Milk object
   */
  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public String getDescription() {
    return beverage.getDescription() + " + [" + name + "]";
  }
   
}
