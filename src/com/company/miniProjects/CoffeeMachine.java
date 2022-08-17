package com.company.miniProjects;

import java.util.Scanner;

public class CoffeeMachine {
/* In this project, you will work on programming a coffee machine simulator.
The machine works with typical products: coffee, milk, sugar, and plastic cups; if it runs out of something, it shows a notification.
You can get three types of coffee: espresso, cappuccino and latte.
Since nothing’s for free, it also collects the money.*/
static int haveMoney = 550;
    static int haveWater = 400;
    static int haveMilk = 540;
    static int haveBeans = 120;
    static int haveCups = 9;
    public static void main(String[] args) {
        MainMenu();
    }

    static void MainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String choise = scanner.nextLine();
        while (true){
            switch (choise){
                case "buy": BuyCoffee();break;
                case "fill" : FillCoffeeMachine();break;
                case "take" : TakeMoney();break;
                case "remaining": GetRemainingResources();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
                    MainMenu();
                    break;
            }
        }
    }
    static void BuyCoffee(){
        class TypesOfCoffe{
            void Espresso(){
                if (haveWater >= 250 && haveBeans >= 16 && haveCups >= 1) {
                    haveWater -= 250;
                    haveBeans -= 16;
                    haveCups -= 1;
                    haveMoney += 4;
                    System.out.println("I have enough resources, making you a coffee");
                }
                else if(haveWater < 250) {
                    System.out.println("Sorry, not enough water!");
                }
                else if(haveBeans < 16){
                    System.out.println("Sorry, not enough coffee beans!");
                }
                else if(haveCups < 1){
                    System.out.println("Sorry, not enough coffee cup!");
                }
            }
            void Latte(){
                if (haveWater >= 350 && haveBeans >= 20 && haveCups >= 1 && haveMilk >= 75) {
                    haveWater -= 350;
                    haveBeans -= 20;
                    haveMilk -= 75;
                    haveCups -= 1;
                    haveMoney += 7;
                    System.out.println("I have enough resources, making you a coffee");
                }
                else if(haveWater < 350) {
                    System.out.println("Sorry, not enough water!");
                }
                else if(haveBeans < 20){
                    System.out.println("Sorry, not enough coffee beans!");
                }
                else if(haveCups < 1){
                    System.out.println("Sorry, not enough  cup!");
                }
                else if (haveMilk < 75){
                    System.out.println("Sorry, not enough milk!");

                }

            }

            void Cappuccino(){
                if (haveWater >= 200 && haveBeans >= 12 && haveCups >= 1 && haveMilk >= 100) {
                    haveWater -= 200;
                    haveBeans -= 12;
                    haveMilk -= 100;
                    haveCups -= 1;
                    haveMoney += 6;
                    System.out.println("I have enough resources, making you a coffee");
                }
                else if(haveWater < 200) {
                    System.out.println("Sorry, not enough water!");
                }
                else if(haveBeans < 12){
                    System.out.println("Sorry, not enough coffee beans!");
                }

                else if(haveCups < 1){
                    System.out.println("Sorry, not enough  cup!");
                }
                else if (haveMilk < 100){
                    System.out.println("Sorry, not enough milk!");

                }

            }

        }

        Scanner scanner =  new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
        String choice = scanner.next();
        switch (choice){
            case "1": new TypesOfCoffe().Espresso();
                break;
            case "2": new TypesOfCoffe().Latte();
                break;
            case "3": new TypesOfCoffe().Cappuccino();
            case "back":
                break;
            default: System.out.println("Please enter an option from the above");
                break;
        }
        MainMenu();
    }

    static void TakeMoney(){
        System.out.println("I gave you $ " + haveMoney);
        haveMoney -= haveMoney;
        MainMenu();
    }
    static void FillCoffeeMachine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        int fillWater = scanner.nextInt();
        haveWater += fillWater;
        System.out.println("Write how many ml of milk you want to add: ");
        int fillMilk = scanner.nextInt();
        haveMilk += fillMilk;
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int fillBeans = scanner.nextInt();
        haveBeans += fillBeans;
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int fillCup = scanner.nextInt();
        haveCups += fillCup;
        MainMenu();
    }
    static void GetRemainingResources(){
        System.out.println("The coffee machine has:\n" + haveWater + " ml of water\n" + haveMilk + " ml of milk\n" + haveBeans + " g of coffee beans\n" + haveCups +" disposable cups\n" + haveMoney + " of money" );
        MainMenu();
    }
}
