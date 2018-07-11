package edu.bu.met.cs665.assignment1;

import edu.bu.met.cs665.assignment1.beverage.Americano;
import edu.bu.met.cs665.assignment1.beverage.Beverage;
import edu.bu.met.cs665.assignment1.beverage.BlackTea;
import edu.bu.met.cs665.assignment1.beverage.Espresso;
import edu.bu.met.cs665.assignment1.beverage.GreenTea;
import edu.bu.met.cs665.assignment1.beverage.LatteMacchiato;
import edu.bu.met.cs665.assignment1.beverage.YellowTea;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**.
 *  The menu class serves as the user interface.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public class Menu {
  // Scanner for keyboard input
  private Scanner keyboardInput;  
  
  // An alternative to if or case statements for showing the menu
  private Map<Integer, Beverage> menuObjects;
    
  // Tracks user preferences for milk and sugar
  private int milk;
  private int sugar;
  
  // The user's beverage selection
  Beverage beverage;
  
  /**
   * Constructor performs Menu map.
   * TreeMap is chosen for menu display because it guarantees sort order.
   */
  public Menu() {
    menuObjects = new TreeMap<Integer, Beverage>();
    menuObjects.put(1, new Espresso());
    menuObjects.put(2, new Americano());
    menuObjects.put(3, new LatteMacchiato());
    menuObjects.put(4, new BlackTea());
    menuObjects.put(5, new GreenTea());
    menuObjects.put(6, new YellowTea());
  }
  
  // Getter methods for Milk and Sugar
  public int getMilk() {
    return this.milk;
  }
  
  public int getSugar() {
    return this.sugar;
  }
  
    
  /**.
   *   
   * @return the Beverage selected by the user.
   */
  public Beverage displayMainMenu() {
    
    // Show menu until user makes a valid choice
    int input = 0;
    while (input < 1 || input > menuObjects.size()) {
      System.out.println("Choose a Beverage: ");
      
      // Get the Map keys/values and format them for display as a menu
      for (Entry<Integer, Beverage> entry : menuObjects.entrySet()) {
        System.out.println(entry.getKey() + ". " + entry.getValue().getDescription());
      }

      // Gets keyboard input and detect non-integer characters since getInput excepts integers.
      try {
        input = getInput();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input");
      }
      
      // We know an integer was entered. If TreeMap returns null, integer was invalid.
      beverage = menuObjects.get(input);
      if (beverage == null) {
        System.out.println("Invalid input");
      }
      
    }
    
    // If we make it here, valid beverage was chosen. Return beverage to caller.
    return beverage;
  }
  
  /**
   * Called by VendingMachine class. Store user preferences for 
   * condiments like milk and sugar.
   */
  public void askCondiments() {
    milk = processCondiments("Milk");
    sugar = processCondiments("Sugar");
  }
   
  
  /**
   * Get user input for condiments. Error checking on the input
   * @param name String of the condiment.
   * @return int of the condiment quantity
   */
  public int processCondiments(String name) {
    
    // Valid entries are 0-3. We start the quantity at -1.
    int condimentQuantity = -1;
    
    // Loop until the user enters a valid quantity.
    while (condimentQuantity < 0 || condimentQuantity > 3) {
      System.out.println(name + " Quantity (0-3): ");
        
      // Gets keyboard input and detects non-integers since getInput excepts integers.
      try {
        condimentQuantity = getInput();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input");
      }
    }
    return condimentQuantity;
  }
  
  /**.
   * Method gets and returns user's input from the keyboard.
   * 
   */
  private int getInput() {
    // Setup  Scanner object to receive keyboard input
    keyboardInput = new Scanner(System.in);

    // Get the keyboard input
    int input = keyboardInput.nextInt();
    return input;
  }
}
