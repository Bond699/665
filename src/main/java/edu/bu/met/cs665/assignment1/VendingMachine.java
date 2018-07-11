package edu.bu.met.cs665.assignment1;

import edu.bu.met.cs665.assignment1.beverage.Beverage;
import edu.bu.met.cs665.assignment1.condiments.Milk;
import edu.bu.met.cs665.assignment1.condiments.Sugar;
import java.util.Map;

/**.
 *  Vending Machine is the controller class that coordinates
 *  the operation of the vending machine.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class VendingMachine {
  private Beverage beverage; // Becomes the user's selected beverage
  private Menu menu;
  
  /**.
   * Constructor initalizes menu object
   */
  public VendingMachine() {
    menu = new Menu();
  }
  
  /**
   * Starts the operation of the vending machine.
   */
  public void start() {
    beverage = menu.displayMainMenu();
    menu.askCondiments();
    brew();
  }
  

  /**
   * Makes the coffee and tea. Strategy pattern is used first for beverage 
   * brew behavior. Then the decorator pattern is used for condiments
   */
  public void brew() {
    System.out.println();
    System.out.println("Brewing . . . ");

    // Strategy pattern is used for brew behavior selection 
    System.out.println("Brew Behavior/Mode: " + beverage.getBrewBehavior().getBrew());
    System.out.println();
    
    // Could move this out to a factory pattern or abstract factory pattern.
    // Worried about making this assignment too complicated with too many patterns.
    // Decorator wraps beverage in milk object(s)
    for (int i = menu.getMilk(); i > 0; i--) {
      beverage = new Milk(beverage);
    }
    
    // Decorator wraps beverage in sugar object(s)
    for (int i = menu.getSugar(); i > 0; i--) {
      beverage = new Sugar(beverage);
    }
    
    System.out.println("Brewing Complete: " + beverage.getDescription());
    System.out.println();
    reset();
 
  }
  
  /**
   * Seems like a good idea for the old beverage object to be gone when
   * the vending machine is finished with an order and is ready for a new order.
   */
  public void reset() {
    // disassociate object on heap for garbage collection
    beverage = null;
    start();
  }
  

}

