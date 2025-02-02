package com.moraes.FlightSearch.controller.airport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moraes.FlightSearch.model.SimplifyAirport;

@RestController
@RequestMapping("/v1/airports/search")
public class AirportsControler {
    @Autowired
    private AirportSearcher airportSearcher;
            
    @GetMapping("/")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public List<SimplifyAirport> getListOfAirports() {
       return airportSearcher.getAirports();
    }
}
