package com.lab9b;

public class Scientist implements Student,Employee {
    private int numOfPubs;
    private String nameOfEmployee;
    private String employeeNumber;
    private String university;
    private String highDegree;
    public String getEmployeeNumber(){
        return nameOfEmployee;
    }
    public void setEmployeeNumber(String s){
        nameOfEmployee=s;
    }
    public String getEmployeeName(){
        return employeeNumber;
    }
    public void setEmployeeName(String b){
        employeeNumber=b;
    }
    public void setNumOfPubs(int a){
        numOfPubs=a;
    }
    public int getNumOfPubs(){
        return numOfPubs;
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
}
