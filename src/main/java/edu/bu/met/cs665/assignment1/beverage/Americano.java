package edu.bu.met.cs665.assignment1.beverage;


/**.
 *  Americano is a concrete implementation of Coffee.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public class Americano extends Coffee {
  
  /**
   * Americano constructor. The default brew behavior set in Coffee class is
   * drip brew. My intent is for Americano to be drip brewed, so there's no need
   * to set Americano to drip brew, since it inherits this from Coffee.
   */
  public Americano() {
    setDescription("Americano");
  }
}