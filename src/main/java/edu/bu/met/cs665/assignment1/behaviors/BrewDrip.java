package edu.bu.met.cs665.assignment1.behaviors;

/**.
 *  Strategy pattern component.
 *  Coffee is frequently drip brewed, so I created this behavior.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class BrewDrip implements BrewBehavior {
  public String getBrew() {
    return "Brew Drip";
  }

}
