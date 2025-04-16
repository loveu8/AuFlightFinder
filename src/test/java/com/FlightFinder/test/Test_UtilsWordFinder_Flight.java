package com.FlightFinder.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.FlightFinder.utils.UtilsWordFinder;

public class Test_UtilsWordFinder_Flight {

  final UtilsWordFinder utils = UtilsWordFinder.un;

  @Test
  public void testFind_NULL() {
    // Test with a sample input
    String input = null;
    int result = utils.findFlight(input);

    // Assert the result (currently the method always returns 0)
    assertEquals(0, result, "testFind_NULL should return 0");
  }

  @Test
  public void testFind_EmptyString() {
    // Test with a sample input
    String input = "";
    int result = utils.findFlight(input);

    // Assert the result (currently the method always returns 0)
    assertEquals(0, result, "testFind_EmptyString should return 0");
  }
  
  @Test
  public void testmorethan_100() {
    // Test with a sample input
    String input = "teeeeeeeeteeeeeeee"
        + "teeeeeeeeteeeeeeee"
        + "teeeeeeeeteeeeeeee"
        + "teeeeeeeeteeeeeeee"
        + "teeeeeeeeteeeeeeee"
        + "teeeeeeeeteeeeeeee"
        + "teeeeeeeeteeeeeeee"
        + "teeeeeeeeteeeeeeee"
        + "teeeeeeeeteeeeeeee"
        + "teeeeeeeeteeeeeeee";
    int result = utils.findSameWord("tell",input);
    // Assert the result (currently the method always returns 0)
    assertEquals(0, result, "testFind_teeeeeeee should return 0");
  }


  @Test
  public void testFind_flight() {
    // Test with a sample input
    String input = "flight";
    int result = utils.findFlight(input);

    // Assert the result (currently the method always returns 0)
    assertEquals(1, result, "testFind_flight should return 1");
  }

  @Test
  public void testFind_lightf() {
    // Test lightf
    String input = "lightf";
    int result = utils.findFlight(input);

    // Assert the result
    assertEquals(1, result, "testFind_lightf should return 1 for empty input");
  }

  @Test
  public void testFind_flightflight() {
    // Test flightflight
    String input = "flightflight";
    int result = utils.findFlight(input);

    // Assert the result
    assertEquals(2, result, "findFlight should return 2");
  }

  @Test
  public void testFind_flightftlhigthflig() {
    // Test flight ftlhig thflig
    String input = "flightflightthflig";
    int result = utils.findFlight(input);

    // Assert the result
    assertEquals(3, result, "flightftlhigthflig should return 3");
  }

  @Test
  public void testFind_flightcccfffhhhrtyyuimofiighlttyynytonkjtyioflightthflig() {
    // Test flightcccfffhhhrtyyuimofiighlttyynytonkjtyioflightthflig
    String input = "flightcccfffhhhrtyyuimofiighlttyynytonkjtyioflightthflig";
    int result = utils.findFlight(input);
    result = utils.findSameWord("flight",input);

    // Assert the result
    assertEquals(4, result,
        "flightcccfffhhhrtyyuimofiighlttyynytonkjtyioflightthflig should return 4");
  }
  
}
