package com.Lab9a;
import java.util.Scanner;

public class Marks extends Student {
    private float totalMarks;
    private float marksOfSubjects[] = new float[3];
    private float avgMarks;
    private Scanner scanner=new Scanner(System.in);

    public Marks() {
        super();
        totalMarks=0;
        avgMarks=0;
    }

    public void inputMarks()
    {
        for(int i=0; i<3; i++) {
            System.out.print("Enter Marks in Subject "+(i+1) + " : ");
            marksOfSubjects[i]=scanner.nextFloat();
            totalMarks+=marksOfSubjects[i];
        }
    }
    public void dispMarks()
    {
        for(int i=0; i<3; i++) {
            System.out.println("Marks in Subject "+(i+1) + " : " + marksOfSubjects[i]);
        }
        System.out.println("Total Marks Are : " + totalMarks);
        avgMarks=totalMarks/3;
        System.out.println("Average marks are : " + (avgMarks));
    }


}
