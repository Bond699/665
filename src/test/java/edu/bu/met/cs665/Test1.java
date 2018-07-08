package edu.bu.met.cs665;

import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.Before;

/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 * 
 *  @author Debbie
 *  @version Jul 5, 2018
 */
public class Test1 {

  /**
   * Place a description of your method here.
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {}
  // TODO: Field declarations (if any) go here

  @org.junit.Test
  public void test() {

    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate xmas = LocalDate.parse("22/12/1994", formatter);

    //Person student = new Person("John", "Doe", xmas);

    
    LocalDate oneYearAfterxmas = LocalDate.parse("22/12/1995", formatter);
    // age one year after is one 
    //assertEquals(student.calculateAgeUntilPeriod(oneYearAfterxmas).getYears(), 1);
  }


  // TODO: Constructors (if any) go here


  // TODO: Methods go here
}
