package com.Lab9a;
import java.util.Scanner;

public class Student {
    private int rollNo;
    private String name;
    private String address;
    private Scanner obj = new Scanner (System.in);

    public Student(){
        rollNo=0;
        name="";
        address="";
    }
    public void getData(){
        System.out.println("Enter Your Roll Number : ");
        rollNo=obj.nextInt();
        obj.nextLine();
        System.out.println("Enter Your Name");
        name=obj.nextLine();
        System.out.println("Enter Your Address");
        address=obj.nextLine();
    }
    public void displayData(){
        System.out.println("Roll Number : "+ rollNo);
        System.out.println("Name of Student : " + name);
        System.out.println("Address : "+ address);
    }
}
