package com.lab9b;

public class Manager implements Employee,Student {
    private String nameOfEmployee;
    private String employeeNumber;
    private String university;
    private String highDegree;
    private String titleOfManager;
    private int golfDues;
    public void setEmployeeNumber(String s){
        nameOfEmployee=s;
    }
    public String getEmployeeNumber(){
        return nameOfEmployee;
    }
    public int getGolfDues(){
        return golfDues;
    }
    public void setGolfDues(int e){
        golfDues=e;
    }
    public String getEmployeeName(){
        return employeeNumber;
    }
    public void setEmployeeName(String b){
        employeeNumber=b;
    }
    public String getUniversity(){
        return university;
    }
    public void setUniversity(String c){
        university=c;
    }
    public String getHighestDegree(){
        return highDegree;
    }
    public void setHighestDegree(String d){
        highDegree=d;
    }
    public String getTitleOfManager(){
        return titleOfManager;
    }
    public void setTitleOfManager(String f){
        titleOfManager=f;
    }


}
