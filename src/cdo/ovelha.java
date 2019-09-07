/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author vinic
 */
public class ovelha implements Serializable{
    
    private String id;
    private String sex;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private cobertura cober;
    private vacina vac;
    private String father;
    private String mother;
    private List<Integer> son;

    
    public void setAll(String id, String sex, int dayOfBirth, int monthOfBirth, int yearOfBirth, int dayOfVac, int monthOfVac, int yearOfVac, int targetVac, int dayOfCor, int monthOfCor, int yearOfCor , int targetCor , String mother, String father ){
        this.setId(id);
        this.setSex(sex);
        this.setDayOfBirth(dayOfBirth);
        this.setMonthOfBirth(monthOfBirth);
        this.setYearOfBirth(yearOfBirth);
        
        this.vac.setDay(dayOfVac);
        this.vac.setMonth(monthOfVac);
        this.vac.setYear(yearOfBirth);
        this.vac.setTarget(targetVac);
        
        this.cober.setDay(dayOfCor);
        this.cober.setMonth(monthOfCor);
        this.cober.setYear(yearOfCor);
        this.cober.setTarget(targetCor);
        
        this.setMother(mother);
        this.setFather(father);
        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the dayOfBirth
     */
    public int getDayOfBirth() {
        return dayOfBirth;
    }

    /**
     * @param dayOfBirth the dayOfBirth to set
     */
    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    /**
     * @return the monthOfBirth
     */
    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    /**
     * @param monthOfBirth the monthOfBirth to set
     */
    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    /**
     * @return the yearOfBirth
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * @param yearOfBirth the yearOfBirth to set
     */
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * @return the cober
     */
    public cobertura getCober() {
        return cober;
    }

    /**
     * @param cober the cober to set
     */
    public void setCober(cobertura cober) {
        this.cober = cober;
    }

    /**
     * @return the vac
     */
    public vacina getVac() {
        return vac;
    }

    /**
     * @param vac the vac to set
     */
    public void setVac(vacina vac) {
        this.vac = vac;
    }

    /**
     * @return the father
     */
    public String getFather() {
        return father;
    }

    /**
     * @param father the father to set
     */
    public void setFather(String father) {
        this.father = father;
    }

    /**
     * @return the mother
     */
    public String getMother() {
        return mother;
    }

    /**
     * @param mother the mother to set
     */
    public void setMother(String mother) {
        this.mother = mother;
    }

    /**
     * @return the son
     */
    public List<Integer> getSon() {
        return son;
    }

    /**
     * @param son the son to set
     */
    public void setSon(List<Integer> son) {
        this.son = son;
    }
    
    
    
    

    
    
    
    
    
}
