package oop;

public class Q4 {
    // Basic 3

    public static void main(String[] args) {
        Account1 a1=new Account1();
        a1.setAccountDetails(6554,"nirav",5000);
        a1.dispAccountDetails();
        a1.withdraw(6000);
        a1.deposit(2000);

    }
}
class Account1{
int accountNo;
String custName;
double accountBalance;

    public Account1() {}
    public void setAccountDetails(int accountNo,String custName,double accountBalance){
        this.accountNo = accountNo;
        this.custName=custName;
        this.accountBalance=accountBalance;

    }
    public void withdraw(int wAmmount){
        if (accountBalance>=wAmmount){
        accountBalance=accountBalance- wAmmount;
        System.out.println("After withdraw Current Balance is : "+accountBalance);
        }
        else{
            System.out.println("For withdraw Account Balance Not enough");
        }

    }
    public void deposit(int dAmmount){
        accountBalance=accountBalance+dAmmount;
        System.out.println("After Diposit Current Balance is : "+accountBalance);
    }
    public void dispAccountDetails(){
    System.out.println("Account Number is :"+accountNo);
        System.out.println("Customer name is : "+custName);
        System.out.println("Current Balance is : "+accountBalance);
    }
}
