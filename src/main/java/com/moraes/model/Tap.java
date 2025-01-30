package com.moraes.model;

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

    public Tap() {
    }

    //getters and setters
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public double getBestTotalPrice() {
        return bestTotalPrice;
    }

    public void setBestTotalPrice(double bestTotalPrice) {
        this.bestTotalPrice = bestTotalPrice;
    }

    public int getBestTotalMiles() {
        return bestTotalMiles;
    }

    public void setBestTotalMiles(int bestTotalMiles) {
        this.bestTotalMiles = bestTotalMiles;
    }

    public String getCabinClass() {
        return cabinClass;
    }   

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getInsertionDate() {
        return insertionDate;
    }

    public void setInsertionDate(String insertionDate) {
        this.insertionDate = insertionDate;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public boolean isMonthlyMinimum() {
        return monthlyMinimum;
    }

    public void setMonthlyMinimum(boolean monthlyMinimum) {
        this.monthlyMinimum = monthlyMinimum;
    }

    public boolean isMonthlyMaximum() {
        return monthlyMaximum;
    }

    public void setMonthlyMaximum(boolean monthlyMaximum) {
        this.monthlyMaximum = monthlyMaximum;
    }

    public boolean isStarAlliance() {
        return starAlliance;
    }

    public void setStarAlliance(boolean starAlliance) {
        this.starAlliance = starAlliance;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public boolean isNoFlights() {
        return noFlights;
    }

    public void setNoFlights(boolean noFlights) {
        this.noFlights = noFlights;
    }

    // @Override
    // public String toString() {
    //     return "Tap [arrivalAirport=" + arrivalAirport + ", bestTotalPrice=" + bestTotalPrice + ", bestTotalMiles="
    //             + bestTotalMiles + ", cabinClass=" + cabinClass + ", currency=" + currency + ", departureAirport="
    //             + departureAirport + ", departureDate=" + departureDate + ", insertionDate=" + insertionDate + ", market="
    //             + market + ", tripType=" + tripType + ", monthlyMinimum=" + monthlyMinimum + ", monthlyMaximum="
    //             + monthlyMaximum + ", starAlliance=" + starAlliance + ", soldOut=" + soldOut + ", noFlights=" + noFlights
    //             + "]";
    // }


    
}
