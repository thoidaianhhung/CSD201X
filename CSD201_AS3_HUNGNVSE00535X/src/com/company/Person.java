package com.company;

public class Person {
    private String staffCode;
    private String staffName;
    private String dateOfBirth;
    private String placeOfBirth;


    public Person(String code, String name, String date, String place) {
        staffCode = code;
        staffName = name;
        dateOfBirth = date;
        placeOfBirth = place;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String toString() {
        return String.format("%-20s%-20s%-20s%-20s", staffCode, staffName, dateOfBirth, placeOfBirth);
    }
}
