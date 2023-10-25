package oop;

public class Q3 {
    // Basic 2

    public static void main(String[] args) {
            Account acc1=new Account(56554,"nirav",1000);
            acc1.calculateInterest();
            acc1.displayAccountDetails();

    }
}
class Account{
    int accountNumber;
    String custName;
    double balance;
    static double interestRate=5;
    Account(int accountNumber,String custName,double balance){
        this.accountNumber=accountNumber;
        this.custName=custName;
        this.balance=balance;
    }
    public void calculateInterest(){
        balance=balance+((balance*interestRate)/100);
    }
    public void displayAccountDetails(){
        System.out.println("Account Number is :"+accountNumber);
        System.out.println("Customer name is : "+custName);
        System.out.println("Intrest rate is :"+interestRate);
        System.out.println("Balance with intrest : "+balance);
    }
}
