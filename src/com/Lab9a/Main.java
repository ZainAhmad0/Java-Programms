package com.Lab9a;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zain Ahmad (01-131192-037)");
        Show objShow = new Show();
//        Marks objMarks = new Marks();
//        Student objStudent = new Student();
        objShow.getData();
        objShow.inputMarks();
        System.out.println("Complete Record is Below");
        objShow.showRecord(); // here the Show record  function would be called from Show class
    }
}
