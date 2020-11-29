package ru.kharlanov.solveeulerproblem.Problem3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author YuriyKharlanov
 */
public class Stage1Test {
  
  public Stage1Test() {
  }

  @org.junit.jupiter.api.BeforeAll
  public static void setUpClass() throws Exception {
  }

  @org.junit.jupiter.api.AfterAll
  public static void tearDownClass() throws Exception {
  }

  @org.junit.jupiter.api.BeforeEach
  public void setUp() throws Exception {
  }

  @org.junit.jupiter.api.AfterEach
  public void tearDown() throws Exception {
  }

  @org.junit.jupiter.api.Test
  public void testMain() {
    Stage1 st1 = new Stage1();
    assertEquals(6857, st1.last, "Problem 3 resolved! suscess!!!");
  }
  
}
