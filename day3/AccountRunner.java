package com.idc.day3Patterns;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class AccountRunner {

BigDecimal balance= BigDecimal.valueOf(0);
    Scanner c=new Scanner(System.in);

    long max=1000000000l;
    long min=9999999999l;
    long accountNo=(long)Math.floor(Math.random()*(min-max+1)+min);
    public void createAccountClass1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Account type: ");
        String at=sc.nextLine();
        System.out.println("Email Address");
        String email= sc.nextLine();
        System.out.println("Enter your phone number");
        long no=sc.nextLong();
        System.out.println("if you want view your account details then enter 1. else enter any other number");
        int j = sc.nextInt();
        if (j==1) {
            System.out.println("**************** Account Details **************");
            System.out.println(" Your Name: " + name);
            System.out.println("your account No :"+accountNo);
            System.out.println(" Your Account Type:"+at);
            System.out.println("your email :"+email);
            System.out.println( "your phone number :"+no);
        }
    }
    public void depositAmount() {

        System.out.println(" Enter deposit amount:");

        BigDecimal amt=c.nextBigDecimal();

        if (amt.signum()==1) {

            balance =balance.add(amt);
            System.out.println("A/C Amount Credited by "+amt +" Total RS."+balance+" ");

        }else {
            System.out.println("enter positive amount number");
        }

    }

    public void withDrawal() {
        System.out.println("Enter withdrawal amount:");
      //  System.out.println(balance);
        BigDecimal amt=c.nextBigDecimal();
        if (amt.compareTo(balance)==1){
            System.out.println("insufficient balance");

        }else {
            if (amt.signum()==1){
                BigDecimal TotalAmount =balance.subtract(amt);
                System.out.println(" A/C Debited by "+amt+" Total Rs. "+ TotalAmount) ;
            }
            else {
                System.out.println("enter positive amount number");
            }
        }


    }

public  void login() {
    System.out.println("Enter Account Number ");
    System.out.println(accountNo);

    long acno = c.nextLong();
    boolean h = false;
    for (int m = 0; m < accountNo; m++) {
        if (acno == accountNo) {
            System.out.println("Enter 1.deposite  2.withdrwal  3.exit");
            int i = c.nextInt();
            switch (i) {
                case 1:
                    depositAmount();
                    h = true;
                    break;
                case 2:
                    withDrawal();
                    h = true;
                    break;
                case 3:
                    System.exit(0);
                    h = true;
                    break;
                default:
                    h = true;
                    System.out.println("Invaild Input pranali");

            }
        }
        if (h == false) {
            System.out.println("Invalid account number");
            System.exit(0);
        }
    }

}

}
