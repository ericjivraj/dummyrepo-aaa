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
  public void testThatReturnTrueFails()
  {
    throw new NullPointerException();
  }

  @Test
  public void testThatReturnTruePasses()
  {
    assertTrue(testClass.returnTrue());
  }

  @Test
  public void testThatReturnFalseFails()
  {
    assertFalse(testClass.returnTrue());
  }

  @Test
  public void testThatReturnFalsePasses()
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