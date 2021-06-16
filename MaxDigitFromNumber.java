package sk.rajnoha;

//package com.mycompany.mavenproject2;

import org.junit.Assert;
 
public class MaxDigitFromNumber {
  public static void main(String[] args) {
    Assert.assertTrue(maxDigit(0) == 0);
    Assert.assertTrue(maxDigit(52) == 5);
    Assert.assertTrue(maxDigit(390) == 9);

    Assert.assertTrue(maxDigit(-1) == 1);
    Assert.assertTrue(maxDigit(-91) == 9);
    Assert.assertTrue(maxDigit(9911) == 9);
  }
 
  private static int maxDigit(int number) {  
    char[] digits = String.valueOf(number).toCharArray();
  char maxDigit = digits[0];
  for (int i = 1; i < digits.length; i++) {
      if (digits[i] > maxDigit) {
          maxDigit = digits[i];
      }
  }
  return Character.getNumericValue(maxDigit);
  }
}
        