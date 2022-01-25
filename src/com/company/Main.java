package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome To Slice!!");
        int ch;
        List<String> ticket = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        boolean on = true;
        do {
            System.out.println("1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Display Ticket");
            System.out.println("4. Place Order");
            System.out.println("5. Quit");
            System.out.print("Enter Your Choice: ");
            ch = s.nextInt();
            switch(ch){
                case 1:
                    System.out.println("1. Cheese Pizza");
                    System.out.println("2. Pepperoni Pizza");
                    System.out.println("3. Cheese Sticks");
                    System.out.println("4. Cinnamon Sticks");
                    System.out.println("5. Wings");
                    System.out.println("6. Burger");
                    System.out.println("7. Hoagie");
                    System.out.println("8. Nachos");
                    System.out.println("What would you like to order?");
                    System.out.print("Item No. : ");
                    int item = s.nextInt();
                    switch(item){
                        case 1:
                            ticket.add("Cheese Pizza");
                            System.out.println("Your ticket has been updated!");
                            break;
                        case 2:
                            ticket.add("Pepperoni Pizza");
                            System.out.println("Your ticket has been updated!");
                            break;
                        case 3:
                            ticket.add("Cheese Sticks");
                            System.out.println("Your ticket has been updated!");
                            break;
                        case 4:
                            ticket.add("Cinnamon Sticks");
                            System.out.println("Your ticket has been updated!");
                            break;
                        case 5:
                            ticket.add("Wings");
                            System.out.println("Your ticket has been updated!");
                            break;
                        case 6:
                            ticket.add("Burger");
                            System.out.println("Your ticket has been updated!");
                            break;
                        case 7:
                            ticket.add("Hoagie");
                            System.out.println("Your ticket has been updated!");
                            break;
                        case 8:
                            ticket.add("Nachos");
                            System.out.println("Your ticket has been updated!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("-------------------");
                    Iterator i = ticket.iterator();
                    int x = 1;
                    while (i.hasNext()){
                        Object e = i.next();
                        System.out.println(x + ": " + e);
                        x++;
                        System.out.println("-------------------");
                    }
                    System.out.println("What item would you like to delete?");
                    item = s.nextInt();
                    System.out.println("Are you sure you want to delete this item?");
                    System.out.print("[Y/N] : ");
                    String confirm = n.nextLine();
                    if (confirm.toUpperCase().equals("Y")){
                        ticket.remove(item - 1);
                        System.out.println("Your ticket has been updated!");
                    }
                    break;
                case 3:
                    System.out.println("-------------------");
                    if (ticket.isEmpty()){
                        System.out.println("Your ticket is empty!");
                        System.out.println("-------------------");
                    } else {
                        System.out.println("Your Ticket : ");
                        i = ticket.iterator();
                        x = 1;
                        while (i.hasNext()) {
                            Object e = i.next();
                            System.out.println(x + ": " + e);
                            x++;
                            System.out.println("-------------------");

                        }
                    }
                    break;
                case 4:
                    System.out.println("-------------------");
                    if (ticket.isEmpty()){
                        System.out.println("Your ticket is empty!");
                        System.out.println("-------------------");
                    } else {
                        System.out.println("Your Ticket : ");
                        i = ticket.iterator();
                        x = 1;
                        while (i.hasNext()) {
                            Object e = i.next();
                            System.out.println(x + ": " + e);
                            x++;
                            System.out.println("-------------------");
                        }
                        System.out.println("Are you sure you want to place your order?");
                        System.out.print("[Y/N] : ");
                        confirm = n.nextLine();
                        if (confirm.toUpperCase().equals("Y")) {
                            ticket.clear();
                            System.out.println("Your order has been placed!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Are you sure you want to quit?");
                    System.out.println("(Any items on your current ticket will be discarded.)");
                    System.out.print("[Y/N] : ");
                    confirm = n.nextLine();
                    if (confirm.toUpperCase().equals("Y")) {
                        System.out.print("Thank you for ordering with Slice! We hope you come back soon!");
                        on = false;
                    }
                    break;
            }
        } while (on);
    }
}
