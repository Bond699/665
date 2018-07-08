package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewMedium;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public class Espresso extends Coffee {
   
  public Espresso() {
    description = "Espresso";
    brewBehavior = new BrewMedium();
  }
}
