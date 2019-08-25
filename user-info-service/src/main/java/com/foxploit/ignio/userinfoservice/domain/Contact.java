package com.foxploit.ignio.userinfoservice.domain;

import javax.persistence.Entity;

@Entity
public class Contact {

    private String contactId;
    private String stationName;
    private String[] mobileNumbers;
    private String email;
    private String city;
    private String address;
    private int postalCode;

    public Contact(String contactId, String stationName, String[] mobileNumbers, String email, String city, String address, int postalCode) {
        this.contactId = contactId;
        this.stationName = stationName;
        this.mobileNumbers = mobileNumbers;
        this.email = email;
        this.city = city;
        this.address = address;
        this.postalCode = postalCode;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String[] getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(String[] mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

}