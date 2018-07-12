package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment1.Menu;
import edu.bu.met.cs665.assignment1.VendingMachine;
import edu.bu.met.cs665.assignment1.beverage.Americano;
import edu.bu.met.cs665.assignment1.beverage.BlackTea;
import edu.bu.met.cs665.assignment1.beverage.Espresso;
import edu.bu.met.cs665.assignment1.beverage.GreenTea;
import edu.bu.met.cs665.assignment1.beverage.LatteMacchiato;
import edu.bu.met.cs665.assignment1.beverage.YellowTea;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


// A few jUnit tests. 


public class TestVendingMachine {
  
  private VendingMachine vm;
  
  @Before
  public void setUp() throws Exception {
    vm = new VendingMachine();
    vm.setTestMode(true);
  }
  
  @Test
  public void testMilk1() {
    Menu menu = new Menu();
    menu.setMilk(1);
    Assert.assertEquals(1, menu.getMilk());
  }
  
  @Test
  public void testSugar2() {
    Menu menu = new Menu();
    menu.setSugar(2);
    Assert.assertEquals(2, menu.getSugar());
  }
  
 
  @Test
  public void testEspressoNoCondiments() {
    vm.getMenu().setSugar(0);
    Assert.assertEquals(0, vm.getMenu().getSugar());
    vm.getMenu().setMilk(0);
    Assert.assertEquals(0, vm.getMenu().getMilk());
    vm.setBeverage(new Espresso());
    vm.brew();
    Assert.assertEquals("Espresso", vm.getBeverage().getDescription());
    Assert.assertEquals("Brew High Pressure", vm.getBeverage().getBrewBehavior().getBrew());
  }
  
  @Test
  public void testLatteMacchiato2Milk2Sugar() {
    vm.getMenu().setSugar(2);
    Assert.assertEquals(2, vm.getMenu().getSugar());
    vm.getMenu().setMilk(2);
    Assert.assertEquals(2, vm.getMenu().getMilk());
    vm.setBeverage(new LatteMacchiato());
    Assert.assertEquals("French Press", vm.getBeverage().getBrewBehavior().getBrew());
    vm.brew();
    Assert.assertEquals("Latte Macchiato + [Milk] + [Milk] + [Sugar] + [Sugar]", 
        vm.getBeverage().getDescription());
  }
  
  @Test
  public void testAmericano1Milk2Sugar() {
    vm.getMenu().setSugar(1);
    Assert.assertEquals(1, vm.getMenu().getSugar());
    vm.getMenu().setMilk(2);
    Assert.assertEquals(2, vm.getMenu().getMilk());
    vm.setBeverage(new Americano());
    Assert.assertEquals("Brew Drip", vm.getBeverage().getBrewBehavior().getBrew());
    vm.brew();
    Assert.assertEquals("Americano + [Milk] + [Milk] + [Sugar]", vm.getBeverage().getDescription());
  }
  
  @Test
  public void testYellowTea2Milk3Sugar() {
    vm.getMenu().setSugar(3);
    Assert.assertEquals(3, vm.getMenu().getSugar());
    vm.getMenu().setMilk(2);
    Assert.assertEquals(2, vm.getMenu().getMilk());
    vm.setBeverage(new YellowTea());
    Assert.assertEquals("French Press", vm.getBeverage().getBrewBehavior().getBrew());
    vm.brew();
    Assert.assertEquals("Yellow Tea + [Milk] + [Milk] + [Sugar] + [Sugar] + [Sugar]", 
        vm.getBeverage().getDescription());     
  }
  
  @Test
  public void testBlackTea3Milk3Sugar() {
    vm.getMenu().setSugar(3);
    Assert.assertEquals(3, vm.getMenu().getSugar());
    vm.getMenu().setMilk(3);
    Assert.assertEquals(3, vm.getMenu().getMilk());
    vm.setBeverage(new BlackTea());
    Assert.assertEquals("Brew Immersion", vm.getBeverage().getBrewBehavior().getBrew());
    vm.brew();
    Assert.assertEquals("Black Tea + [Milk] + [Milk] + [Milk] + [Sugar] + [Sugar] + [Sugar]", 
        vm.getBeverage().getDescription());
  }
  
  @Test
  public void testGreenTea0Milk0Sugar() {
    vm.getMenu().setSugar(0);
    Assert.assertEquals(0, vm.getMenu().getSugar());
    vm.getMenu().setMilk(0);
    Assert.assertEquals(0, vm.getMenu().getMilk());
    vm.setBeverage(new GreenTea());
    Assert.assertEquals("Brew Immersion", vm.getBeverage().getBrewBehavior().getBrew());
    vm.brew();
    Assert.assertEquals("Green Tea", 
        vm.getBeverage().getDescription());
  }
  
}
