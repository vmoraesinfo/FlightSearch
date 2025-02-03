package com.moraes.FlightSearch.controller;

import java.util.ArrayList;
import java.util.List;

import com.moraes.FlightSearch.model.Tap;

public class TapUtils {
    
    public static List<Tap> getLowestFareInList(List<Tap> tap) {
        if (tap == null || tap.size() == 0) {
            return new ArrayList<>();
        }
        List<Tap> lowestFareTap = new ArrayList<>();
        lowestFareTap.add(tap.get(0));
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
