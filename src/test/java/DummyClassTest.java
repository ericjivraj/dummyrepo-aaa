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
    assertEquals(null, testClass.returnFalse());
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