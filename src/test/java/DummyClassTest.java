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
  public void EricTrueFails()
  {
    //assertTrue(testClass.returnFalse());
  }

  @Test
  public void EricTruePasses()
  {
    assertTrue(testClass.returnTrue());
  }

  @Test
  public void EricFalseFails()
  {
    //assertFalse(testClass.returnTrue());
  }

  @Test
  public void EricFalsePasses()
  {
    assertFalse(testClass.returnFalse());
  }

  class MyClass
  {
    public boolean returnTrue()
    {
      return true;
    }

    public boolean returnFalse()
    {
      return false;
    }
  }
}