package com.lab9b;
import java.util.Scanner;

public class Main {
    private static Scanner obj=new Scanner(System.in);
    public static void main(String args[]){
        String nameOfEmployee;
        String employeeNumber;
        String university;
        String highDegree;
        String titleOfManager;
        int numberOfPubs;
        int golfDues;
        System.out.println("Zain Ahmad (01-131192-037)");
        System.out.println("Enter Data For Manager : 1");
        Manager objM = new Manager();
        Scientist objS[] = new Scientist[2]; // for scientist 1, and scientist 2
        Laborer objL = new Laborer();
        System.out.print("Enter Last Name : ");
        nameOfEmployee=obj.nextLine();
        System.out.print("Enter number : ");
        employeeNumber=obj.nextLine();
        System.out.print("Enter Title : ");
        titleOfManager=obj.nextLine();
        System.out.print("Enter golf club dues : ");
        golfDues=obj.nextInt();
        obj.nextLine();
        System.out.print("Enter name of school or university : ");
        university=obj.nextLine();
        System.out.print("Enter highest degree earned : ");
        highDegree=obj.nextLine();
        System.out.println("*******************");
        objM.setEmployeeName(nameOfEmployee);
        objM.setEmployeeNumber(employeeNumber);
        objM.setTitleOfManager(titleOfManager);
        objM.setGolfDues(golfDues);
        objM.setUniversity(university);
        objM.setHighestDegree(highDegree);
        // now the manager is all set
        for(int i=0; i<2; i++){
            System.out.println("Enter data for scientist : " + (i+1));
            System.out.print("Enter Last Name : ");
            nameOfEmployee=obj.nextLine();
            System.out.print("Enter number : ");
            employeeNumber=obj.nextLine();
            System.out.print("Enter number of pubs : ");
            numberOfPubs=obj.nextInt();
            obj.nextLine();
            System.out.print("Enter name of school or university : ");
            university=obj.nextLine();
            System.out.print("Enter highest degree earned : ");
            highDegree=obj.nextLine();
            objS[i]=new Scientist();
            objS[i].setEmployeeName(nameOfEmployee);
            objS[i].setEmployeeNumber(employeeNumber);
            objS[i].setUniversity(university);
            objS[i].setHighestDegree(highDegree);
            objS[i].setNumOfPubs(numberOfPubs);
            System.out.println("*******************");
        }
        System.out.println("Enter data for laborer : 1");
        System.out.print("Enter Last Name : ");
        nameOfEmployee=obj.nextLine();
        System.out.print("Enter number : ");
        employeeNumber=obj.nextLine();
        objL.setEmployeeName(nameOfEmployee);
        objL.setEmployeeNumber(employeeNumber);
        System.out.println("*******************");
        System.out.println("Data Of manager 1");
        System.out.println("Name : " + objM.getEmployeeName());
        System.out.println("Number : " + objM.getEmployeeNumber() );
        System.out.println("Title : " +  objM.getTitleOfManager());
        System.out.println("golf club dues : " + objM.getGolfDues());
        System.out.println("school or university : "+ objM.getUniversity());
        System.out.println("highest degree earned : " + objM.getHighestDegree());
        System.out.println("*******************");
        for(int i=0; i<2; i++){
            System.out.println("Data for scientist : " + (i+1));
            System.out.println("Name : " + objS[i].getEmployeeName());
            System.out.println("Enter number : " + objS[i].getEmployeeNumber());
            System.out.println("Number of pubs : " + objS[i].getNumOfPubs());
            System.out.println("School or university : " + objS[i].getUniversity());
            System.out.println("Highest degree earned : " + objS[i].getHighestDegree());
            System.out.println("*******************");
        }
        System.out.println("Data For Laborer : 1");
        System.out.println("Name : " + objL.getEmployeeName());
        System.out.println("Enter number : " + objL.getEmployeeNumber());



    }
}
