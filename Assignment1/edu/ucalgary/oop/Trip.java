package edu.ucalgary.oop;

/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
All rights reserved.
*/

public class Trip {
    private String arrival;
    private String departure;
    private String city;
    private String country;

    // Returns a string in the format of:
    // value (key)
    public static String fmtString(String key, String value) {
        // needs to take the key and value, where the value is the city, and the key is that it is a city, for example:
        // Paris (City) or Calgary (City) or Canada (Country) value (key)
        return String.format(value, key)
    }

    // Constructor
    public Trip(String[] array) {
    }

    // Given a date string, return just the year
    public static int getYear(String date) {
        int year = date.substring(0, 4);
        return year;
    }

    // Given a date string, return just the month
    // Since it is an int, a date like "2022-01-12" returns 1
    public static int getMonth(String date) {
        int month = date.substring(5, 7);
        return month;
    }

    // Return a formatted string of key/value pairs, with commas
    // between each. See the output for an example.
    public String formatTrip() {
        return String.format("%s (Arrival), %s(Departure), %s(City), %s(Country)", this.arrival, this.departure, this.city, this.country);
    }

    // Getter
    public String getArrival() {
        return this.arrival;
    }

    // Getter
    public String getDeparture() {
        return this.departure;
    }

    // Getter
    public String getCity() {
        return this.city;
    }

    // Getter
    public String getCountry() {
        return this.country;
    }

    // Setter
    public void setArrival(String date) {
        this.arrival =  date;
    }

    // Setter
    public void setDeparture(String date) {
        this.setDeparture = date;
    }

    // Setter 
    public void setCity(String city) {
        this.city = city;
    }

    // Setter 
    public void setCountry(String country) {
        this.country = country;
    }

}

