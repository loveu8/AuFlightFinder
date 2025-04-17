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
     * Call UtilsWordFinder.un.findSameWord() to count "flight" how many times
     *
     * @param detectWord user input
     * @return flight timers
     */
    @GetMapping("/api/flightWordDetect")
    public String flightWordDetect(@RequestParam String detectWord) {
      // check how many
      int count = UtilsWordFinder.un.findSameWord("flight",detectWord);
      return "Your word can ba a \"flight\" count will be：" + count;
    }
    
    /**
     * API Endpoint: /api/flightWordDetect?detectWord={input}
     * 
     * Call UtilsWordFinder.un.findSameWord() to count "checkWord" how many times
     *
     * @param checkWord user input
     * @param detectWord user input
     * @return checkWord timers
     */
    @GetMapping("/api/wordDetect")
    public String wordDetect(@RequestParam String checkWord, @RequestParam String detectWord) {
      // check how many
      int count = UtilsWordFinder.un.findSameWord(checkWord,detectWord);
      return "Your word can ba a \""+checkWord+"\" count will be：" + count;
    }
}