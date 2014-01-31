/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author dkerr
 */
public class WelcomeService {
    private Calendar currentDate;
   
    public WelcomeService() {
        this.currentDate = Calendar.getInstance();
    }
    
    public String timeOfDay() {
        int hour = currentDate.get(Calendar.HOUR_OF_DAY);
        String timeOfDay = "";
        if(hour > 12 & hour < 5) {
            timeOfDay = "afternoon";
            //System.out.println("a");
        } else if(hour > 5 && hour < 24) {
            timeOfDay = "evening";
            //System.out.println("e");
        } else {
            timeOfDay = "morning";
            //System.out.println("m");
        }
        
        return timeOfDay;
        
    }
    
    public String welcomeMessage(String name) {
        return "Good " + timeOfDay() + " " + name;
    }

    public Calendar getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Calendar currentDate) {
        this.currentDate = currentDate;
    }
    
    
}


