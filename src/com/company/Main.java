
package com.company;

import com.company.transaction.Transaction;
import com.company.users.User;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        List<User> users = new ArrayList<>();


        do {
            printMenu();

            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Iveskite savo varda:");
                    String name = sc.next();
                    System.out.println("Iveskite savo balansa:");
                    Double balance = sc.nextDouble();
                    User user = new User(name , balance);
                    users.add(user);
                    break;
                case 2:
                    System.out.println("Vartotoju sarasas: ");
                    printUsers(users);
                    break;
                case 3:
                    System.out.println("Esami vartotojai");
                    printUsers(users);
                    System.out.println("Iveskit indeksa");
                    int idx = sc.nextInt();
                    users.remove(idx);

                    break;

                case 4:
                    printUsers(users);
                    System.out.println("Iveskite sask numeri is kurio darysit pavedima");
                    String accoutnFrom = sc.next();
                    System.out.println("Iveskite sask numeri i kuri darysit pavedima");
                    String accountTo = sc.next();
                    System.out.println("Iveskite suma kuria norite pervesti");
                    double amount = sc.nextDouble();
                    User from = null;
                    User to = null;
                    for (User u: users){
                        if (u.getAccountNumber().equals(accoutnFrom)){
                            from = u;
                        }
                        if (u.getAccountNumber().equals(accountTo)){
                            to = u;
                        }
                    }
                    users.remove(from);
                    users.remove(to);
                    Transaction transaction = new Transaction(from, to,amount);

                    List<User> transactionUsers = transaction.execute();

                    users.addAll(transactionUsers);
break;
                case 5:
                    printUsers(users);
                    System.out.println("Iveskite banko saskaita i kuria norite inesti pinigus");
                    String addMoneyTo = sc.next();
                    System.out.println("Iveskite suma kiek norite inesti pinigu");
                    int howMuch = sc.nextInt();
                    for (User u: users){
                        if (u.getAccountNumber().equals(addMoneyTo)){
                            u.setBalance(u.getBalance()+howMuch);
                        }
                        }
                    break;
                case 0:
                    System.out.println("Baigiam darba");
                    break;
                default:
                    System.out.println("Bloga ivestis");

            }
        }while (choice != 0);
    }

        public static void printMenu () {
            System.out.println();
            System.out.println("1. Sukurti vartotoja");
            System.out.println("2. Perziureti vartotojus");
            System.out.println("3. Istrinti vartotoja");
            System.out.println("4. Pervesti pinigus");
            System.out.println("5. Inesti pinigu i saskaita");
            System.out.println("----------------------------");
            System.out.println("0. Iseisti");
        }

        public static void printUsers (List < User > users) {

            int i = 0;
            for (User u : users) {
                System.out.println(i + ". " + u.toString());
                i++;
            }
        }


    }








