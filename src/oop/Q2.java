package oop;

public class Q2 {
    // Basic 1
    public static void main(String[] args) {
        StudentDemo Student1=new StudentDemo();
        Student1.setStudDetails(1,"Nirav",85,95,65);
        Student1.calculateTotal();
        Student1.displayStudDetails();
    }
}
class Students{
    int rollNum;
    String studName;
    int marks1;
    int marks2;
    int marks3;
    int totalMarks;

    public void setStudDetails(int rollNum, String studName,int marks1,int marks2,int marks3){
        this.rollNum=rollNum;
        this.studName=studName;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    public int calculateTotal(){
        totalMarks=marks1+marks2+marks3;
        return totalMarks;
    }
public void displayStudDetails(){
    System.out.println("Roll Number is :"+rollNum);
    System.out.println("Student name is : "+studName);
    System.out.println("Total marks is : "+totalMarks);
}
}
class StudentDemo extends Students{}