package com.company;

import java.sql.SQLOutput;

public class BankAccount {

    private String accountNum;
    private int balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public String invalidNumber = "11111111111";

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
    public String getAccountNum() {
        return this.accountNum;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return this.balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public void  setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    // Function to determine the balance after a deposit
    public void depositFunds(int depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    // Function to determine the balance after a withdrawal
    public void withdrawFunds(int withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("You havent got enough Money");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawl of " + withdrawalAmount + " processed. Remaining Balance = " + this.balance);
        }
    }
    //Checking the locale of a phone number
    public void phoneNumberLocation(String phoneNumber) {
        System.out.println("Enter a valid phone number to determine the registered location!");
        if (phoneNumber.contains("078")) {
            System.out.println("Your Phone is registered in the United Kingdom");
        } else {
            System.out.println("Your Phone is registered outside of the United Kingdom");
        }
    }
    //Validation for an entered phone number
    public void phoneNumberValidation(String phoneNumber) {
        if(phoneNumber.length() != 11) {
            System.out.println("The phone number you entered: " + phoneNumber + " is not valid. Please try again");
            phoneNumber = invalidNumber;
            System.out.println("The phone number: " + phoneNumber);
            System.out.println("Default Phone Number: " + invalidNumber);
        } else {
            System.out.println("You have Entered a valid Phone Number");
        }
    }
}
