package com.moraes.FlightSearch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tap {
    private String arrivalAirport;
    private double bestTotalPrice;
    private int bestTotalMiles;
    private String cabinClass;
    private String currency;
    private String departureAirport;
    private String departureDate;
    private String insertionDate;
    private String market;
    private String tripType;
    private boolean monthlyMinimum;
    private boolean monthlyMaximum;
    private boolean starAlliance;
    private boolean soldOut;
    private boolean noFlights;

    
}
