package Day2.OOP_homework.day2.problem5;

import Day2.OOP_homework.day2.problem1.BankAccount;

//Extend the BankAccount class from exercise 1 to include a subclass SavingsAccount.
// Implement additional features
// such as interest calculation and withdrawal limits specific to savings accounts.


public class SavingAccount extends BankAccount {
    double rate;
    double principalAmount;
    int time;
    double withdrawLimit;
    public double calculateInterest(){
        return principalAmount* Math.pow((1+rate/100),time);

    }
    @Override
    public void withdraw(double amount){
        if(amount>withdrawLimit){
            System.out.println("Withdraw limit extends");
        }
        else{
            super.withdraw(amount);
        }

    }
}
