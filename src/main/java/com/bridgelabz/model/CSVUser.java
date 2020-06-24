package com.bridgelabz.model;

import com.opencsv.bean.CsvBindByName;

public class CSVUser {
    @CsvBindByName
    private String name;
    @CsvBindByName(column = "email", required = true)
    private String email;
    @CsvBindByName(column = "phone")
    private String phoneNo;
    public CSVUser(){

    }
    public CSVUser(String name, String email, String phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    @Override
    public String toString() {
        return "com.bridgelabz.model.CSVUser{" + "name='" + name + '\'' + ", email='" + email + '\''
                + ",phoneNo='" + phoneNo + '\'' + '}';
    }
}
