package com.example.colman_second_exercise_android.model;

public class Student {
    private String name;
    private String id;
    private String phoneNumber;
    private String avatarUrl;
    private String address;
    private Boolean cb;

    public Student(String name, String id,String phoneNumber, String address, String avatarUrl, Boolean cb) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.avatarUrl = avatarUrl;
        this.cb = cb;
    }

    public Boolean getCb() {
        return cb;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCb(Boolean cb) {
        this.cb = cb;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
