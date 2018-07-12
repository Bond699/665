package edu.bu.met.cs665.assignment1.behaviors;

/**.
 *  Coffee can use a French Press and I saw this article that says Tea can use a 
 *  FrenchPress for coffee and tea: https://www.leaf.tv/articles/tea-press-vs-tea-steeping/
 *  I'm not an expert in tea or coffee but you can see from this assignment, I am
 *  changing the brew behavior with the strategy pattern, which is the point, I think.
 * 
 *  @author Josh Bond
 *  @version Jul 7, 2018
 */

public class FrenchPress implements BrewBehavior {
  public String getBrew() {
    return "French Press";
  }

}
