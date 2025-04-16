package com.FlightFinder.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.FlightFinder.utils.UtilsWordFinder;

public class Test_UtilsWordFinder {

  final UtilsWordFinder utils = UtilsWordFinder.un;

  @Test
  public void testFind_NULL() {
    // Test with a sample input
    String input = null;
    int result = utils.findSameWord("flight",input);

    // Assert the result (currently the method always returns 0)
    assertEquals(0, result, "testFind_NULL should return 0");
  }

  @Test
  public void testFind_EmptyString() {
    // Test with a sample input
    String input = "";
    int result = utils.findSameWord("flight",input);

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
  public void testFind_flightflight() {
    // Test with a sample input
    String input = "flightflightlight";
    int result = utils.findSameWord("flight",input);
    // Assert the result (currently the method always returns 0)
    assertEquals(2, result, "testFind_flightflight should return 2");
  }
  
  @Test
  public void testFind_fflliigghhtt() {
    // Test with a sample input
    String input = "fflliigghhtt";
    int result = utils.findSameWord("flight",input);
    // Assert the result (currently the method always returns 0)
    assertEquals(2, result, "testFind_fflliigghhtt should return 2");
  }
  
  @Test
  public void testFind_lightfabc() {
    // Test with a sample input
    String input = "lightfabc";
    int result = utils.findSameWord("flight",input);
    // Assert the result (currently the method always returns 0)
    assertEquals(1, result, "testFind_lightfabc should return 1");
  }
  
  @Test
  public void testFind_abc() {
    // Test with a sample input
    String input = "abc";
    int result = utils.findSameWord("flight",input);
    // Assert the result (currently the method always returns 0)
    assertEquals(0, result, "testFind_abc should return 0");
  }
  
  @Test
  public void testFind_telltellllt() {
    // Test with a sample input
    String input = "telltellllt";
    int result = utils.findSameWord("tell",input);
    // Assert the result (currently the method always returns 0)
    assertEquals(2, result, "testFind_telltellllt should return 2");
  }
  
  @Test
  public void testFind_teeeeeeee() {
    // Test with a sample input
    String input = "teeeeeeee";
    int result = utils.findSameWord("tell",input);
    // Assert the result (currently the method always returns 0)
    assertEquals(0, result, "testFind_teeeeeeee should return 0");
  }

}
