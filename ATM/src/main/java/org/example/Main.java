package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AtmOperation op = new AtmOperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        System.out.println("Welcome to Atm Machine");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Atm number");
        int atmNumber=in.nextInt();
        System.out.println("Enter the pin");
        int pin= in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin))
        {
            System.out.println("validation done");
            while(true){
                System.out.println("1.View available balance\n2.Widthraw Amount \n3.Deposit Amount \n4.View ministatements \n5.Exit");
                System.out.println("Enter the choice");
                int ch = in.nextInt();
                if(ch==1){
                   op.viewBalance();
                } else if (ch==2) {
                    System.out.println("Enter amount to withdraw");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch==3) {
                    System.out.println("Enter amount you want to deposit:");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (ch==4) {
                    op.viewMiniStatement();
                } else if (ch==5) {
                    System.out.println("collect your atm card \n Thankyou");
                    System.exit(0);
                }else{
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number pin");
            System.exit(0);
        }
    }
}