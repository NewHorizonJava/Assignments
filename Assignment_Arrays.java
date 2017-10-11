package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.lang.Object;
import java.util.Comparator;

class Student {
    int studentMarks;
    String studentNames;

    // Constructor
    public Student(String studentNames, int studentMarks) {
        this.studentNames = studentNames;
        this.studentMarks = studentMarks;
    }

    // Constructor Printer
    public  String toString() {
        return "Student Name: " + this.studentNames + " Mark: " + this.studentMarks;
    }
}

class SortByMark implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.studentMarks - b.studentMarks;
    }
}

public class Main {

    public static void main(String[] args) {

        /* DECLARATIONS */
        double totalMarks;
        double averageMarks;
        int noOfNames;
        int noOfMarks;
        int highestMark;
        int lowestMark;
        char grade;


        // Student marks
        //int[] studentMark = new int [100];
        Integer[] studentMark = {23, 43, 67, 96, 76, 43, 54, 96, 02, 05, 96, 93, 56, 65, 23, 64, 43, 23, 65, 87,
                99, 34, 32, 64, 34, 54, 67, 43, 56, 22, 56, 76, 42, 67, 06, 43, 22, 56, 32, 22,
                43, 34, 34, 67, 75, 32, 46, 75, 32, 21, 56, 67, 43, 23, 67, 75, 33, 22, 67, 43,
                43, 34, 22, 53, 24, 67, 87, 32, 65, 87, 43, 64, 79, 32, 23, 54, 22, 56, 32, 56,
                67, 98, 56, 87, 98, 34, 98, 12, 67, 87, 12, 45, 76, 87, 45, 34, 65, 23, 54, 56
        };
        noOfMarks = studentMark.length;
        //System.out.println("Number of Marks = " + noOfMarks);

        // Student names
        String[] studentNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
                "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark",
                "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill",
                "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell", "Perez", "Roberts", "Turner",
                "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed",
                "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres",
                "Peterson", "Gray", "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes",
                "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores", "Washington",
                "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz", "Hayes"
        };
        noOfNames = studentNames.length;
        //System.out.println("Number of Names = " + noOfNames);

        // Using constructor to declare student details

        Student[] studentArray = {new Student("Michael", 12),
                            new Student("Shehu", 98),
                            new Student("Elright", 45)};
        /* CALCULATIONS */
        // Total Marks
        totalMarks = 0;
        for (int i = 0; i <= 99; i++) {
            totalMarks = totalMarks + studentMark[i];
        }


        //  Average Marks
        averageMarks = totalMarks / noOfMarks;


        /* PRINT STATEMENTS */
        System.out.println("New Horizon International School");
        System.out.println("Number of Students: " + noOfNames);
        System.out.println("======================================");

        for (int j = 0; j <= 99; j++) {
            if (studentMark[j] >= 75 && studentMark[j] <= 99) {
                System.out.println("Student " + studentNames[j] + ": " + studentMark[j] + " = A");
            } else if (studentMark[j] >= 60 && studentMark[j] <= 69) {
                System.out.println("Student " + studentNames[j] + ": " + studentMark[j] + " = B");
            } else if (studentMark[j] >= 50 && studentMark[j] <= 59) {
                System.out.println("Student " + studentNames[j] + ": " + studentMark[j] + " = C");
            } else if (studentMark[j] >= 40 && studentMark[j] <= 49) {
                System.out.println("Student " + studentNames[j] + ": " + studentMark[j] + " = D");
            } else if (studentMark[j] >= 0 && studentMark[j] <= 40) {
                System.out.println("Student " + studentNames[j] + ": " + studentMark[j] + " = F");
            } else {

            }
        }
        System.out.println("======================================");

        System.out.println("The Average Mark of the Class is " + averageMarks);
        //Sorting Marks in ascending order
        Arrays.sort(studentMark);
        System.out.println("The Highest Mark in the Class is " + studentMark[99]);
        System.out.println("The Lowest Mark in the Class is " + studentMark[0]);
        System.out.println("The sum of all maks in class is " + totalMarks);
        System.out.println("");
        System.out.println("======================================");

        System.out.println("Sorted Marks");
        System.out.println("======================================");
        for (int i = 0; i <= 99; i++) {
            System.out.println(studentMark[i]);
        }

        //sorting Names in ascending order
        Arrays.sort(studentNames);
        System.out.println("");
        System.out.println("======================================");
        System.out.println("Sorted Names");
        System.out.println("======================================");
        for (int i = 0; i <= 99; i++) {
            System.out.println(studentNames[i]);
        }

        System.out.println("======================================");
        for (int i = 0; i <= 2; i++) {
            System.out.println(studentArray[i]);
        }
    }
}
