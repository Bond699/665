package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewVeryFast;

/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public class Americano extends Coffee {
  
  public Americano() {
    description = "Americano";
    brewBehavior = new BrewVeryFast();
  }
 
  
}
