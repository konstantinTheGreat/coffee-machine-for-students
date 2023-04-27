package com.epam.workshops;

public class Ingredient {
  private final String name;
  private int amount;



    public Ingredient(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
