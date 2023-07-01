package com.example.demo_testing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "human")
public class Human {

    @Id
    @Column(name="id")
    private int id;
    @Column(name="grade")
    private String grade;
    @Column(name="className")
    private String className;
    @Column(name="fullName")
    private String fullName;
    @Column(name="cccd")
    private String CCCD;
    @Column(name="age")
    private int age;

    public Human(){

    }
    public Human(String fullName, String CCCD, int age, int id, String grade, String className) {
        this.fullName = fullName;
        this.CCCD = CCCD;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.className = className;
    }

    // Getters and Setters
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return this.fullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public String getCCCD() {
        return this.CCCD;
    }
    public void setCCCD(String CCCD){
        this.CCCD = CCCD;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


}
