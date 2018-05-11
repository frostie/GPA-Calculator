package com.PhilMarcoccia;

public class Main {

    public static void main(String[] args) {

        gpaConverter("Phil", 75);
        gpaConverter("Nikita", 82);
        gpaConverter("Frank", 96);

    }

    private static int gpaConverter(String studentName, int studentGrade) {

        if(studentGrade >= 75 && studentGrade <= 79) {
            System.out.println(studentName + " earned " + studentGrade + "% (B+)");
        }
        else if(studentGrade >=80 && studentGrade <= 89) {
                System.out.println(studentName + " earned " + studentGrade + "% (A)");
        }
        else if(studentGrade >=90 && studentGrade <= 100) {
            System.out.println(studentName + " earned " + studentGrade + "% (A+)");
        }
        return studentGrade;
    }
}
