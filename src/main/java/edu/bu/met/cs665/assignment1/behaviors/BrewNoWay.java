package edu.bu.met.cs665.assignment1.behaviors;

/**.
 *  // No brewing. Used by the decorator Condiment Decorators.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class BrewNoWay implements BrewBehavior {
  public String getBrew() {
    return "";
  }
}
