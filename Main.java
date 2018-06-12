package com.PhilMarcoccia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Thanks for using the GPA Calculator! Enter a course name below: ");

        boolean hasNextLine = scanner.hasNextLine();

        while (hasNextLine) {
            String course1 = scanner.nextLine();

            System.out.println("Enter grade for " + course1);
            int grade1 = scanner.nextInt();

            if(grade1 >= 90 && grade1 <= 100) {
                System.out.println(grade1 + "% (A+) in " + course1);
            }
            else if(grade1 >=85 && grade1 <= 89) {
                System.out.println(grade1 + "% (A) in " + course1);
            }
            else if(grade1 >= 80 && grade1 <= 84) {
                System.out.println(grade1 + "% (A-) in " + course1);
            }
            else if(grade1 >= 77 && grade1 <= 79) {
                System.out.println(grade1 + "% (B+) in " + course1);
            }
            else if(grade1 >= 73 && grade1 <= 76) {
                System.out.println(grade1 + "% (B) in " + course1);
            }
            else if(grade1 >= 70 && grade1 <= 72) {
                System.out.println(grade1 + "% (B-) in " + course1);
            }
            else if(grade1 >= 67 && grade1 <= 69) {
                System.out.println(grade1 + "% (C+) in " + course1);
            }
            else if(grade1 >= 63 && grade1 <= 66) {
                System.out.println(grade1 + "% (C) in " + course1);
            }
            else if(grade1 >= 60 && grade1 <= 62) {
                System.out.println(grade1 + "% (C-) in " + course1);
            }
            else if(grade1 >= 60 && grade1 <= 62) {
                System.out.println(grade1 + "% (C-) in " + course1);
            }
            else if(grade1 >= 57 && grade1 <= 59) {
                System.out.println(grade1 + "% (D+) in " + course1);
            }
            else if(grade1 >= 53 && grade1 <= 56) {
                System.out.println(grade1 + "% (D) in " + course1);
            }
            else if(grade1 >= 50 && grade1 <= 52) {
                System.out.println(grade1 + "% (D-) in " + course1);
            }
            else if(grade1 >= 0 && grade1 <= 49) {
                System.out.println(grade1 + "% (F) in " + course1);
            }

            scanner.nextLine();

        }
    }
}
