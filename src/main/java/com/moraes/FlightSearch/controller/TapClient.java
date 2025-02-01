package com.moraes.FlightSearch.controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.moraes.FlightSearch.model.Tap;

@Component
public class TapClient {
    private static final String API_URL = "https://www.flytap.com/api/calendar?functionName=calendar";

    public List<Tap> getPrice(String origin, String destination, String month, String year) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        // headers.setBearerAuth("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiItYnFCaW5CaUh6NFlnKzg3Qk4rUFUzVGFYVVd5UnJuMVQvaVYvTGp4Z2VTQT0iLCJzY29wZXMiOlsiUk9MRV9BTk9OWU1PVVNfVVNFUiJdLCJob3N0IjoidGFwbHBhYjA0MDAwMDI5LmludGVybmFsLmNsb3VkYXBwLm5ldCIsInJhbmRvbSI6Iks2TjZKIiwiaWF0IjoxNjk2MTY4NDU1LCJleHAiOjE2OTYxODY0NTV9.qM9Dd62TPSe3_oj0vW8dmv61WdG6MQQj2FC8b8irdRA");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        // headers.setConnection("keep-alive");

        JSONObject jsonObject = createFlightSearchRequest(origin, destination, month, year);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = new HttpEntity<>(jsonObject.toString(), headers);
        ResponseEntity<Map<String, Object>> responseEntity = restTemplate.exchange(
            API_URL, 
            HttpMethod.POST, 
            entity, 
            new ParameterizedTypeReference<Map<String, Object>>() {}
        );

        Map<String, Object> response = responseEntity.getBody();
        
        return extractBestPrices(response);
    }

    private JSONObject createFlightSearchRequest(String origin, String destination, String month, String year) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("cabinClass", "E");
        jsonObject.put("destination", destination);	
        jsonObject.put("market", "BR");
        jsonObject.put("month", month);
        jsonObject.put("origin", origin);
        jsonObject.put("paxType", "ADT");
        jsonObject.put("payWithMiles", false);
        jsonObject.put("starAlliance", false);
        jsonObject.put("tripType", "R");
        jsonObject.put("year", year);
        return jsonObject;
    }

    private List<Tap> extractBestPrices(Map<String, Object> response) {
        if(response != null) {       
            Object dataObject = response.get("data");
            Map<?,?> data = null;
            if(dataObject instanceof Map){
            data = (Map<?,?>) dataObject;
            }
            if(data != null){
                ObjectMapper mapper = new ObjectMapper();
                List<Tap> bestPriceForDates = null;
                if(data.get("bestPriceForDates") instanceof ArrayList){
                    bestPriceForDates = mapper.convertValue(data.get("bestPriceForDates"), new TypeReference<List<Tap>>() {});
                }
                return bestPriceForDates;
            }
        }
        return null;
    }
}
