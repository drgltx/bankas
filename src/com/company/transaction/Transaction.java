package com.company.transaction;

import com.company.users.User;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private User from;
    private User to;
    private double amount;


    public Transaction ( User from , User to , double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public boolean isValid(){

        return to != null && from != null && from.getBalance() >= amount;
        }

     public List<User> execute(){
         List<User> transactionUsers = new ArrayList<>();

         if (isValid()) {
            from.setBalance(from.getBalance() - amount);
            to.setBalance(from.getBalance() + amount);
        }else{
             System.out.println("ERROR");
         }
         transactionUsers.add(from);
         transactionUsers.add(to);
        return transactionUsers;
        }

        }





