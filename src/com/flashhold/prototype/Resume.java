package com.flashhold.prototype;

import java.util.ArrayList;

public class Resume implements Cloneable {
    public String name = null;
    public Integer age = null;
    public String sex = null;
    public ArrayList<String> famMem = new ArrayList<>();
    public WorkExperience work = null;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }// Resume

    public void setName(String name) {
        this.name = name;
    }// setName

    public void setPersonal(String sex, int age, ArrayList<String> famMem) {
        this.age = age;
        this.sex = sex;
        this.famMem = famMem;
    }// setPersonal

    public void setWork(String timeArea, String company) {
        work.timeArea = timeArea;
        work.company = company;
    }// setWork

    /**
     * 重些clone()方法为public类型，并调用Object类的本地clone()方法。
     */
    @Override
    public Resume clone() throws CloneNotSupportedException {
        return (Resume)super.clone();
    }// clone

    public void display() {
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.print("Family member: ");
        for(String elem : famMem)
            System.out.print(elem + " ");
        System.out.println();
        System.out.print("Work experience: " + this.work.timeArea);
        System.out.println(" " + this.work.company);
    }// display
}
