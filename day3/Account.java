package com.idc.day3Patterns;

import java.util.ArrayList;
import java.util.Scanner;

public class Account extends  AccountRunner{

    public static void main(String[] args) {
        int i;
        AccountRunner ac = new AccountRunner();
        Scanner as = new Scanner(System.in);
        System.out.println("Welcome to AXIS Bank");
        System.out.println("Enter 1.open Account    2.login  ");
        i = as.nextInt();
        if (i == 1) {
            ac.createAccountClass1();
        } else if (i == 2) {
            ac.login();
        } else {
            System.out.println("Invalid Input Choice");
        }

    }
}




