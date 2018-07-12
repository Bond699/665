package edu.bu.met.cs665.assignment1.condiments;

import edu.bu.met.cs665.assignment1.beverage.AbstractBeverage;
import edu.bu.met.cs665.assignment1.beverage.Beverage;

/**.
 *  CondimentDecorator is apart of the decorator pattern I use to 
 *  account for condiments in the beverages. Since CondimentDecorator
 *  extends AbstractBeverage, I don't need to set the brewbehavior to none
 *  since that's already set in the AbstractBeverage class. 
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public abstract class CondimentDecorator extends AbstractBeverage {
  protected Beverage beverage;
  
  /**
   * {@inheritDoc}
   */
  @Override
  public String getDescription() {
    return beverage.getDescription() + " + [" + super.getDescription() + "]";
  }
   
}
