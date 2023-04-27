package com.epam.workshops;

import java.util.Random;

public class CoffeeMaker {

    private final int MAX_COFFEE = 2000;
    private final int MAX_MILK = 1000;
    private final int MAX_COCOA = 2000;
    private final int MAX_WATER = 1500;

    Ingredient coffee;
    Ingredient water;
    Ingredient milk;
    Ingredient cocoa;

    public CoffeeMaker() {
        Random random = new Random();
        this.coffee = new Ingredient("Coffee", random.nextInt(MAX_COFFEE));
        this.water = new Ingredient("Water", random.nextInt(MAX_WATER));
        this.milk = new Ingredient("Milk", random.nextInt(MAX_MILK));
        this.cocoa = new Ingredient("Cocoa", random.nextInt(MAX_COCOA));
    }



    public void runCommand(String command) {
        if(command.equals("status")){
            runStatusCommand();
        } else if (command.equals("make coffee")){
            runCoffeeCommand();
        } else {
            System.out.println("Unknown command");
        }
    }

    private void runStatusCommand() {

        System.out.println("Coffee: " + (coffee.getAmount() * 100)/MAX_COFFEE + "% " + coffee.getAmount() +"g");
        System.out.println("Water: " + (water.getAmount() * 100)/MAX_WATER + "% " + water.getAmount() +"g");
        System.out.println("Milk: " + (milk.getAmount() * 100)/MAX_MILK + "% " + milk.getAmount() +"g");
        System.out.println("Cocoa: " + (cocoa.getAmount() * 100)/MAX_COCOA + "% " + cocoa.getAmount() +"g");

    }

    private void runCoffeeCommand() {
        System.out.println("Making coffee");
    }

    private void exitCommand() {
        System.out.println("Exiting");
    }


    private void grindCoffee(){

    }
    private void heatWater(){

    }

    private void pourWater(){

    }


}

