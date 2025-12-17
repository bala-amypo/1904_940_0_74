package com.example.demo.model;

public class StudentDetail {
    private int id;
    private String name;
    private String email;
    
    public StudentDetail(int id, String name, String email, LocalDate dob, float cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public StudentDetail() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;   
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;   
    }
    public void setEmail(String email) {
        this.email = email;
    }

}