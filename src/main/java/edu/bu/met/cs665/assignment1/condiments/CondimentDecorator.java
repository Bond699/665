package edu.bu.met.cs665.assignment1.condiments;

import edu.bu.met.cs665.assignment1.behaviors.BrewBehavior;
import edu.bu.met.cs665.assignment1.behaviors.BrewNoWay;
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
  protected BrewBehavior brewBehavior;
  
  public CondimentDecorator() {
    brewBehavior = new BrewNoWay();
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
 
  
}
