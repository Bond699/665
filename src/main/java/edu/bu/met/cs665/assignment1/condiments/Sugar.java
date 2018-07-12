package edu.bu.met.cs665.assignment1.condiments;

import edu.bu.met.cs665.assignment1.beverage.Beverage;

/**.
 *  Sugar is a condiment used in the decorator pattern
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class Sugar extends CondimentDecorator {
  
  /**.
   * Create a new Sugar object/condiment
   * @param beverage to be decorated with the Sugar object
   */
  public Sugar(Beverage beverage) {
    super.setDescription("Sugar");
    this.beverage = beverage;
  }
   
}
