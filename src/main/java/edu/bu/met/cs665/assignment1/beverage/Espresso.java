package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewHighPressure;

/**.
 *  Espresso is a concrete implementation of Coffee.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public class Espresso extends Coffee {
   
  /**
   * Espresso constructor, setting the description and
   * brew behavior with the strategy pattern. 
   */
  public Espresso() {
    setDescription("Espresso");
    setBrewBehavior(new BrewHighPressure());
  }
}
