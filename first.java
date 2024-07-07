/*Write a java program to take input as a command line argument. Your name,
course, universityrollno and semester. Display the information.
Name: UniversityRollNo:Course:
2
2
Java Programming Lab
Semester:*/

import java.util.*;

public class first{
    public static void main(String[] args) {
        String name=args[0];
        String university=args[1];
        int course=Integer.parseInt(args[2]);
        System.out.println("name of the student is"+name);
        System.out.println("unirsity"+university);
        System.out.println("course"+course);


    }
}