package edu.bu.met.cs665.assignment1;

import edu.bu.met.cs665.assignment1.beverage.Beverage;
import edu.bu.met.cs665.assignment1.condiments.Milk;
import edu.bu.met.cs665.assignment1.condiments.Sugar;
import java.util.Map;

/**.
 *  Vending Machine is the controller class that coordinates the operation of the 
 *  vending machine. I had to add a few getters and setters to open up this class
 *  enough for jUnit testing.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class VendingMachine {
  private Beverage beverage; // Becomes the user's selected beverage
  private Menu menu;
  private boolean testMode = false;
  
  /**.
   * Constructor initalizes menu object
   */
  public VendingMachine() {
    menu = new Menu();
  }
  
  
  /**
   * Sets the beverage selected by the user. Necessary for Junit
   * @param beverage of type Beverage to set as the user's selected drink
   */
  public void setBeverage(Beverage beverage) {
    this.beverage = beverage;
  }
  
  /**
   * Gets the beverage selected by the user. Necessary for Junit
   * @return Beverage to be returned
   */
  public Beverage getBeverage() {
    return beverage;
  }
  
  /**
   * Test mode for jUnit testing. If test mode is true, the vending machine
   * will not reset and show the menu again after making a beverage.
   * @param mode Boolean based on the test mode status.
   */
  public void setTestMode(boolean mode) {
    this.testMode = mode;
  }
  
  /**
   * Getter for the menu component for jUnit testing.
   * @return the associated Menu object
   */
  public Menu getMenu() {
    return menu;
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
    
    // This makes the jUnit test possible so the menu doesn't restart.
    if (!testMode) {
      reset();
    }
    
 
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

