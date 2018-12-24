package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      BankAccount Barry = new BankAccount();

      // Initiates a new Scanner for inputting data
      Scanner scanner = new Scanner(System.in);

      // Entering the customers name
      System.out.println("Enter your Name: ");
      Barry.setCustomerName(scanner.next());
      System.out.println("Your Customer Name is: " + Barry.getCustomerName());

      // Entering the customers phone number
      System.out.println("Enter your phone number: ");
      Barry.setPhoneNumber(scanner.next());
      System.out.println("Your phone number is: " + Barry.getPhoneNumber());

      // Entering the customers email address
      System.out.println("Enter your email address: ");
      Barry.setEmailAddress(scanner.next());
      System.out.println("Your email address is: " + Barry.getEmailAddress());

      // Entering the customers account number
      System.out.println("Enter your account number: ");
      Barry.setAccountNum(scanner.next());
      System.out.println("Your account number is: " + Barry.getAccountNum());

      // Entering the customers initial balance
      System.out.println("Enter your initial account balance: ");
      Barry.setBalance(Integer.parseInt(scanner.next()));
      System.out.println("Your initial balance is: " + Barry.getBalance());
    }
}
