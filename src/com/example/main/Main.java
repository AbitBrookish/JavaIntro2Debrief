package com.example.main;
// import statement for our BankAccount class
import com.example.bankaccount.BankAccount;
public class Main {
    /*
        Your main method here should create two instances of BankAccount
            one as a savings type
            one as a checkings type

        Call each method of each object instance to verify that they work as intended

        If you have extra time, check for invalid input as well (negative numbers, overdrafts, etc.)
            we do this to ensure that our class handles input as expected
            this means that it also has to handle invalid input appropriately
     */
    public static void main(String[] args) {
        BankAccount savings = new BankAccount("Alan", "savings", 56858494, 10000.00);
        BankAccount checking = new BankAccount("Jamilla", "checking", 9874733, 2.30);

//        tests
        System.out.println(savings.getName());
        System.out.println(savings.getAccountType());
        System.out.println(savings.withdraw(5000));
        System.out.println(savings.deposit(50.55));
        System.out.println("\n");
        System.out.println(savings.toString());

        System.out.println("\n");

        System.out.println(checking.getName());
        System.out.println(checking.getAccountType());
        System.out.println(checking.withdraw(5.50));
        System.out.println(checking.deposit(75));
        System.out.println("\n");
        System.out.println(checking.toString());
    }
}
