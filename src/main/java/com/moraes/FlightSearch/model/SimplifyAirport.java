package com.moraes.FlightSearch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SimplifyAirport {
    private String code;
    private String name;
    private String city;
    private String state;
    private String country;
}
