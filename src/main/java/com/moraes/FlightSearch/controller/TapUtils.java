package com.moraes.FlightSearch.controller;

import java.util.ArrayList;
import java.util.List;

import com.moraes.FlightSearch.model.Tap;

public class TapUtils {
    
    public static List<Tap> getLowestFareInArray(Tap[] tap) {
        if (tap == null || tap.length == 0) {
            throw new IllegalArgumentException("Tap array must not be null or empty");
        }
        List<Tap> lowestFareTap = new ArrayList<>();
        lowestFareTap.add(tap[0]);
        for (Tap t : tap) {

            if (t.getBestTotalPrice() > 0){
                if(t.getBestTotalPrice() < lowestFareTap.get(0).getBestTotalPrice()) {
                    lowestFareTap.clear();
                    lowestFareTap.add(t);
               } else if(t.getBestTotalPrice() == lowestFareTap.get(0).getBestTotalPrice()){
                    lowestFareTap.add(t);
               }
            }
        }
        return lowestFareTap;
    }
}
