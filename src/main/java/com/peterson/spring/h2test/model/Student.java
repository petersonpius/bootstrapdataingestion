package com.peterson.spring.h2test.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String fname;
private String lname;
    @OneToOne

    private Address address;

    @ManyToMany
    @JoinTable(name="teacher_students", joinColumns = @JoinColumn(name="students_id"))
    private Set<Teacher> teachers=new HashSet<>();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student() {
    }

     public Student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Student(String fname, String lname, Set<Teacher> teachers) {
        this.fname = fname;
        this.lname = lname;
        this.teachers = teachers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}
