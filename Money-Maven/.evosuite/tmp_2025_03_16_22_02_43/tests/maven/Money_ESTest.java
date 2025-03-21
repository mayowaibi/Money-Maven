/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 17 02:04:05 GMT 2025
 */

package maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import maven.Money;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Money_ESTest extends Money_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Money money0 = new Money(2409, "");
      Money money1 = money0.add(money0);
      boolean boolean0 = money1.equals(money0);
      assertEquals(2409, money0.getAmount());
      assertEquals(4818, money1.getAmount());
      assertFalse(money0.equals((Object)money1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Money money0 = new Money(0, (String) null);
      money0.getCurrency();
      assertEquals(0, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Money money0 = new Money((-1), "6-|%+%&");
      money0.getCurrency();
      assertEquals((-1), money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Money money0 = new Money(0, (String) null);
      int int0 = money0.getAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Money money0 = new Money((-1), "");
      int int0 = money0.getAmount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Money money0 = new Money(0, "");
      Money money1 = money0.add(money0);
      assertEquals(0, money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Money money0 = new Money((-1270), "`U9*");
      Money money1 = money0.add(money0);
      assertEquals((-1270), money0.getAmount());
      assertEquals((-2540), money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Money money0 = new Money(1, "P&E");
      Money money1 = new Money(0, (String) null);
      Money money2 = money1.add(money0);
      // Undeclared exception!
      try { 
        money0.equals(money2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Money money0 = new Money(1135, "");
      // Undeclared exception!
      try { 
        money0.add((Money) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("maven.Money", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Money money0 = new Money((-1), "");
      money0.getCurrency();
      assertEquals((-1), money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Money money0 = new Money(1, "P&E");
      int int0 = money0.getAmount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Money money0 = new Money(525, "ma&n]goA<y");
      Money money1 = new Money(525, "ma&nVgo?<y");
      boolean boolean0 = money1.equals(money0);
      assertFalse(boolean0);
      assertEquals(525, money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Money money0 = new Money(13, "maven.Money");
      Money money1 = money0.add(money0);
      boolean boolean0 = money0.equals(money1);
      assertFalse(boolean0);
      assertEquals(13, money0.getAmount());
      assertEquals(26, money1.getAmount());
      assertFalse(money1.equals((Object)money0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Money money0 = new Money(1135, "");
      boolean boolean0 = money0.equals("");
      assertFalse(boolean0);
      assertEquals(1135, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Money money0 = new Money(1, "P&E");
      boolean boolean0 = money0.equals(money0);
      assertEquals(1, money0.getAmount());
      assertTrue(boolean0);
  }
}
