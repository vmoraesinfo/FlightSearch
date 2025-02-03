package com.moraes.FlightSearch.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.moraes.FlightSearch.model.Tap;

public class LatamClient {
    private static final String LATAM_URL = "https://www.latamairlines.com/pt-br/flights/_next/data/zhaqf6DmLrgu7ki7z5lHj/pt-br/flights.json?origin=POA&outbound=2025-04-17T12%3A00%3A00.000Z&destination=LIS&inbound=2025-04-25T00%3A00%3A00.000Z&adt=1&chd=0&inf=0&trip=RT&cabin=Economy&redemption=false&sort=RECOMMENDED&locale=pt-b";
        public List<Tap> getPrice(String origin, String destination, String month, String year) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

            return null;
        }
}
/*origin: POA
outbound: 2025-04-17T12:00:00.000Z
destination: LIS
inbound: 2025-04-25T00:00:00.000Z
adt: 1
chd: 0
inf: 0
trip: RT
cabin: Economy
redemption: false
sort: RECOMMENDED
locale: pt-br */