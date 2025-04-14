package org.example;

public class ATM {
    private double balance;
    private double depositAmount;
    private double widthrawAmount;

    public ATM(){

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWidthrawAmount() {
        return widthrawAmount;
    }

    public void setWidthrawAmount(double widthrawAmount) {
        this.widthrawAmount = widthrawAmount;
    }
}
