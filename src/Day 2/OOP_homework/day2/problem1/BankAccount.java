package OOP_homework.day2.problem1;

//Create a class BankAccount with private attributes account_number, balance, and account_type.
// Provide public methods to deposit, withdraw, and check balance.
// Ensure that withdrawals cannot exceed the available balance.




public class BankAccount {
    private int accountNumber;
    private  double balance;
    private String accountType;

    public void deposit(double money){
        this.balance = this.balance + money;
    }
    public void withdraw(double money){
        if(this.balance >= money){
            this.balance = this.balance - money;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public String getBalance(){
        return String.format("%.2f", this.balance);    // can you explain this syntax in the brackets?
    }
}
