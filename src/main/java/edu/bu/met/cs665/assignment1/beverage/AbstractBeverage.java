package edu.bu.met.cs665.assignment1.beverage;

import edu.bu.met.cs665.assignment1.behaviors.BrewBehavior;
import edu.bu.met.cs665.assignment1.behaviors.BrewNoWay;
import edu.bu.met.cs665.assignment1.beverage.Beverage;

/**
 *  AbstractBeverage implements the Beverage interface. AbstractBeverage contains
 *  methods and fields common to all drinks to avoid code duplication.
 * 
 *  @author Josh Bond
 *  @version Jul 10, 2018
 */
public class AbstractBeverage implements Beverage {
  // description of the beverage
  private String description;
  
  // The brew behavior, part of the strategy pattern.
  private BrewBehavior brewBehavior;
  
  /**
   * Constructor for this class. Description is set in the concrete classes.
   */
  public AbstractBeverage() {
    brewBehavior = new BrewNoWay();
    description = "";
  }
    
  /**
   * {@inheritDoc}
   */
  @Override
  public String getDescription() {
    return this.description;
  }
  
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void setDescription(String description) {
    this.description = description;
  }
  
  
  /**
   * {@inheritDoc}
   */
  @Override
  public BrewBehavior getBrewBehavior() {
    return this.brewBehavior;
  }
  
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void setBrewBehavior(BrewBehavior brewBehavior) {
    this.brewBehavior = brewBehavior;
  }
  
  
}
