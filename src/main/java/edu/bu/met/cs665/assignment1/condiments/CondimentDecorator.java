package edu.bu.met.cs665.assignment1.condiments;

import edu.bu.met.cs665.assignment1.beverage.Beverage;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public abstract class CondimentDecorator implements Beverage {
  private String description = "";
  private int quantity;
  
  public String getDescription() {
    return description;
  }
  
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
 
  
}
