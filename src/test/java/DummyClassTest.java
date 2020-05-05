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
  public void AntonioTrueFails()
  {
    assertTrue(testClass.returnFalse());
  }

  @Test
  public void AntonioTruePasses()
  {
    assertTrue(testClass.returnTrue());
  }

  @Test
  public void AntonioFalseFails()
  {
    assertFalse(testClass.returnTrue());
  }

  @Test
  public void AntonioFalsePasses()
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