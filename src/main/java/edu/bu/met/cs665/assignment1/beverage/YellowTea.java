package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.FrenchPress;

/**.
 *  Yellow Tea is a concrete implementation of Tea.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class YellowTea extends Tea {
  
  /**
   * YellowTea constructor, which sets the brew behavior to FrenchPress.
   * In the PDF, I show an article that says FrenchPress can be used to
   * brew tea (although its rare). I just wanted to use a different brew method 
   * on at least one tea.
   * This lets me demonstrate how the Strategy Pattern lets us re-use code since
   * French Press is now used in both coffee and tea classes.
   */
  public YellowTea() {
    setDescription("Yellow Tea");
    setBrewBehavior(new FrenchPress());
  }
    
}
