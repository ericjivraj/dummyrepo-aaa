import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DummyClassTest1
{
  private MyClass testClass;

  public DummyClassTest1()
  {
    testClass = new MyClass();
  }

  @Test
  public void testReturnTrueFails1()
  {
    assertTrue(testClass.returnFalse());
  }

  @Test
  public void testReturnTruePasses1()
  {
    assertTrue(testClass.returnTrue());
  }

  @Test
  public void testReturnFalseFails1()
  {
    assertFalse(testClass.returnTrue());
  }

  @Test
  public void testReturnFalsePasses1()
  {
    assertFalse(testClass.returnFalse());
  }

  class MyClass
  {
    public boolean returnTrue()
    {
      return true;
    }

    // NOTHING 1ssss WWEEEEEEEE

    public boolean returnFalse()
    {
      return false;
    }
  }
}