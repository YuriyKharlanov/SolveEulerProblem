package ru.kharlanov.solveeulerproblem.Problem2;

/**
 *
 * @author YuriyKharlanov
 */
public class Stage1 {
  public static void main(String[] args) {
    long time = System.nanoTime();
    int count = 2, first = 1, second = 2, fib = 0;
    boolean log = true;
    while (log) {
      fib = first + second;
      first = second;
      second = fib;
      if (fib < 4000001) {
        if (fib % 2 == 0) {
          count += fib;
          //System.out.println("first:" + first + ", second: " + second + ", fib: " + fib);
        }
      } else log = false;
    }
    System.out.println(count);
    System.out.println(System.nanoTime() - time);
  }
}
