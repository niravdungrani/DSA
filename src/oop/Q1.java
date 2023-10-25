package oop;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.UserInput();
        s1.Show();
        s1.TotalStudents();
        s1.TotalMarks();
        s1.getHighest();
        s1.getLowest();
        s1.getAverage();
        System.out.println("passed in subject : "+s1.getPassCount());

    }
}

class Student {
    Scanner sc = new Scanner(System.in);
    static int uniqueNumber = 0;
    int rollNo;
    String name;
    int[] marks = new int[5];

    public void UserInput() {
        System.out.println("Student name : ");
        name = sc.nextLine();
        System.out.println("Enter your marks : ");

        for (int p = 0; p < marks.length; p++) {
            marks[p] = sc.nextInt();
        }
    }

    public Student() {
        this.rollNo = ++uniqueNumber;
        this.name = " ";
    }



    public void Show() {
        System.out.println("RollNumber :" + rollNo);
        System.out.println("Name :" + name);
        System.out.print("Mark :");
        for (int k = 0; k < marks.length; k++) {
            System.out.print(marks[k] + ",");
        }
        System.out.println();
    }

    public void TotalStudents() {
        System.out.println("Total Student is: " + uniqueNumber);
    }

    int sum = 0;
    public void TotalMarks() {
        for (int m : marks) {
            sum += m;
        }
        System.out.println("Total Marks is : " + sum);
    }

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    public void getHighest() {
        for (int q : marks) {
            if (max < q) {
                max = q;
            }
            if (min > q) {
                min = q;
            }
        }
        System.out.println("Highest Mark is :" + max);
    }

    public void getLowest() {
        System.out.println("Lowest Mark is :" + min);
    }

    int avg = 0;

    public void getAverage() {
        for (int q : marks) {
            avg += q;
        }
        System.out.println("Average Mark is :" + avg / marks.length);
    }

    public int getPassCount() {
        int subjects=0;
        for (int i=0;i<this.marks.length;i++){
            if (this.marks[i]>=50){
                subjects=subjects+1;
            }
        }
        return subjects;
    }


}
