package edu.bu.met.cs665.assignment1.behaviors;

/**.
 *  Brew Behavior is what I chose to change with the strategy pattern.
 *  I don't drink coffee or tea. I drink only water. I researched this a little
 *  better to understand the coffee and tea brewing methods. Each brew behavior
 *  implements this interface. Each class that implements this interface is 
 *  prefixed with "Brew".
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public interface BrewBehavior {
  public String getBrew(); 
}
