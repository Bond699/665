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
 *  //TODO
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */
public class Menu {
  private Scanner keyboardInput;  // Scanner for keyboard input
  /**.
   * TODO
   */
  Map<Integer, Beverage> menuObjects;
  private int milk;
  private int sugar;
  Beverage beverage;
  
  public int getMilk() {
    return this.milk;
  }
  
  public int getSugar() {
    return this.sugar;
  }
  
    
  /**
   * Place a description of your method here.
   * @return
   */
  public Beverage displayMainMenu() {
    menuObjects = new TreeMap<Integer, Beverage>();
    menuObjects.put(1, new Espresso());
    menuObjects.put(2, new Americano());
    menuObjects.put(3, new LatteMacchiato());
    menuObjects.put(4, new BlackTea());
    menuObjects.put(5, new GreenTea());
    menuObjects.put(6, new YellowTea());
    //return displayMenu(menuObjects, "Choose a Beverage: ");
    
    // Show menu until user makes a valid choice
    // Loop as long as user enters invalid responses
    int input = 0;
    while (input < 1 || input > menuObjects.size()) {
      System.out.println("Choose a Beverage: ");
      for (Entry<Integer, Beverage> entry : menuObjects.entrySet()) {
        System.out.println(entry.getKey() + ". " + entry.getValue().getDescription());
      }

      // Gets keyboard input, which is interpreted below.
      try {
        input = getInput();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input");
        continue;
      }
                 
      beverage = menuObjects.get(input);
      if (beverage == null) {
        System.out.println("Invalid input");
        continue;
      }
      
    }
    return beverage;
  }
  
  public void askCondiments() {
    milk = processCondiments("Milk");
    sugar = processCondiments("Sugar");
  }
   
  
  /**
   * Place a description of your method here.
   * @param name TODO
   * @return
   */
  public int processCondiments(String name) {
    int condiment = -1;
    while (condiment < 0 || condiment > 3) {
      if (name == "Milk") {
        System.out.println("Milk Quantity (0-3): ");
      } else if (name == "Sugar") {
        System.out.println("Sugar Quantity (0-3): ");
      }
  
      // Gets keyboard input
      try {
        condiment = getInput();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input");
        continue;
      }
    }
    return condiment;
  }
  
  /**
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
