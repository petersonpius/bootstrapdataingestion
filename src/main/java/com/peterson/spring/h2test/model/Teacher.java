package com.peterson.spring.h2test.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Teacher {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String fname;
        private String lname;

        @ManyToMany(mappedBy = "teachers")
        private Set<Subject> subjects=new HashSet<>();
        @ManyToMany(mappedBy = "teachers")
        private Set<Student> students= new HashSet<>();

    public Teacher() {

    }
    public Teacher(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Teacher(String fname, String lname, Set<Subject> subjects, Set<Student> students) {
        this.fname = fname;
        this.lname = lname;
        this.subjects = subjects;
        this.students = students;
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

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    }

