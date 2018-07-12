package edu.bu.met.cs665.assignment1.behaviors;

/**.
 *  Strategy pattern component.
 *  Tea frequently uses immersion (also called Steeping), so I created this behavior.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class BrewImmersion implements BrewBehavior {
  
  /**
   * {@inheritDoc}
   */
  @Override
  public String getBrew() {
    return "Brew Immersion";
  }
  

}
