import static org.junit.Assert.*;

import org.junit.Test;


public class ChocolateTest {

  @Test
  public void myTests() {
    assertEquals(Chocolate.breakChocolate(5, 5) , 24);
    assertEquals(Chocolate.breakChocolate(1, 1) , 0);
  }

}
