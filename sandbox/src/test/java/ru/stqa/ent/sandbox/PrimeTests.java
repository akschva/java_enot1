package ru.stqa.ent.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

  @Test(enabled = false)
  public void testPrime () {
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }

  @Test
  public void testNotPrime () {
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }
}
