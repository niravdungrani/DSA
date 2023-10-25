package oop;

import java.util.Arrays;

public class Q5 {
    // Basic 4

    public static void main(String[] args) {
        Student1 s1=new Student1(1,"abc",30,40,60);
        Student1 s2=new Student1(2,"def",50,70,90);
        Student1 s3=new Student1(3,"ghi",70,70,60);
        Student1 s4=new Student1(4,"jkl",10,20,35);
        Student1 s5=new Student1(5,"mno",80,50,55);

        int [] total=new int [5];
        total[0]= s1.totalMarks;
        total[1]= s2.totalMarks;
        total[2]= s3.totalMarks;
        total[3]= s4.totalMarks;
        total[4]= s5.totalMarks;

        Student1.getTop3Student(total);

//        Arrays.sort(total);
//        System.out.println(Arrays.toString(total));
//        int max1= total[total.length-1];
//        int max2= total[total.length-2];
//        int max3= total[total.length-3];
//
//
//
//        System.out.println("1st student is : "+max1);
//        System.out.println("2nd student is : "+max2);
//        System.out.println("3rd student is : "+max3);

    }
}

class Student1{
    int rollNum;
    String studName;
    int marks1;
    int marks2;
    int marks3;
    int totalMarks;




    Student1(int rollNum, String studName,int marks1,int marks2,int marks3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        totalMarks=marks1+marks2+marks3;
    }

    public static void getTop3Student(int[] total) {
        Arrays.sort(total);
        System.out.println(Arrays.toString(total));
        int max1= total[total.length-1];
        int max2= total[total.length-2];
        int max3= total[total.length-3];
        System.out.println("1st student is : "+max1);
        System.out.println("2nd student is : "+max2);
        System.out.println("3rd student is : "+max3);

    }
}
