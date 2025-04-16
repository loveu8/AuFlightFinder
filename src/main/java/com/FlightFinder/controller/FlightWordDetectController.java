package com.FlightFinder.controller;

import com.FlightFinder.utils.UtilsWordFinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightWordDetectController {

    /**
     * API Endpoint: /api/flightWordDetect?detectWord={input}
     * 
     * Call UtilsWordFinder.un.flightWordDetect() to count "flight" how many times
     *
     * @param detectWord user input
     * @return flight timers
     */
    @GetMapping("/api/flightWordDetect")
    public String flightWordDetect(@RequestParam String detectWord) {
      // 呼叫工具列舉中的 findFlight 方法進行計算
      int count = UtilsWordFinder.un.findSameWord("flight",detectWord);
      return "Your word can ba a \"flight\" count will be：" + count;
    }
}