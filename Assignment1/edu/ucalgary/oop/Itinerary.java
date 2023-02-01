package edu.ucalgary.oop;

/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
All rights reserved.
*/

public class Itinerary {
    private Trip[] trips = new Trip[20];

    // Returns a string in the format of:
    // value (key)
    public static String fmtString(String key, String value) {
        // needs to take the key and value, where the value is the city, and the key is that it is a city, for example:
        // Paris (City) or Calgary (City) or Canada (Country) value (key)
        return String.format(value, key)
    }

    // Constructor
    public Itinerary(String[][] myTrips) {

    }

    // Getter
    public Trip[] getTrips() {
    }

    public String formatByArrival() {
        
    }

    // The first array holds years (2021-2023).
    // The second array holds months.
    // The third array holds formatted locations occurring in the year/month
    String[][][] byDate() {
    }

}
