package com.PhilMarcoccia;

public class Main {

    public static void main(String[] args) {

        letterGradeConverter("Biology", 75);
        letterGradeConverter("Computer Science", 82);
        letterGradeConverter("Physics", 96);
        letterGradeConverter("Mathematics", 67);
        letterGradeConverter("English", 54);
        letterGradeConverter("Geography", 62);
        letterGradeConverter("Fashion", 71);
        letterGradeConverter("Software Engineering", 99);
        letterGradeConverter("Biology", 85);
        letterGradeConverter("Civics", 67);
        letterGradeConverter("Painting", 49);
    }

    private static int letterGradeConverter(String subjectName, int studentGrade) {

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
        return studentGrade;

    }
}
