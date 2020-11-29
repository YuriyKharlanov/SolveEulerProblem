package ru.kharlanov.solveeulerproblem.Problem3;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author YuriyKharlanov
 */
public class Stage1 {

  private final Long number = 600851475143L;
  TreeSet<Long> largestPrimeFactorTreeSet = new TreeSet<>();
  Long last = 0L;
  
  public Stage1() {
    getPrimeFactors();
    getLargestNum();
  }

  public static void main(String[] args) {
    long time = System.currentTimeMillis();
    Stage1 stage1 = new Stage1();
    System.out.println("Running time: " + (System.currentTimeMillis() - time));
  }

  private void getPrimeFactors() {
    for (long i = 2; i <= Math.floor(Math.sqrt(number)); i++) {
      if (number % i == 0) {
        System.out.println(i);
        largestPrimeFactorTreeSet.add(i);
      }
    }
  }

  private void getLargestNum() {

    last = largestPrimeFactorTreeSet.last();
    int count = -1;
    while (count == -1) {
      for (long i = 2; i < Math.floor(Math.sqrt(last)); i++) {
        if (last % i == 0) {
          count++;
        }
      }
      if (count > -1) {
        last = largestPrimeFactorTreeSet.lower(last);
        count = -1;
      } else break;
    }
    System.out.println("Return: " + last);
  }
}
