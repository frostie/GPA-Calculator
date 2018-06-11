package com.PhilMarcoccia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        letterGradeConverter("Course 1", 90);
        letterGradeConverter("Course 2", 85);
        letterGradeConverter("Course 3", 76);
        letterGradeConverter("Course 4", 70);
        letterGradeConverter("Course 5", 67);
        letterGradeConverter("Course 6", 62);
        letterGradeConverter("Course 7", 57);
        letterGradeConverter("Course 8", 53);
        letterGradeConverter("Course 9", 49);

        gpaConverter(67.66);
    }

    private static double letterGradeConverter(String subjectName, double studentGrade) {

        if(studentGrade >= 90 && studentGrade <= 100) {
            System.out.println(studentGrade + "% (A+) in " + subjectName);
        }
        else if(studentGrade >=85 && studentGrade <= 89) {
            System.out.println(studentGrade + "% (A) in " + subjectName);
        }
        else if(studentGrade >= 80 && studentGrade <= 84) {
            System.out.println(studentGrade + "% (A-) in " + subjectName);
        }
        else if(studentGrade >= 77 && studentGrade <= 79) {
            System.out.println(studentGrade + "% (B+) in " + subjectName);
        }
        else if(studentGrade >= 73 && studentGrade <= 76) {
            System.out.println(studentGrade + "% (B) in " + subjectName);
        }
        else if(studentGrade >= 70 && studentGrade <= 72) {
            System.out.println(studentGrade + "% (B-) in " + subjectName);
        }
        else if(studentGrade >= 67 && studentGrade <= 69) {
            System.out.println(studentGrade + "% (C+) in " + subjectName);
        }
        else if(studentGrade >= 63 && studentGrade <= 66) {
            System.out.println(studentGrade + "% (C) in " + subjectName);
        }
        else if(studentGrade >= 60 && studentGrade <= 62) {
            System.out.println(studentGrade + "% (C-) in " + subjectName);
        }
        else if(studentGrade >= 60 && studentGrade <= 62) {
            System.out.println(studentGrade + "% (C-) in " + subjectName);
        }
        else if(studentGrade >= 57 && studentGrade <= 59) {
            System.out.println(studentGrade + "% (D+) in " + subjectName);
        }
        else if(studentGrade >= 53 && studentGrade <= 56) {
            System.out.println(studentGrade + "% (D) in " + subjectName);
        }
        else if(studentGrade >= 50 && studentGrade <= 52) {
            System.out.println(studentGrade + "% (D-) in " + subjectName);
        }
        else if(studentGrade >= 0 && studentGrade <= 49) {
            System.out.println(studentGrade + "% (F) in " + subjectName);
        }
        // System.out.println(studentGrade * 0.04 / 100);

        return studentGrade;
    }

    public static double gpaConverter(double studentAvg) {

        System.out.println("Grade average " + studentAvg);
        return studentAvg;
    }
}
