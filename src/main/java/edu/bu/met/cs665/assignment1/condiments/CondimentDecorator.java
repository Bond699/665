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
  private int quantity;
  protected Beverage beverage;
 
   
  /**
   * Sets the number of condiments for a beverage.
   * @param quantity integer of the number of condiments.
   */
  public void setQuantity(int quantity) {
    // Even though Menu class checks for valid user input, it's a good idea
    // to check it here too because in the future, the classes might be used differently.
    if (quantity < 0) {
      this.quantity = 0;
    } else if (quantity > 3) {
      this.quantity = 3;
    } else {
      this.quantity = quantity;
    }
    
  }
   
}
