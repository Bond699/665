package edu.bu.met.cs665.assignment1.condiments;

import edu.bu.met.cs665.assignment1.beverage.Beverage;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class Sugar extends CondimentDecorator {
  private String name = "Sugar";
  
  /**.
   * Create a new Sugar object/condiment
   * @param beverage to be decorated with the Sugar object
   */
  public Sugar(Beverage beverage) {
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
