package com.FlightFinder.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Application named “Flight Finder” with the goal of determining how many instances of the word
 * “flight” are possible in a supplied string.
 * 
 * @author DongHuei Jhu
 * @version 16/04/2025 1.0
 * @Test Test_UtilsFlightFinder.java
 */
public enum UtilsWordFinder {

  un;
  
  
  /**
   * <pre>
   * Title : Find a word, you want to know how many
   * 
   * Step 1 : check some rule to make sure all inputs are correct.
   * Step 2 : check checkWord how many letters we need.
   * Step 3 : check detectWord how many letters we have.
   * Step 4 : check how many times can be a part of the checkWord
   * Step 5 : find the most min value. it means how many times can be a word.
   * Result : return result
   *
   * </pre>
   * @param checkWord some word you want to detect
   * @param detectWord long word you want count how many
   */
  public int findSameWord(String checkWord, String detectWord) {

    // count checkWord how many char
    Map<String, Integer> checkWordfreq = new HashMap<>();
    // count checkWord
    Map<String, Integer> countCheckWordfreq = new HashMap<>();
    // count detectWord how many char
    Map<String, Integer> countDetectWordfreq = new HashMap<>();
    // count how many times
    int total = 0;
    
    try {
      // Step 1
      // null
      if (checkWord == null || detectWord == null) {
        return 0;
      }

      // ""
      if ("".equals(checkWord) || "".equals(detectWord)) {
        return 0;
      }
      
      // detect all lowercase
      boolean hasLowercase = detectWord.matches(".*[a-z].*");
      if (!hasLowercase) {
        return 0;
      }
      
      // more than 100
      if (detectWord.length() > 100) {
        return 0;
      }

      // Step 2
      for (char text : checkWord.toCharArray()) {
        String key = String.valueOf(text);
        checkWordfreq.put(key, checkWordfreq.getOrDefault(key, 0) + 1);
        // init count letter
        countCheckWordfreq.put(key, 0);
      }
      
      // Step 3
      for (char text : detectWord.toCharArray()) {
        String key = String.valueOf(text);
        countDetectWordfreq.put(key, countDetectWordfreq.getOrDefault(key, 0) + 1);
      }
      
      // Step 4
      for (String key : checkWordfreq.keySet()) {
        // it means some letter is not there.
        if (countDetectWordfreq.get(key) == null) {
          break;
        }
        if (countDetectWordfreq.get(key) != 0) {
          int timer = countDetectWordfreq.get(key) / checkWordfreq.get(key);
          countCheckWordfreq.put(key, timer);
        }
      }
      
      // Step 5
      int maxValue = Integer.MAX_VALUE;
      String minKey = null;
      for (String key : countCheckWordfreq.keySet()) {
        int value = countCheckWordfreq.get(key);
        if (countCheckWordfreq.get(key) < maxValue) {
          maxValue = value;
          minKey = key;
        }
      }
      
      // final result
      total = countCheckWordfreq.get(minKey);
    } catch (Exception e){
      e.printStackTrace();
    }
    System.out.println("checkWord : " + checkWord + ",detectWord : " + detectWord
        + ",\ncheckWordfreq:" + checkWordfreq 
        + ",\ncountDetectWordfreq:" + countDetectWordfreq
        + ",\ncountCheckWordfreq:" + countCheckWordfreq);
    return total;

  }

  // basic ideal to verify my thought
  public int findFlight(String input) {

    // total count
    int total = 0;
    try {
      // null
      if (input == null) {
        return 0;
      }

      // ""
      if ("".equals(input)) {
        return 0;
      }

      // detect all lowercase
      boolean hasLowercase = input.matches(".*[a-z].*");
      if (!hasLowercase) {
        return 0;
      }


      // more than 100
      if (input.length() > 100) {
        return 0;
      }

      // flight count
      int f = 0;
      int l = 0;
      int i = 0;
      int g = 0;
      int h = 0;
      int t = 0;

      // input data convert to char and count all input char
      char[] charInput = input.toCharArray();
      for (char text : charInput) {
        String temp = String.valueOf(text);
        if ("f".equals(temp)) {
          f++;
        }
        if ("l".equals(temp)) {
          l++;
        }
        if ("i".equals(temp)) {
          i++;
        }
        if ("g".equals(temp)) {
          g++;
        }
        if ("h".equals(temp)) {
          h++;
        }
        if ("t".equals(temp)) {
          t++;
        }
      }

      // check flight
      int loopTime = input.length() / 6;
      for (int index = 0; index < loopTime; index++) {
        // if any chars is zero , it is not passible to match
        if (f == 0 || l == 0 || i == 0 || g == 0 || h == 0 || t == 0) {
          break;
        }
        int f_flag = 0;
        int l_flag = 0;
        int i_flag = 0;
        int g_flag = 0;
        int h_flag = 0;
        int t_flag = 0;
        if (f > 0) {
          f_flag++;
          f--;
        }
        if (l > 0) {
          l_flag++;
          l--;
        }
        if (i > 0) {
          i_flag++;
          i--;
        }
        if (g > 0) {
          g_flag++;
          g--;
        }
        if (h > 0) {
          h_flag++;
          h--;
        }
        if (t > 0) {
          t_flag++;
          t--;
        }
        // sum all flag to check flight
        int check = f_flag + l_flag + i_flag + g_flag + h_flag + t_flag;
        if (check == 6) {
          total++;
        }
      }
      System.out.println("final Input : " + input + ", find : " + total);
    } catch (Exception e) {

    }
    return total;
  }

}
