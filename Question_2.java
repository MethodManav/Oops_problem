// Design a class BankAccount with the following specification :

// Attributes :

// accountNumber (string) : Represents the account number of the user's account
// balance (double) : Represents the balance of the account
// Constructor :

// Implement a parameterised constructor to have the accountNmber and balance initialised while creating the object.
// Methods :

// deposit (double amount) : It adds the amount to the balance of the user's account.
// withdraw (double amount) : It deduct the money (amount) from the balance. If the balance is insufficient then print "Insufficient funds!" and do not change the original amount.
// displayDetails() : It diplays th accuntNumber and balance of the account.

class BankAccount {
  private String accountNumber;
  private double balance;

  BankAccount(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  void deposit(double amount) {
    this.balance += amount;
  }

  void withdraw(double amount) {
      if (amount > this.balance) {
            System.out.println("Insufficient funds!");
        } else {
            this.balance -= amount;
        }
  }

  void displayDetails() {
    System.out.println("Account Number : " + this.accountNumber);
    System.out.println("Balance : " + this.balance);
  }
}