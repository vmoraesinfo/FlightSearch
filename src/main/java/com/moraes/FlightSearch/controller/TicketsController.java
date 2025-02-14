package com.moraes.FlightSearch.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moraes.FlightSearch.model.Tap;

@RestController
@RequestMapping("/v1/flights/search")
public class TicketsController {
    
    @Autowired
    private TapClient tapClient;
    
        
    @GetMapping("/year/{year}/month/{month}")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public List<Tap> getTicketsByMonth(@PathVariable String year, @PathVariable String month, @RequestParam String origin, @RequestParam String destination) {
        return tapClient.getPrice(origin.toUpperCase(), destination.toUpperCase(), month, year);
    }

    @GetMapping("/year/{year}/month/{month}/lowest")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public List<Tap> getLowestFareInTheMonth(@PathVariable String year, @PathVariable String month, @RequestParam String origin, @RequestParam String destination) {
        return TapUtils.getLowestFareInList(tapClient.getPrice(origin.toUpperCase(), destination.toUpperCase(), month, year));
    }

    @GetMapping("/year/{year}")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public List<Tap> getTicketsByYear(@PathVariable String year, @RequestParam String origin, @RequestParam String destination) {
        List<Tap> bestPriceByMonth = new ArrayList<Tap>();
        IntStream.range(1,13).parallel().forEach(i -> {
            List<Tap> tap = TapUtils.getLowestFareInList(tapClient.getPrice(origin.toUpperCase(), destination.toUpperCase(), String.valueOf(i), year));
            bestPriceByMonth.addAll(tap);
        });
        return bestPriceByMonth;
    }

    @GetMapping("/year/{year}/lowest")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public List<Tap> getLowestFareInTheYear(String year, @RequestParam String origin, @RequestParam String destination) {
        List<Tap> bestPriceByMonth = new ArrayList<Tap>();
        IntStream.range(1,13).parallel().forEach(i -> {
            List<Tap> tap = TapUtils.getLowestFareInList(tapClient.getPrice(origin.toUpperCase(), destination.toUpperCase(), String.valueOf(i), year));
            bestPriceByMonth.addAll(tap);
        });
        List<Tap> tap = TapUtils.getLowestFareInList(bestPriceByMonth);

        return tap;
    }
}
