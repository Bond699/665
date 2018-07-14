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
  // This is the beverage that will be passed into the concrete classes. 
  // This beverage will be wrapped with the Milk or Sugar which extends CondimentDecorator,
  // which extends Abstract Beverage. On the class diagram, this is why the 
  // CondimentDecorator class has a relationship with Beverage (interface) and AbstractBeverage
  protected Beverage beverage;
  
  /**
   * {@inheritDoc}
   */
  @Override
  public String getDescription() {
    return beverage.getDescription() + " + [" + super.getDescription() + "]";
  }
   
}
