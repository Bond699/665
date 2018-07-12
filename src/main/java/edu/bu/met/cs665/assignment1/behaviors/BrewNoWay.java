package edu.bu.met.cs665.assignment1.behaviors;

/**.
 *  Strategy pattern component. Use when no brewing is required.
 *  Used by the decorator Condiment Decorators (and could be used by any drink
 *  that doesn't require a brew, maybe like hot chocolate).
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class BrewNoWay implements BrewBehavior {
  
  /**
   * {@inheritDoc}
   */
  @Override
  public String getBrew() {
    return "";
  }

}
