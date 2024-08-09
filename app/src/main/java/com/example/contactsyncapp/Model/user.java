package com.example.contactsyncapp.Model;

public class user {
    private String name;
    private String phone;
    private long createdAt;

    // Default constructor is needed for Realtime Database
    public user() {}

    public user(String name, String phone, long createdAt) {
        this.name = name;
        this.phone = phone;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
