package com.moraes.FlightSearch.controller.airport;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moraes.FlightSearch.model.Airport;
import com.moraes.FlightSearch.model.SimplifyAirport;

@Component
public class AirportSearcher {

        private List<SimplifyAirport> simplifyAirports; 
        public List<SimplifyAirport> getAirports() {
            if(simplifyAirports != null) {
                return simplifyAirports;
            }
            try{
                byte[] jsonData = Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("airports.json").toURI()));
                ObjectMapper objectMapper = new ObjectMapper();
                List<Airport> airports = objectMapper.readValue(jsonData, new TypeReference<List<Airport>>(){});
                simplifyAirports = convertAirpotToSimplifyAirport(airports);
                return simplifyAirports;
            } catch (Exception e) {
                e.printStackTrace();
                return List.of();
            }
        }
        
        private List<SimplifyAirport> convertAirpotToSimplifyAirport(List<Airport> airports) {
            List<SimplifyAirport> simplifyAirports = new ArrayList<>();
            for (Airport airport : airports) {
                simplifyAirports.add(SimplifyAirport.builder()
                        .code(airport.getCode())
                        .city(airport.getCity())
                        .name(airport.getName())
                        .state(airport.getState())
                        .country(airport.getCountry())
                        .build());
            }
            return simplifyAirports;
        }
}
