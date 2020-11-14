package ru.kharlanov.solveeulerproblem.Problem1;

/**
 *
 * @author YuriyKharlanov
 */
public class Stage1 {
  
  public static void main(String[] args) {
    long time = System.currentTimeMillis();
    int count = 0;
    for (int i = 3; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) count += i;
    }
    System.out.println(count);
    System.out.println(System.currentTimeMillis() - time);
  }
  
}
