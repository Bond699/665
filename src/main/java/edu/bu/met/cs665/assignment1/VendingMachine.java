package edu.bu.met.cs665.assignment1;

import java.util.Map;
import edu.bu.met.cs665.assignment1.behaviors.*;
import edu.bu.met.cs665.assignment1.beverage.*;
import edu.bu.met.cs665.assignment1.condiments.*;
/**.
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class VendingMachine {
  private Beverage beverage;
  Map<Integer, Beverage> beverages;
  Menu menu;
  
  public VendingMachine() {
    menu = new Menu();
  }
  
  /**
   * Place a description of your method here.
   */
  public void start() {
    beverage = menu.displayMainMenu();
    menu.askCondiments();
    brew();
  }
  

  /**
   * Place a description of your method here.
   */
  public void brew() {
    System.out.println();
    System.out.println("Brewing . . . ");
    System.out.println("Brew Behavior/Mode: " + beverage.getBrewBehavior().getBrew());
    System.out.println();
    for (int i = menu.getMilk(); i > 0; i--) {
      beverage = new Milk(beverage);
    }
    
    for (int i = menu.getSugar(); i > 0; i--) {
      beverage = new Sugar(beverage);
    }
    
    System.out.println("Brewing Complete: " + beverage.getDescription());
    System.out.println();
    reset();
 
  }
  
  /**
   * Place a description of your method here.
   */
  public void reset() {
    // disassociate object on heap for garbage collection
    beverage = null;
    start();
  }
  

}

