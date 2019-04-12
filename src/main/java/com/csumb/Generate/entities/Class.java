package com.csumb.Generate.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Class {

    @Id
    private String id;
    private String department;
    private String className;
    private String classRoom;
    private int maxNumSections;
    private int maxNumStudentPerSection;

    public Class() {
        this.department = "";
        this.className = "";
        this.classRoom = "";
        this.maxNumStudentPerSection = 30;
        this.maxNumSections = 5;
    }

    public Class(String department, String className) {
        this.department = department;
        this.className = className;
        this.classRoom = "";
        this.maxNumStudentPerSection = 30;
        this.maxNumSections = 5;
    }

    public Class(String department, String className, String id) {
        this.department = department;
        this.className = className;
        this.id = id;
        this.classRoom = "";
        this.maxNumStudentPerSection = 30;
        this.maxNumSections = 5;
    }


    public Class(String department, String className, String id, int maxNumSections, int maxNumStudentPerSection) {
        this.department = department;
        this.className = className;
        this.id = id;
        this.classRoom = "";
        this.maxNumStudentPerSection = maxNumStudentPerSection;
        this.maxNumSections = maxNumSections;
    }

    public Class(String department, String className, String id, int maxNumStudentPerSection){
        this.department = department;
        this.className = className;
        this.id = id;
        this.classRoom = "";
        this.maxNumStudentPerSection = maxNumStudentPerSection;
    }


    public Class(String department, String className, String roomNum, String id) {
        this.department = department;
        this.className = className;
        this.id = id;
        this.classRoom = roomNum;
        maxNumStudentPerSection = 30;
    }


    public Class(Class c) {
        this.id = c.getId();
        this.department = c.getDepartment();
        this.className = c.getClassName();
        this.classRoom = c.getClassRoom();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMaxNumStudentPerSection() {
        return maxNumStudentPerSection;
    }

    public void setMaxNumStudentPerSection(int maxNumStudentPerSection) {
        this.maxNumStudentPerSection = maxNumStudentPerSection;
    }

    public int getMaxNumSections() {
        return maxNumSections;
    }

    public void setMaxNumSections(int maxNumSections) {
        this.maxNumSections = maxNumSections;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", className='" + className + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", maxNumSections=" + maxNumSections +
                ", maxNumStudentPerSection=" + maxNumStudentPerSection +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Class)) return false;
        Class aClass = (Class) o;
        return maxNumSections == aClass.maxNumSections &&
                maxNumStudentPerSection == aClass.maxNumStudentPerSection &&
                id.equals(aClass.id) &&
                department.equals(aClass.department) &&
                className.equals(aClass.className) &&
                classRoom.equals(aClass.classRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department, className, classRoom, maxNumSections, maxNumStudentPerSection);
    }
}