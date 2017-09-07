/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rccgstart;

/**
 *
 * @author TOBILOBA
 * @version 1.0
 * @since 2017
 */
public class Member {
    private String cName;
    private String cSex;
    private String cPhone;
    private String cAddress;
    private String cDate;
    private String cOccupation;
    
    public Member(String name, String sex, String phone, String address, String date, String occupation){
        cName = name;
        cSex = sex;
        cPhone = phone;
        cAddress = address;
        cDate = date;
        cOccupation = occupation;
    } // end of instance method

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate;
    }

    public void setcOccupation(String cOccupation) {
        this.cOccupation = cOccupation;
    }

    public String getcName() {
        return cName;
    }

    public String getcSex() {
        return cSex;
    }

    public String getcPhone() {
        return cPhone;
    }

    public String getcAddress() {
        return cAddress;
    }

    public String getcDate() {
        return cDate;
    }

    public String getcOccupation() {
        return cOccupation;
    }
    
    
    
} // end of main class
