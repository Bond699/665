package edu.bu.met.cs665.assignment1.behaviors;

/**.
 *  Strategy pattern component.
 *  Espresso uses a high pressure brew, so I created this behavior.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class BrewHighPressure implements BrewBehavior {
  public String getBrew() {
    return "Brew High Pressure";
  }
  

}
