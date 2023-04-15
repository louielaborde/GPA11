// Astronaut.java
// L. Laborde 
// 4/14/23
// class representing an astronaut

package com.spacex.personnel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Astronaut 
{
    private String name;
    private double heightCm;  // height in centimeters
    private double weightKg;  // weight in kilograms
    private LocalDateTime arrival; // arrival date/time
    private Period stayPeriod; // length of stay in days
    private LocalDate departuredate; // estimated date of departure
    
    // overload, create an astronaut with specified name, height, and weight
    public Astronaut(String name, double heightCm, double weightKg,
                     LocalDateTime arrival, Period stayPeriod, 
                     LocalDate departureDate) 
    {
        this.name = name;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.arrival = arrival;
        this.stayPeriod = stayPeriod;
        this.departuredate = departureDate;
    }
    
    @Override
    public String toString() 
    {
        DecimalFormat decFormatter = new DecimalFormat(".#");
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter ldFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        
        String departureDateString = null;
        if (departuredate != null)
        {
           departureDateString = ldFormatter.format(departuredate);
        }
        
        return "name: " + name + "\n" + 
               "height: " + decFormatter.format(heightCm) + " (cm)\n" +
               "weight: " + decFormatter.format(weightKg) + " (kg)\n" +
               "arrival: " + dtFormatter.format(arrival) + "\n" +
               "stay length: " + stayPeriod.getDays() + " days\n" +
               "est. return: " + departureDateString + "\n";
    }
}