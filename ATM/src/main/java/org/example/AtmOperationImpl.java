package org.example;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperation{
   ATM atm = new ATM();
   Map<Double,String> miniStatement = new HashMap<>();
    public void viewBalance(){
        System.out.println("Available Balance is:"+atm.getBalance());
    }
    public void withdrawAmount(double withdrawAmount){
        if(withdrawAmount<= atm.getBalance()){
            miniStatement.put(withdrawAmount,"Amount Withdraw");
            System.out.println("Collect the cash "+withdrawAmount);

            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewBalance();
        }else{
            System.out.println("Insufficient Balance");
        }

    }
    public void depositAmount(double depositAmount){
        miniStatement.put(depositAmount,"Amount Deposited");
        System.out.println(depositAmount+"Deposited successfully");
         atm.setBalance(atm.getBalance()+depositAmount);
         viewBalance();
    }
    public void viewMiniStatement(){
   for(Map.Entry<Double,String> m :miniStatement.entrySet()){
       System.out.println(m.getKey()+""+m.getValue());
   }
    }

}


