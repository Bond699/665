package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewFrenchPress;

/**.
 *  Latte Macchiato is a concrete implementation of Coffee
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class LatteMacchiato extends Coffee {
     
  /**
   * LatteMacchiato constructor, setting the description and
   * brew behavior with the strategy pattern.
   */
  public LatteMacchiato() {
    setDescription("Latte Macchiato");
    setBrewBehavior(new BrewFrenchPress());
  }
}
