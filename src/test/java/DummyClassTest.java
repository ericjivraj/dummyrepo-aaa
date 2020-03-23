import static org.junit.Assert.*;
import org.junit.Test;

public class DummyClassTest
{
  private MyClass testClass;

  public DummyClassTest()
  {
    testClass = new MyClass();
  }

  @Test
  public void testReturnTrueFails()
  {
    assertTrue(testClass.returnTrue());
  }

  @Test
  public void testReturnTruePasses()
  {
    assertTrue(testClass.returnTrue());
  }

  @Test
  public void testReturnFalseFails()
  {
    assertFalse(testClass.returnFalse());
  }

  @Test
  public void testReturnFalsePasses()
  {
    assertFalse(testClass.returnFalse());
  }

  class MyClass
  {
    public boolean returnTrue()
    {
      return true;
    }

    // Change

    public boolean returnFalse()
    {
      return false;
    }
  }
}