/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdo;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author vinic
 */
public class contador {
    private int day;
    private int month;
    private int year;
    private int target;

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the target
     */
    public int getTarget() {
        return target;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(int target) {
        this.target = target;
    }
    
    /**
     * @return the time since it started counting
     */
    private int timePassed(){
        LocalDate atual = LocalDate.now();
        LocalDate date = LocalDate.of(year,month,day);
        Period period = Period.between(date, atual);
        return period.getDays();
    }
    
    /**
     * @return the time in days to the target
     */
    protected int timeToTarget(){
        int t = timePassed();
        return t - target;
    }
}
