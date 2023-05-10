package com.example.bankaccount;

public class BankAccount {
    /*
        RULES:
        1. No direct souts in our methods, only returns
        2. Do not allow for negative balances!

        Requirements:
            Instance fields(data type):
                balance(double)
                nameOnAccount(String)
                accountNumber(int)
                accountType(String)

            Class methods(return types):
                withdraw(boolean)
                deposit(boolean)
                constructor
                getters(field type)
                toString(String)
     */

    /*
        Instance field declarations should go here
        balance(double), nameOnAccount(String), accountNumber(int), accountType(String)
        These fields should not be able to be manipulated or access outside this class!
     */
//    Instance Fields
    private String nameOnAccount;
    private String accountType;
    private int accountNumber;
    private double balance;

    /*
        Constructor method should go here
        remember to take proper input for each instance field
        then, assign that input to the appropriate field
     */
    public BankAccount(String name, String account, int accountNumber, double balance){
        this.nameOnAccount = name;
        this.accountType = account;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    /*
        All your getter methods can go below
        The return type for your getter methods depends on which instance field you are getting!
     */
    public String getName(){
        return nameOnAccount;
    }

    public String getAccountType(){
        return accountType;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    /*
        Here you should write your withdraw method
        requirements:
            1. no negatives as input
            2. depending on accountType:
                calculate transaction fee of $1.50 (checking only)
            3. check balance, do not allow for overdrafting
            4. update balance
            5. return true if successful
                otherwise, return false
     */
    public boolean withdraw(double withdrawalAmount){
//        fee if account is checking
        double transactionFee = accountType.equalsIgnoreCase("checking")? 1.50 : 0;

//        no negative input/no overdrafting/check balance/update balance
        if(withdrawalAmount < 0 || withdrawalAmount > balance || transactionFee > balance) {
            System.out.println("Funds withdrawn: ");
            return false;
        } else {
            balance -= (withdrawalAmount + transactionFee);
            System.out.println("Funds withdrawn: " + withdrawalAmount);
            return true;
        }
    }

    /*
        Here you should write your deposit method
        requirements:
            1. no negatives as input
            3. update balance
            2. return true if successful
                otherwise, return false
     */
    public boolean deposit(double depositAmount){
        if(depositAmount < 0){
            System.out.println("Funds not deposited.");
            return false;
        } else {
            balance += depositAmount;
            System.out.println("Funds deposited: " + depositAmount);
            return true;
        }
    }

    /*
        Here you should write you toString method
        requirements:
            1. returns a String that represents all your instance field values
     */
    public String toString(){
        return "account name: " + nameOnAccount +
                "\naccount number: " + accountNumber +
                "\naccount type: " + accountType +
                "\nbalance: " + balance;
    }


}
