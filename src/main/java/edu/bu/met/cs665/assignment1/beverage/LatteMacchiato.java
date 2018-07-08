package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewFast;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class LatteMacchiato extends Coffee {
     
  public LatteMacchiato() {
    description = "Latte Macchiato";
    brewBehavior = new BrewFast();
  }
}
