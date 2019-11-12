
package com.company;


import java.util.*;

public class Main {


    public static void main ( String[] args ) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map = new HashMap();
        map.put(2,"Pirmas");
        map.put(5,"Antras");
        map.put(19,"kazkoks");
        System.out.println(map);
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("kazkoks"));


        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println("Raktas yra :" + mentry.getKey());
            System.out.println("Reiksme yra :" + mentry.getValue());
            System.out.println("-----------------------------");
        }


       /* ArrayList<String> arrayList = new ArrayList<>();
        int pasirinktis = 0;
        do {
            System.out.println("1. Ivesti zodi");
            System.out.println("2. Rasti zodi");
            System.out.println("3. Trinti zodi");
            System.out.println("4. Isvalyti sarasa");
            System.out.println("5. Parodyti sarasa");
            System.out.println("6. Baigti programa");

            pasirinktis = sc.nextInt();

            switch (pasirinktis) {
                case 1:
                    System.out.println("Iveskite zodi");
                    String read = sc.next();
                    arrayList.add(read);
                    break;
                case 2:
                    int i = 0;
                    boolean flag = false;
                    System.out.println("Iveskite zodis kuri norite rasti");
                    String rasti = sc.next();
                         for (String zodis : arrayList) {
                             if (rasti.equals(zodis)) {
                                 System.out.println(zodis + " " + "Jo indeksas:" + (i + 1));
                             }
                             i++;
                             flag = true;
                         }
                             if(flag == false) {
                                 System.out.println("Tokio zodzio nera");
                             }
                                     break;
                case 3:
                    System.out.println(arrayList);
                    System.out.println("Iveskite indeksa zodzio kur norite istrinti");
                    int indexOf = sc.nextInt();
                    arrayList.remove(indexOf-1);
                    break;
                case 4:
                    arrayList.removeAll(arrayList);
                    System.out.println("Saras isvalytas");

                    break;

                case 5:
                    System.out.println(arrayList);
                    break;
                default:
                    System.out.println("Bloga ivestis");


            }

        } while (pasirinktis != 6);
*/





       /* Scanner sc = new Scanner(System.in);
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
            */
        }


    public static class Find {
    }
}








